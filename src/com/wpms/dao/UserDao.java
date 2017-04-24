package com.wpms.dao;

import java.util.List;

import com.wpms.model.User;

public interface UserDao {
	/**
	 * �û���¼
	 * @param username �û���	
	 * @param userpwd ����
	 * 
	 */
	User login(String username, String userpwd);
	/**
	 * �û�������
	 * @param uname �û���
	 * 
	 */
	boolean checkUsername(String uname);
	/**
	 * �û�ע��
	 * @param uname �û���
	 * @param upwd ����
	 * @param urole ��ɫ����
	 * @param usex	�Ա�
	 * @param umail ����
	 * 
	 */
	int register(String uname, String upwd, String urole, String usex, String umail);
	/**
	 * �����û���Ϣ
	 * @param uid �û�ID
	 * @param uname �û���
	 * @param upwd ����
	 * @param usex �Ա�
	 * @param umail ����	
	 * 
	 */
	int updateUser(Integer uid, String uname, String upwd, String usex, String umail);
	/**
	 * ���ݽ�ɫ��ѯ�û�
	 * @param urole ��ɫ����
	 * 
	 */
	List<User> getAllUser(String urole);
	/**
	 * ɾ���û�
	 * @param uid �û�ID
	 *
	 */
	int delUser(String uid);
	/**
	 * ����ID��ѯ�û�
	 * @param uid �û�ID
	 * 
	 */
	User selUser(String uid);
	/**
	 * �����û��˻����
	 * @param user �û���Ϣ
	 * @param money �˻����
	 * @return 
	 */
	int updAccount(Integer userid, double money);
}
