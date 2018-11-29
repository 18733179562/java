package homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RecordManagement{
	private Member[] member = new Member[100];
	private Commoditv[] product = new Commoditv[100];
	private Record[] record = new Record[100];
	
	public RecordManagement() {
		
	}
	
	public RecordManagement(Member[] member, Commoditv[] product, Record[] record) {
		this.member = member;
		this.product = product;
		this.record = record;
	}
	
	public Member[] getMember() {
		return member;
	}

	public void setMember(Member[] member) {
		this.member = member;
	}

	public Commoditv[] getProduct() {
		return product;
	}

	public void setProduct(Commoditv[] product) {
		this.product = product;
	}

	public Record[] getRecord() {
		return record;
	}

	public void setRecord(Record[] record) {
		this.record = record;
	}
	
	public void initalM(Member[] mem ) {
		for(int i = 0; i < mem.length;i++) {
			mem[i] = new Member();
		}
		File file=new File("D:\\member.txt");    
		if(!file.exists())    
		{    
		    try {    
		        file.createNewFile();    
		    } catch (IOException e) {    
		        // TODO Auto-generated catch block    
		        e.printStackTrace();    
		    }    
		}
		for(int i = 0; i < mem.length; i++) {
			int count = 0;
			try {
				FileReader fileReader = new FileReader("D:\\member.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String str = null; 
				while ((str = bufferedReader.readLine()) != null) {
					if(i == count++) {
						String[] arr = str.split("#"); 
						String[] name = arr[2].split("：");
						mem[i].setId(arr[1]);
						mem[i].setName(name[1]);
						mem[i].setTel(arr[3]);
						
					}
				}
				bufferedReader.close();
				fileReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void initalP(Commoditv[] com) {
		File file = new File("D:\\product.txt");
		if(!file.exists())    
		{    
		    try {    
		        file.createNewFile();    
		    } catch (IOException e) {    
		        // TODO Auto-generated catch block    
		        e.printStackTrace();    
		    }    
		}
		try {
			int i = 0;
			if(!file.exists()) {    // 文件不存在情况
				file.exists();
			}
			FileReader fileReader = new FileReader("D:\\product.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String str;
			while ((str = bufferedReader.readLine()) != null) {
				String[] arr = str.split("#");
				if(arr[1].contains("DVD")) {
					com[i] = new DVD();
					com[i].change(str);
				}
				if(arr[1].contains("图书")) {
					com[i] = new Book();
					com[i].change(str);
				}
				i++;
			}
			bufferedReader.close();
			fileReader.close();
			
		} catch (IOException e) {  
			e.printStackTrace();
		}
	}

	public void initR(Record[] rec) {   //初始化
		for(int i = 0; i < rec.length;i++) {
			rec[i] = new Record();
		}
		File file=new File("D:\\record.txt");    
		if(!file.exists())    
		{    
		    try {    
		        file.createNewFile();    
		    } catch (IOException e) {    
		        // TODO Auto-generated catch block    
		        e.printStackTrace();    
		    }    
		}
		for(int i = 0; i < rec.length; i++) {
			int count = 0;
			try {
				FileReader fileReader = new FileReader("D:\\record.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String str = null;
				while ((str = bufferedReader.readLine()) != null) {
					String[] arr = str.split("#");
//					for(int j = 0; j < arr.length;j++) {
//						System.out.println(j+ "="+arr[j]);
//					}
					String[] p = arr[1].split("：");
					String[] b = arr[2].split("：");
					String[] f = arr[4].split("：");
 					
					rec[i].setCondition(f[1]);
					rec[i].setMembereName(p[1]);
					rec[i].setBookName(b[1]);
					rec[i].setTime();
				}
				bufferedReader.close();
				fileReader.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void savefile(Commoditv[] com, Member[] mem, Record[] rec) {
		for(int i = 0; i < com.length; i++) {
			if(com[i] != null) {
				CommoditvFix cf = new CommoditvFix();
				cf.writeData(com[i]);
			}
		}
		for(int i = 0; i < mem.length; i++) {
			if(mem[i].getId() != null) {
				MemberFix mf = new MemberFix();
				mf.writeData(mem[i]);
			}
		}
		for(int i = 0; i < rec.length; i++) {
			if(rec[i].getBookName() != null) {
				rec[i].writeData(rec[i]);
			}
		}
			
	}

}
