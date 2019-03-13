package bank;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class users {
	private int userno;
	private static String name;
	private String password;
	private static String address;
	private static double balance;
	private double turnover;
	static Scanner a = new Scanner(System.in);
	public static void welcome(){
		System.out.println("****************************");
		System.out.println("欢迎来到银行管理系统！！！");
		System.out.println("     1、添加用户");
		System.out.println("     2、存钱");
		System.out.println("     3、取钱");
		System.out.println("     0、退出");
		System.out.println("****************************");
	}
	public static void adduser() {
		users u01= new users();
		String uname;
		String add;
		int password1;
		int password2;
		
		System.out.print("姓名:");
		a.next();
		do{
		System.out.print("密码(int):");
		password1=a.nextInt();
		System.out.print("确认密码:");
		password2=a.nextInt();
		if(password1!=password2)
			System.out.println("两次输入的密码不同,请重新输入！");
		}while(password1!=password2);
		System.out.println("*****注册成功！*****");
	}
	public static void cunkuan(double turnover) {
			while(turnover%100!=0) {
				System.out.println("错误输入，请输入100的倍数！");
				turnover=a.nextInt();
			}
			balance = balance + turnover;
			System.out.println(name+"存入"+turnover+"元,当前余额"+balance+"元");
			return;
		
	}
	public static void qukuan(double turnover) {
		while(turnover%100!=0) {
			System.out.println("错误输入，请输入100的倍数！");
			turnover=a.nextInt();
		}
		if(balance - turnover>0) {
			balance = balance-turnover;
			System.out.println(name+"你以取出"+turnover+"元，当前余额"+balance);
		}else {
			System.out.println("余额不足，取款失败");
		}
	}
	public static void tuichu() {
		System.out.println("退出成功！请取走你的银行卡！");
	}
}
