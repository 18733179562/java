package homework1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;

import javax.xml.crypto.Data;

public class Record {
	private String membereName;  //借阅人姓名
	private String bookName;     //商品名称
	private String condition;     //是否归还
	
	private Date time;
	Date date = new Date();
	
	public Record(String membereName, String bookName, String condition) {
		this.membereName = membereName;
		this.bookName = bookName;
		this.condition = condition;
		this.time = date;
	}

	public Record() {
		
	}
	
	public String getMembereName() {
		return membereName;
	}

	public void setMembereName(String membereName) {
		this.membereName = membereName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public Date getTime() {
		return time;
	}
	
	public void setTime() {
		this.time = date;
	}
	
	public void writeData(Record str){    //传过来每一行要存的内容，内容是带#的
		try {
			Writer writer = new FileWriter(new File("D:\\record.txt"));
			writer.write(str + "\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		FileWriter fw = null;
//		try {
//			File f=new File("D:\\record.txt");
//			fw = new FileWriter(f, true);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		PrintWriter pw = new PrintWriter(fw);
//		pw.println(str.toString());
//		pw.flush();
//		try {
//			fw.flush();
//			pw.close();
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public String toString() {
		return "#借阅人姓名：" + getMembereName()  + " #商品名称：" + getBookName() + " #借阅时间：" + getTime() + " #是否归还：" + getCondition();
	}
	
}
