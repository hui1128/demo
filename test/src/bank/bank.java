package bank;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		users.welcome();
		System.out.println("请输入你要的方式：");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		
		switch(num) {
		case 1:
			users.adduser();
			break;
		case 2:
			System.out.println("请输入你要存入的金额：");
			int turnover = n.nextInt();
			users.cunkuan(turnover);
			break;
		case 3:
			System.out.println("请输入你要取出的金额:");
			turnover = n.nextInt();
			users.qukuan(turnover);
			break;
		case 4:
			System.out.println("是否退出银行系统！y/n");
			String a=n.next();
			if("y".equals(a)) {
				users.tuichu();
			}else {
				users.welcome();
			}
		}
		
		
		
	}

}
