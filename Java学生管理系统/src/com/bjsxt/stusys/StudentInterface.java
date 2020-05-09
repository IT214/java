package com.bjsxt.stusys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**遍历所有学生信息
 * 添加学生信息
 * 根据学号查找学生
 * @author 肖夕梦
 * 根据名字查找学生
 *
 */
public interface StudentInterface {
	/**
	 * 遍历所有学生信息
	 */
	void showAll();
	/**
	 * 添加学生信息，判断是否添加成功
	 * @return 加成功，返回true 否则返回false
	 */
	boolean addStudent();
	/**
	 * 根据学号查找学生
	 * @param sid
	 * @return 被找到的学生对象，如果不存在，返回null
	 */
	Student findStuBySid(int sid);
	/**
	 * 根据名字查找学生
	 * @param name
	 * @return 返回所有该名字为name的学生的列表，如果不成功，返回Null
	 */
	List<Student> findStudentByName(String name);
	/**
	 * 根据学号删除学生
	 * @param sid
	 * @return 如果删除成功，返回true,否则返回false
	 */
	boolean removeStuBySid(int sid);
	/**
	 * 根据学号修改学生
	 * @param sid
	 * @return 如果修改成功，返回true,否则返回false
	 */
	boolean modifyStuBySid(int sid);
}
