package homework1;

public class Commoditv {
	private String id;
	private String name;
	private String number;   //¼ÇÂ¼ÊýÁ¿
	
	public Commoditv() {
		
	}
	
	public Commoditv(String id, String name, String number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Commoditv [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	public void change(String str) {
		String arr[] = str.split("#");
		this.setName(arr[0]);
		this.setId(arr[1]);
		this.setNumber(arr[2]);
	}
	
	public String save() {
		return " ";
	}

}
