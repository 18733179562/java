package homework1;

public class DVD extends Commoditv {
	private String ISRC;
	
	public DVD() {
		
	}
	
	public DVD(String id, String name, String number,String iSRC) {
		super(id, name, number);
		this.ISRC = iSRC;
	}

	
	public String getISRC() {
		return ISRC;
	}
	
	public void setISRC(String ISRC) {
		this.ISRC = ISRC;
	}
	
	public String toString() {
		return "#DVD��ţ�" + getId()  + "  #DVD���ƣ�" + getName() + "#DVD������" + getNumber() + "  #ISRC�ţ�" + getISRC();
	}
	
	public void change(String str) {
		String arr[] = str.split("#");
		String[] brr = arr[3].split("��");
		String[] crr = brr[1].split(" ");
		this.setId(arr[1]);
		this.setName(arr[2]);
		this.setNumber(crr[0]);
		this.setISRC(arr[4]);
	}

}
