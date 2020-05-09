package com.bjsxt.stusys;
import java.util.Scanner;
/**
 * ������(д��������)
 * @author ФϦ��
 */
public class MyUtil {
	private MyUtil() {}
	/**
	 * �õ�ָ������������
	 * @param min ����
	 * @param max ������
	 * @return
	 */
	public static int getRandomNumber(int min,int max) {
		return(int)(Math.random()*(max-min)+min);
	}
	public static int getInputNumber(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.nextInt();
	}
	/**
	 * ���ú��ṩ��Ϣ��ͬʱ��������һ���ַ���
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static String getInputString(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.next();
	}

}
