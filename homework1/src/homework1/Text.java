package homework1;

import java.util.Scanner;

public class Text {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int num = 7;
		RecordManagement rm = new RecordManagement();
		Member[] arr = rm.getMember();
		rm.initalM(arr);
		Commoditv[] brr = rm.getProduct();
		rm.initalP(brr);
		Record[] crr = rm.getRecord();
		rm.initR(crr);
		MemberFix mf = new MemberFix();
		int choose = 0;
		while(choose != 7){
			System.out.println("	 1.��Ա����");
			System.out.println("	 2.������Ʒ ");
			System.out.println("	 3.�����DVD");
			System.out.println("	 4.�����DVD");
			System.out.println("	 5.��ʾ���л�Ա��Ϣ");
			System.out.println("	 6.��ʾ������Ʒ��Ϣ");
			System.out.println("	 7.�˳�����");
			System.out.println("���������ѡ��");
			choose = cin.nextInt();
			switch(choose){
			case 1:
				int choose1 = 0;
				do {
					System.out.println("	1.������Ա");
					System.out.println("	2.�޸Ļ�Ա��Ϣ");
					System.out.println("	3.��ѯ��Ա��Ϣ");
					System.out.println("	4.ɾ����Ա��Ϣ");
					System.out.println("	5.�˳���Ա����ϵͳ");
					System.out.println("���������ѡ��");
					choose1 = cin.nextInt();
					switch(choose1) {
					case 1:
						System.out.println("�������Ա��ID��");
						int nid = cin.nextInt();
						System.out.println("�������Ա�����ƣ�");
						String nname = cin.next();
						System.out.println("�������Ա����ϵ�绰��");
						int ntel = cin.nextInt();
						String id = nid + "";
						String tel = ntel + "";
						for(int i = 0; i < arr.length;i++) {
							if(arr[i].getId() == null) {
								arr[i].setId(id);
								arr[i].setName(nname);
								arr[i].setTel(tel);
								break;
							}
						}
						System.out.println("��ӳɹ�!");
						break;
					case 2:
						System.out.println("������Ҫ�޸ĵ�ID:");
						String fixId = cin.next();
						System.out.println("�������޸ĵ��ֻ��ţ�");
						String ftel = cin.next();
						for(int i = 0; i < arr.length; i++) {
							if(arr[i].getId().contains(fixId)) {
								arr[i].setTel(ftel);
								break;
							}
						}
						System.out.println("�޸ĳɹ�");
						break;
					case 3:
						System.out.println("��������Ҫ��ѯ��ID:");
						String sid = cin.next();
						for(int i = 0; i < arr.length; i++) {
							if(arr[i].getId().contains(sid)) {
								System.out.println("�û�Ա�绰Ϊ��" + arr[i].getTel());
								break;
							}
							if(i == arr.length - 1) {
								System.out.println("�˻�Ա������");
								break;
							}
						}
						break;
					case 4:
						System.out.println("��������Ҫɾ����Ա��ID��");
						String delid = cin.next();
						int rem = 0;
						for(int i = 0; i < arr.length; i++) {
							if(arr[i].getId().contains(delid)) {
								rem = i;
								break;
							}
						}
						for(int i = rem;i < arr.length - 1;i++) {
							arr[i] = arr[i + 1];
						}
						System.out.println("ɾ���ɹ�");
						break;
					}
				}while(choose1 != 5);
				break;            //break
			case 2:
				int choose2 = 0;
				while(choose2 != 3) {
					System.out.println("	1.����ͼ��");
					System.out.println("	2.����DVD");
					System.out.println("	3.�˳��˽���");
					System.out.println("���������ѡ��");
					choose2 = cin.nextInt();
					switch(choose2) {
					case 1:
						System.out.println("����������ͼ��ı�ţ�");
						String bid = cin.next();
						System.out.println("����������ͼ������ƣ�");
						String bname = cin.next();
						System.out.println("����������ͼ���������");
						int bnumber = cin.nextInt();
						System.out.println("����������ͼ������ߣ�");
						String bauthor = cin.next();
						System.out.println("����������ͼ���ISBN�ţ�");
						String bisbn = cin.next();
						for(int i = 0; i < brr.length;i++) {
							if(brr[i] == null) {
								brr[i] = new Book(bid,bname, bnumber + "", bauthor, bisbn);
								System.out.println("��ӳɹ�!");
								break;
							}
						}
						break;
					case 2:
						System.out.println("����������DVD�ı�ţ�");
						String did = cin.next();
						System.out.println("����������DVD�����ƣ�");
						String dname = cin.next();
						System.out.println("����������DVD��������");
						String dnumber = cin.next();
						System.out.println("����������DVD��ISRC�ţ�");
						String disrc = cin.next();
						for(int i = 0; i < brr.length;i++) {
							if(brr[i] == null) {
								brr[i] = new DVD(did, dname, dnumber, disrc);
								System.out.println("��ӳɹ�!");
								break;
							}
						}
						break;
					}
				}
				break;   //break;
			case 3:
				System.out.println("��ӭ�������ҳ��");
				System.out.println("�������ԱID��");
				int mid = cin.nextInt();
				String mmmid = mid + "";
				int f = 0;   //��¼�Ƿ��д��ˣ���Ϊ1������ڣ�Ϊ0�򲻴���
				String mname = "";  //��¼���ĵĻ�Ա����
				for(int i = 0; i < arr.length; i++) {
					if(arr[i].getId().contains(mmmid)) {
						mname = arr[i].getName();
						f = 1;
						break;
					}
				}
				if(f == 1) {
					int choose3 = 0;
					do {
						System.out.println("	1.��ͼ��");
						System.out.println("	2.��DVD");
						System.out.println("	3.�˳���ҳ��");
						System.out.println("���������ѡ��");
						choose3 = cin.nextInt();
						switch(choose3) {
						case 1:
							System.out.println("������ͼ������ƣ�");
							String bookName = cin.next();
							for(int i = 0; i < brr.length;i++) {
								System.out.println(brr[i].getName());
								if(brr[i].getName().contains(bookName)) {
									int booknum = Integer.parseInt(brr[i].getNumber());
									for(int j = 0; j < crr.length;j++) {
										if(booknum > 0 && crr[j].getCondition() == null) {
											crr[j].setBookName(brr[i].getName());
											booknum--;
											crr[j].setMembereName(mname);
											brr[j].setNumber(booknum + "");
											crr[j].setBookName(bookName);
											crr[j].setTime();
											crr[j].setCondition("��");
											System.out.println("���ĳɹ�!");
											break;
										}
									}
									break;     //����ʱ���ҵ���ֹͣ
								}
							}
							break;
						 case 2:
							System.out.println("������DVD�����ƣ�");
							String DVDName = cin.next();
							for(int i = 0; i < brr.length;i++) {
								if(brr[i].getName().contains(DVDName)) {
									int dvdnum = Integer.parseInt(brr[i].getNumber());
									for(int j = 0; j < crr.length;j++) {
										System.out.println("��Ա��Ϊ��" + mname);   //��ӡ����
										if(dvdnum > 0 && crr[j].getCondition() == null) {
											crr[j].setBookName(brr[i].getName());
											dvdnum--;
											brr[i].setNumber(dvdnum+"");
											crr[j].setMembereName(mname);
											crr[j].setBookName(DVDName);
											crr[j].setCondition("��");
											crr[j].setTime();
											System.out.println("���ĳɹ�!");
											break;
										}
									}
									break;
								}
							}
						}
					}while(choose3 != 3);
				}
				break;
			case 4:
				System.out.println("��ӭ����ͼ��黹ҳ��");
				System.out.println("�������ԱID��");
				int nid = cin.nextInt();
				String nnid = nid + "";
				int ff = 0;   //��¼�Ƿ��д��ˣ���Ϊ1������ڣ�Ϊ0�򲻴���
				String nname = "";  //��¼���ĵĻ�Ա����
				for(int i = 0; i < arr.length; i++) {
					if(arr[i].getId().contains(nnid)) {
						mname = arr[i].getName();
						ff = 1;
						break;
					}
				}
				if(ff == 1) {
					int choose4 = 0;
					do {
						System.out.println("	1:�黹ͼ��");
						System.out.println("	2:�黹DvD");
						System.out.println("	3.�˳���ҳ��");
						System.out.println("	��ѡ��黹ͼ���DvD:");
						choose4 = cin.nextInt();
						switch(choose4) {
						case 1:
							System.out.println("������Ҫ�黹ͼ������ƣ�");
							String gb = cin.next();
							int a = 0;
							for(int i = 0; i < crr.length;i++) {
								if(crr[i].getBookName().contains(gb) && crr[i].getMembereName().indexOf(0) == nname.indexOf(0)) {
									crr[i].setMembereName(nname);
									crr[i].setCondition("��");
									a = 1;
									System.out.println("�黹�ɹ�!");
									break;
								}
							}
							if(a == 0) {
								System.out.println("û�д���");
							}
							for(int i = 0; i < brr.length; i++) {
								if(brr[i].getName().contains(gb)) {
									int booknum1 = Integer.parseInt(brr[i].getNumber());
									booknum1++;
									brr[i].setNumber(booknum1+"");
									break;
								}
							}
							break;
						case 2:
							System.out.println("������Ҫ�黹DvD�����ƣ�");
							String gd = cin.next();
							for(int i = 0; i < crr.length;i++) {
								if(crr[i].getBookName().contains(gd) && crr[i].getMembereName().indexOf(0) == nname.indexOf(0)) {
									crr[i].setMembereName(nname);
									crr[i].setCondition("��");
									System.out.println("�黹�ɹ�!");
									break;
								}
							}
							for(int i = 0; i < brr.length; i++) {
								if(brr[i].getName().contains(gd)) {
									int booknum1 = Integer.parseInt(brr[i].getNumber());
									booknum1++;
									brr[i].setNumber(booknum1+"");
									break;
								}
							}
							break;
						}
					}while(choose4 != 3);
				}
				break;
			case 5:
				System.out.println("��Ա��Ϣ���£�");
				mf.print();
				break;
			case 6:
				System.out.println("������Ʒ��Ϣ���£�");
				for(int i = 0; i < brr.length; i++) {
					if(brr[i] == null)
						break;
					System.out.println(brr[i]);
				}
				break;
			}
		}
		rm.savefile(brr, arr, crr);
	}
}

