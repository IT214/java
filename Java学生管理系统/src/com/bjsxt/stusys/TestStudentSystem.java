package com.bjsxt.stusys;

import java.util.Scanner;

/**
 * 学生属性：学号，名字，年龄，性别
 * @author 肖夕梦
 * 实现功能：
 *遍历所有学生信息
 */
public class TestStudentSystem {
	public static void main(String[] args) {
		StudentSystem  system = new StudentSystem();
		//显示欢迎信息
		system.welcome();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			system.showMenu();
			int input = MyUtil.getInputNumber("请选择您的操作", scanner);
			switch(input) {
			case 1:
				system.showAll();
				break;
			case 2:
				system.addStudent();
				break;
			case 3 :
				system.findStuBySid();
				break;
			case 4:
				system.findStudentByName();
				
			case 5 :
				system.removeStuBySid();
				break;
			case 6:
				system.modifyStuBySid();
				break;
			case 7:
				system.exit();
			}
		}
	}
}
