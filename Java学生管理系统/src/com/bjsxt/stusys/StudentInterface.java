package com.bjsxt.stusys;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**��������ѧ����Ϣ
 * ���ѧ����Ϣ
 * ����ѧ�Ų���ѧ��
 * @author ФϦ��
 * �������ֲ���ѧ��
 *
 */
public interface StudentInterface {
	/**
	 * ��������ѧ����Ϣ
	 */
	void showAll();
	/**
	 * ���ѧ����Ϣ���ж��Ƿ���ӳɹ�
	 * @return �ӳɹ�������true ���򷵻�false
	 */
	boolean addStudent();
	/**
	 * ����ѧ�Ų���ѧ��
	 * @param sid
	 * @return ���ҵ���ѧ��������������ڣ�����null
	 */
	Student findStuBySid(int sid);
	/**
	 * �������ֲ���ѧ��
	 * @param name
	 * @return �������и�����Ϊname��ѧ�����б�������ɹ�������Null
	 */
	List<Student> findStudentByName(String name);
	/**
	 * ����ѧ��ɾ��ѧ��
	 * @param sid
	 * @return ���ɾ���ɹ�������true,���򷵻�false
	 */
	boolean removeStuBySid(int sid);
	/**
	 * ����ѧ���޸�ѧ��
	 * @param sid
	 * @return ����޸ĳɹ�������true,���򷵻�false
	 */
	boolean modifyStuBySid(int sid);
}
