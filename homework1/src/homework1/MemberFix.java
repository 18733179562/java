package homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class MemberFix extends RecordManagement{
	
	
	public void writeData(Member str){    //������ÿһ��Ҫ������ݣ������Ǵ�#��
		try {
			Writer writer = new FileWriter(new File("D:\\member.txt"));
			writer.write(str + "\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void print() {
		File file = new File("D:\\member.txt");
		try {
			if(!file.exists()) {    // �ļ����������
				file.exists();
			}
			FileReader fileReader = new FileReader("D:\\member.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String str;
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {  
			e.printStackTrace();
		}
	}
}
