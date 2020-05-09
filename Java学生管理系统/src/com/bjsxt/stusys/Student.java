package com.bjsxt.stusys;
/**
 * 学生属性:学号，名字，年龄，性别。
 * @author 肖夕梦
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
 * 在java中由于类被封装了，所以想要进行访问话，只需要通过外部进行
 * 通过set（）进行设立一个值，get（)获得属性的值
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
		return "学生信息{" +
				"学号" + sid +
				", 名字 = ' " + name + '\'' + 
				", 年龄= " + age + 
				", 性别 = " + gender +
				'}';
	}
}
enum Gender{
	男	 ,女
}