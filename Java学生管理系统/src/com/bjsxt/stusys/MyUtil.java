package com.bjsxt.stusys;
import java.util.Scanner;
/**
 * 工具类(写两个方法)
 * @author 肖夕梦
 */
public class MyUtil {
	private MyUtil() {}
	/**
	 * 得到指定区间的随机数
	 * @param min 包含
	 * @param max 不包含
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
	 * 给用和提供信息的同时，请输入一个字符串
	 * @param msg
	 * @param scanner
	 * @return
	 */
	public static String getInputString(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.next();
	}

}
