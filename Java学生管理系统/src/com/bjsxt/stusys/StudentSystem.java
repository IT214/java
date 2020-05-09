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
		//使用HashMap保存所有的学生信息，容器中的Entry的key是学号。value是学号对应的学生对象
	private Map<Integer,Student> students = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	/**
	 * 欢迎界面
	 */
	public void welcome() {
		System.out.println("*************************欢迎来到肖夕梦的学生管理系统**************************");
		System.out.println("系统初始化成功........");
	}
	public void exit() {
		System.out.println("*************************谢谢使用肖夕梦的学生管理系统**************************");
	}
	/**
	 * 显示系统菜单
	 */
	public void showMenu() {
		System.out.println("\n操作菜单内容");
		System.out.println("1--所有学生信息");
		System.out.println("2--添加学生信息");
		System.out.println("3--根据学号查找");
		System.out.println("4--根据姓名查找");
		System.out.println("5--根据学号删除");
		System.out.println("6--根据学号修改");
		System.out.println("7--退出系统");
		
	}
		@Override
		public void showAll() {
			//得到所有的学生信息
			Set<Integer> sids = students.keySet();//返回包含在映射中得值
			Iterator<Integer> iterator = sids.iterator();//返回该集合中元素的迭代
			while(iterator.hasNext()) {//如果是真，则继续返回元素，而不是抛出异常
				Integer sid = iterator.next();//把下一个迭代赋给学号
				Student student  =  students.get(sid);//根据学号获得对象,返回关联值 （Student) 的键
				System.out.println(student);
			}
		}

		@Override
		/**
		 * 添加学生信息
		 */
		public boolean addStudent() {//因为接下来的几次都要使用，所以给他封装个方法
			//System.out.println("请输入学生的学号，要求是整数:");
			//int sid = scanner.nextInt();
			int sid = MyUtil.getInputNumber("请输入学生的学号，要求是整数:", scanner);
			//System.out.println("请输入学生的学号，要求是整数:");
			String name = MyUtil.getInputString("请输入学生的姓名:", scanner);
			int age = MyUtil.getInputNumber("请输入学生的年龄:", scanner);
			Gender gender = MyUtil.getInputString("请输入学生的性别 男 or 女:", scanner).equals("男")?Gender.男 : Gender.女;
			Student s = new Student(sid,name,age,gender);
			/**
			 * 返回与键关联的前一个值，如果没有键的映射，则为空
			 */
			students.put(sid,s);
			System.out.println("添加学生成功");
			return true;
		}

		@Override
		public Student findStuBySid(int sid) {
			Student student = students.get(sid);
			if(student !=null) {
				System.out.println(student);
			}
			else
				System.out.println("该学生不存在滴");
			return student;
		}
		/**
		 * 这个只是为了后面测试的时候可以方便些
		 * @return
		 */
		public Student findStuBySid() {
			int sid = MyUtil.getInputNumber("请输入要查找的学生的学号", scanner);
			return findStuBySid(sid);
		}
		public List<Student> findStudentByName(String name) {
			List<Student>List = new ArrayList<>();
			//遍历所有的学生，然后和name逐个比较
			Collection<Student>stus =students.values();//返回此映射中的集合视图
			Iterator<Student>iterator = stus.iterator();//此集合中元素的迭代器
			while(iterator.hasNext()) {
				Student student = iterator.next();
				if(student.getname().equals(name))	{
					List.add(student);
				}			
			}
			return List.size()==0 ? null : List;
		}
		public void findStudentByName(){
			String name = MyUtil.getInputString("请输入要查找学生的姓名", scanner);
			List<Student>stus = findStudentByName(name);
			if(stus==null) {
				System.out.println("该姓名的学生不存在");
			}
			else
			{
				//打印所有学生的信息
				System.out.println("查找到的学生的信息如下 ：");
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
			int sid = MyUtil.getInputNumber("请输入要删除学生的学号", scanner);
			boolean bool = removeStuBySid(sid);
			if(true) {
				System.out.println("删除学生成功 ！");
			}
			else
			{
			System.out.println("该学生不存在 ！");
			}
		}
		public boolean modifyStuBySid(int sid) {
			Student student = students.get(sid);
			if(student != null) {
				sid = MyUtil.getInputNumber("请输入新的学生的学号，要求是整数:", scanner);
				String name = MyUtil.getInputString("请输入新的学生的姓名:", scanner);
				int age = MyUtil.getInputNumber("请输入新的学生的年龄:", scanner);
				Gender gender = MyUtil.getInputString("请输入新的学生的性别:", scanner).equals("男")?Gender.男 : Gender.女;
				student.setage(age);
				student.setname(name);
				student.setsid(sid);
				student.setGender(gender);
			}
			return student == null ? false  : true;
		}
		public void  modifyStuBySid() {
			int sid = MyUtil.getInputNumber("请输入要修该学生的学号", scanner);
			boolean bool = modifyStuBySid(sid);
			if(bool) {
				System.out.println(" 修改学生信息成功 ！");
			}else {
				System.out.println(" 学生不存在 ！");
			}
		}

		
   }
