package com.bjsxt.stusys;
/**
 * ѧ������:ѧ�ţ����֣����䣬�Ա�
 * @author ФϦ��
 */
public class Student{
	private int sid;
	private String name;
	private int age;
	private Gender gender;
public Student(){
}
public Student(int sid,String name,int age,Gender gender) {
	this.sid=sid;
	this.name=name;
	this.age=age;
	this.gender=gender;
}
/**
 * ��java�������౻��װ�ˣ�������Ҫ���з��ʻ���ֻ��Ҫͨ���ⲿ����
 * ͨ��set������������һ��ֵ��get��)������Ե�ֵ
 */
public int  getsid() {
	return sid;
}
public void setsid(int sid) {
	this.sid=sid;
}
public String  getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}
public int getage() {
	return age;
}
public void setage(int age) {
	this.age=age;
}
public Gender getGender() {
	return gender;
}
public void  setGender(Gender  gender) {
	this.gender = gender;
}
	public String toString() {
		return "ѧ����Ϣ{" +
				"ѧ��" + sid +
				", ���� = ' " + name + '\'' + 
				", ����= " + age + 
				", �Ա� = " + gender +
				'}';
	}
}
enum Gender{
	��	 ,Ů
}