package homework1;

import java.util.Scanner;

public class Book extends Commoditv {
	private String author;
	private String ISBN;
	Scanner cin = new Scanner(System.in);
	
	public Book() {
		
	}
	
	public Book(String id, String name, String number, String author, String ISBN) {
		super(id, name, number);
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String toString() {
		return "#ͼ���ţ�" + getId() + "  #ͼ�����ƣ�" + getName() + "  #ͼ��������" + getNumber() + "#���ߣ�" + getAuthor() 
				+ "  #ISBN�ţ�" + getISBN();
	}
	
	public void change(String str) {
		String[] arr = str.split("#");
		String[] brr = arr[3].split("��");   //�ָ�ͼ������
		String[] crr = brr[1].split(" ");
		this.setId(arr[1]);
		this.setName(arr[2]);
		this.setNumber(crr[0]);
		this.setAuthor(arr[4]);
		this.setISBN(arr[5]);
	}

}
