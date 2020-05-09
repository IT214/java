package com.	bjsxt.stusys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class StudentSystem implements StudentInterface {
		//ʹ��HashMap�������е�ѧ����Ϣ�������е�Entry��key��ѧ�š�value��ѧ�Ŷ�Ӧ��ѧ������
	private Map<Integer,Student> students = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	/**
	 * ��ӭ����
	 */
	public void welcome() {
		System.out.println("*************************��ӭ����ФϦ�ε�ѧ������ϵͳ**************************");
		System.out.println("ϵͳ��ʼ���ɹ�........");
	}
	public void exit() {
		System.out.println("*************************ллʹ��ФϦ�ε�ѧ������ϵͳ**************************");
	}
	/**
	 * ��ʾϵͳ�˵�
	 */
	public void showMenu() {
		System.out.println("\n�����˵�����");
		System.out.println("1--����ѧ����Ϣ");
		System.out.println("2--���ѧ����Ϣ");
		System.out.println("3--����ѧ�Ų���");
		System.out.println("4--������������");
		System.out.println("5--����ѧ��ɾ��");
		System.out.println("6--����ѧ���޸�");
		System.out.println("7--�˳�ϵͳ");
		
	}
		@Override
		public void showAll() {
			//�õ����е�ѧ����Ϣ
			Set<Integer> sids = students.keySet();//���ذ�����ӳ���е�ֵ
			Iterator<Integer> iterator = sids.iterator();//���ظü�����Ԫ�صĵ���
			while(iterator.hasNext()) {//������棬���������Ԫ�أ��������׳��쳣
				Integer sid = iterator.next();//����һ����������ѧ��
				Student student  =  students.get(sid);//����ѧ�Ż�ö���,���ع���ֵ ��Student) �ļ�
				System.out.println(student);
			}
		}

		@Override
		/**
		 * ���ѧ����Ϣ
		 */
		public boolean addStudent() {//��Ϊ�������ļ��ζ�Ҫʹ�ã����Ը�����װ������
			//System.out.println("������ѧ����ѧ�ţ�Ҫ��������:");
			//int sid = scanner.nextInt();
			int sid = MyUtil.getInputNumber("������ѧ����ѧ�ţ�Ҫ��������:", scanner);
			//System.out.println("������ѧ����ѧ�ţ�Ҫ��������:");
			String name = MyUtil.getInputString("������ѧ��������:", scanner);
			int age = MyUtil.getInputNumber("������ѧ��������:", scanner);
			Gender gender = MyUtil.getInputString("������ѧ�����Ա� �� or Ů:", scanner).equals("��")?Gender.�� : Gender.Ů;
			Student s = new Student(sid,name,age,gender);
			/**
			 * �������������ǰһ��ֵ�����û�м���ӳ�䣬��Ϊ��
			 */
			students.put(sid,s);
			System.out.println("���ѧ���ɹ�");
			return true;
		}

		@Override
		public Student findStuBySid(int sid) {
			Student student = students.get(sid);
			if(student !=null) {
				System.out.println(student);
			}
			else
				System.out.println("��ѧ�������ڵ�");
			return student;
		}
		/**
		 * ���ֻ��Ϊ�˺�����Ե�ʱ����Է���Щ
		 * @return
		 */
		public Student findStuBySid() {
			int sid = MyUtil.getInputNumber("������Ҫ���ҵ�ѧ����ѧ��", scanner);
			return findStuBySid(sid);
		}
		public List<Student> findStudentByName(String name) {
			List<Student>List = new ArrayList<>();
			//�������е�ѧ����Ȼ���name����Ƚ�
			Collection<Student>stus =students.values();//���ش�ӳ���еļ�����ͼ
			Iterator<Student>iterator = stus.iterator();//�˼�����Ԫ�صĵ�����
			while(iterator.hasNext()) {
				Student student = iterator.next();
				if(student.getname().equals(name))	{
					List.add(student);
				}			
			}
			return List.size()==0 ? null : List;
		}
		public void findStudentByName(){
			String name = MyUtil.getInputString("������Ҫ����ѧ��������", scanner);
			List<Student>stus = findStudentByName(name);
			if(stus==null) {
				System.out.println("��������ѧ��������");
			}
			else
			{
				//��ӡ����ѧ������Ϣ
				System.out.println("���ҵ���ѧ������Ϣ���� ��");
				for(int i=0;i<stus.size();i++) {
					System.out.println(stus.get(i));
				}
			}
		}
		public boolean removeStuBySid(int sid) {
			Student student = students.remove(sid);
			return student == null ? false : true;
		}
		@SuppressWarnings("unused")
		public void  removeStuBySid() {
			int sid = MyUtil.getInputNumber("������Ҫɾ��ѧ����ѧ��", scanner);
			boolean bool = removeStuBySid(sid);
			if(true) {
				System.out.println("ɾ��ѧ���ɹ� ��");
			}
			else
			{
			System.out.println("��ѧ�������� ��");
			}
		}
		public boolean modifyStuBySid(int sid) {
			Student student = students.get(sid);
			if(student != null) {
				sid = MyUtil.getInputNumber("�������µ�ѧ����ѧ�ţ�Ҫ��������:", scanner);
				String name = MyUtil.getInputString("�������µ�ѧ��������:", scanner);
				int age = MyUtil.getInputNumber("�������µ�ѧ��������:", scanner);
				Gender gender = MyUtil.getInputString("�������µ�ѧ�����Ա�:", scanner).equals("��")?Gender.�� : Gender.Ů;
				student.setage(age);
				student.setname(name);
				student.setsid(sid);
				student.setGender(gender);
			}
			return student == null ? false  : true;
		}
		public void  modifyStuBySid() {
			int sid = MyUtil.getInputNumber("������Ҫ�޸�ѧ����ѧ��", scanner);
			boolean bool = modifyStuBySid(sid);
			if(bool) {
				System.out.println(" �޸�ѧ����Ϣ�ɹ� ��");
			}else {
				System.out.println(" ѧ�������� ��");
			}
		}

		
   }
