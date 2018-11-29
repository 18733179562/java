package homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class CommoditvFix extends RecordManagement {
	public void writeData(Commoditv co){    //传过来每一行要存的内容，内容是带#的
		
		try {
			Writer writer = new FileWriter(new File("D:\\product.txt"));
			writer.write(co + "\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		FileWriter fw = null;
//		try {
//			File f=new File("D:\\product.txt");
//			fw = new FileWriter(f, true);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		PrintWriter pw = new PrintWriter(fw);
//		pw.println(co);
//		pw.flush();
//		try {
//			fw.flush();
//			pw.close();
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
