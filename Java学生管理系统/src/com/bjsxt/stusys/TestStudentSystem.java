package com.bjsxt.stusys;

import java.util.Scanner;

/**
 * ѧ�����ԣ�ѧ�ţ����֣����䣬�Ա�
 * @author ФϦ��
 * ʵ�ֹ��ܣ�
 *��������ѧ����Ϣ
 */
public class TestStudentSystem {
	public static void main(String[] args) {
		StudentSystem  system = new StudentSystem();
		//��ʾ��ӭ��Ϣ
		system.welcome();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			system.showMenu();
			int input = MyUtil.getInputNumber("��ѡ�����Ĳ���", scanner);
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
