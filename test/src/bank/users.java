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
		System.out.println("��ӭ�������й���ϵͳ������");
		System.out.println("     1������û�");
		System.out.println("     2����Ǯ");
		System.out.println("     3��ȡǮ");
		System.out.println("     0���˳�");
		System.out.println("****************************");
	}
	public static void adduser() {
		users u01= new users();
		String uname;
		String add;
		int password1;
		int password2;
		
		System.out.print("����:");
		a.next();
		do{
		System.out.print("����(int):");
		password1=a.nextInt();
		System.out.print("ȷ������:");
		password2=a.nextInt();
		if(password1!=password2)
			System.out.println("������������벻ͬ,���������룡");
		}while(password1!=password2);
		System.out.println("*****ע��ɹ���*****");
	}
	public static void cunkuan(double turnover) {
			while(turnover%100!=0) {
				System.out.println("�������룬������100�ı�����");
				turnover=a.nextInt();
			}
			balance = balance + turnover;
			System.out.println(name+"����"+turnover+"Ԫ,��ǰ���"+balance+"Ԫ");
			return;
		
	}
	public static void qukuan(double turnover) {
		while(turnover%100!=0) {
			System.out.println("�������룬������100�ı�����");
			turnover=a.nextInt();
		}
		if(balance - turnover>0) {
			balance = balance-turnover;
			System.out.println(name+"����ȡ��"+turnover+"Ԫ����ǰ���"+balance);
		}else {
			System.out.println("���㣬ȡ��ʧ��");
		}
	}
	public static void tuichu() {
		System.out.println("�˳��ɹ�����ȡ��������п���");
	}
}
