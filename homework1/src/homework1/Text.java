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
			System.out.println("	 1.会员操作");
			System.out.println("	 2.新增商品 ");
			System.out.println("	 3.借书或DVD");
			System.out.println("	 4.还书或DVD");
			System.out.println("	 5.显示所有会员信息");
			System.out.println("	 6.显示所有商品信息");
			System.out.println("	 7.退出程序");
			System.out.println("请输入你的选择：");
			choose = cin.nextInt();
			switch(choose){
			case 1:
				int choose1 = 0;
				do {
					System.out.println("	1.新增会员");
					System.out.println("	2.修改会员信息");
					System.out.println("	3.查询会员信息");
					System.out.println("	4.删除会员信息");
					System.out.println("	5.退出会员管理系统");
					System.out.println("请输入你的选择：");
					choose1 = cin.nextInt();
					switch(choose1) {
					case 1:
						System.out.println("请输入会员的ID：");
						int nid = cin.nextInt();
						System.out.println("请输入会员的名称：");
						String nname = cin.next();
						System.out.println("请输入会员的联系电话：");
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
						System.out.println("添加成功!");
						break;
					case 2:
						System.out.println("请输入要修改的ID:");
						String fixId = cin.next();
						System.out.println("请输入修改的手机号：");
						String ftel = cin.next();
						for(int i = 0; i < arr.length; i++) {
							if(arr[i].getId().contains(fixId)) {
								arr[i].setTel(ftel);
								break;
							}
						}
						System.out.println("修改成功");
						break;
					case 3:
						System.out.println("请输入你要查询的ID:");
						String sid = cin.next();
						for(int i = 0; i < arr.length; i++) {
							if(arr[i].getId().contains(sid)) {
								System.out.println("该会员电话为：" + arr[i].getTel());
								break;
							}
							if(i == arr.length - 1) {
								System.out.println("此会员不存在");
								break;
							}
						}
						break;
					case 4:
						System.out.println("请输入你要删除会员的ID：");
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
						System.out.println("删除成功");
						break;
					}
				}while(choose1 != 5);
				break;            //break
			case 2:
				int choose2 = 0;
				while(choose2 != 3) {
					System.out.println("	1.新增图书");
					System.out.println("	2.新增DVD");
					System.out.println("	3.退出此界面");
					System.out.println("请输入你的选择：");
					choose2 = cin.nextInt();
					switch(choose2) {
					case 1:
						System.out.println("请输入新增图书的编号：");
						String bid = cin.next();
						System.out.println("请输入新增图书的名称：");
						String bname = cin.next();
						System.out.println("请输入新增图书的数量：");
						int bnumber = cin.nextInt();
						System.out.println("请输入新增图书的作者：");
						String bauthor = cin.next();
						System.out.println("请输入新增图书的ISBN号：");
						String bisbn = cin.next();
						for(int i = 0; i < brr.length;i++) {
							if(brr[i] == null) {
								brr[i] = new Book(bid,bname, bnumber + "", bauthor, bisbn);
								System.out.println("添加成功!");
								break;
							}
						}
						break;
					case 2:
						System.out.println("请输入新增DVD的编号：");
						String did = cin.next();
						System.out.println("请输入新增DVD的名称：");
						String dname = cin.next();
						System.out.println("请输入新增DVD的数量：");
						String dnumber = cin.next();
						System.out.println("请输入新增DVD的ISRC号：");
						String disrc = cin.next();
						for(int i = 0; i < brr.length;i++) {
							if(brr[i] == null) {
								brr[i] = new DVD(did, dname, dnumber, disrc);
								System.out.println("添加成功!");
								break;
							}
						}
						break;
					}
				}
				break;   //break;
			case 3:
				System.out.println("欢迎进入借阅页面");
				System.out.println("请输入会员ID：");
				int mid = cin.nextInt();
				String mmmid = mid + "";
				int f = 0;   //记录是否含有此人，若为1，则存在，为0则不存在
				String mname = "";  //记录借阅的会员名称
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
						System.out.println("	1.借图书");
						System.out.println("	2.借DVD");
						System.out.println("	3.退出此页面");
						System.out.println("请输入你的选择：");
						choose3 = cin.nextInt();
						switch(choose3) {
						case 1:
							System.out.println("请输入图书的名称：");
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
											crr[j].setCondition("否");
											System.out.println("借阅成功!");
											break;
										}
									}
									break;     //查找时若找到则停止
								}
							}
							break;
						 case 2:
							System.out.println("请输入DVD的名称：");
							String DVDName = cin.next();
							for(int i = 0; i < brr.length;i++) {
								if(brr[i].getName().contains(DVDName)) {
									int dvdnum = Integer.parseInt(brr[i].getNumber());
									for(int j = 0; j < crr.length;j++) {
										System.out.println("成员名为：" + mname);   //打印名字
										if(dvdnum > 0 && crr[j].getCondition() == null) {
											crr[j].setBookName(brr[i].getName());
											dvdnum--;
											brr[i].setNumber(dvdnum+"");
											crr[j].setMembereName(mname);
											crr[j].setBookName(DVDName);
											crr[j].setCondition("否");
											crr[j].setTime();
											System.out.println("借阅成功!");
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
				System.out.println("欢迎来到图书归还页面");
				System.out.println("请输入会员ID：");
				int nid = cin.nextInt();
				String nnid = nid + "";
				int ff = 0;   //记录是否含有此人，若为1，则存在，为0则不存在
				String nname = "";  //记录借阅的会员名称
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
						System.out.println("	1:归还图书");
						System.out.println("	2:归还DvD");
						System.out.println("	3.退出此页面");
						System.out.println("	请选择归还图书或DvD:");
						choose4 = cin.nextInt();
						switch(choose4) {
						case 1:
							System.out.println("请输入要归还图书的名称：");
							String gb = cin.next();
							int a = 0;
							for(int i = 0; i < crr.length;i++) {
								if(crr[i].getBookName().contains(gb) && crr[i].getMembereName().indexOf(0) == nname.indexOf(0)) {
									crr[i].setMembereName(nname);
									crr[i].setCondition("是");
									a = 1;
									System.out.println("归还成功!");
									break;
								}
							}
							if(a == 0) {
								System.out.println("没有此书");
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
							System.out.println("请输入要归还DvD的名称：");
							String gd = cin.next();
							for(int i = 0; i < crr.length;i++) {
								if(crr[i].getBookName().contains(gd) && crr[i].getMembereName().indexOf(0) == nname.indexOf(0)) {
									crr[i].setMembereName(nname);
									crr[i].setCondition("是");
									System.out.println("归还成功!");
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
				System.out.println("会员信息如下：");
				mf.print();
				break;
			case 6:
				System.out.println("所有商品信息如下：");
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

