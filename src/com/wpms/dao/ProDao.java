package com.wpms.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.wpms.model.Project;

public interface ProDao {
	/**
	 * ��ѯ������Ʒ
	 * 
	 */
	List<Project> getAllpro();
	/**
	 * ����ID��ѯ��Ʒ��ϸ��Ϣ
	 * @param proid ��ƷID
	 * 
	 */
	Project getProDedail(String proid);
	/**
	 * ����ID�����ѯ��Ʒ��Ϣ
	 * @param proids ��ƷID����
	 * 
	 */
	List<Project> getPros(Set<Integer> proids);
	/**
	 * ������Ʒ
	 * @param project
	 * 
	 */
	int addPro(Project project);
	/**
	 * ������Ʒ�����ѯ��Ʒ�б�
	 * @param pclass ��Ʒ����
	 * 
	 */
	List<Project> getproList(String pclass);
	/**
	 * ����ID���齫��Ʒ���빺�ﳵ
	 * @param proids ��ƷID����
	 * 
	 */
	List<Project> getCars(Set<Integer> proids);
	/**
	 * ������ƷIDɾ����Ʒ
	 * @param pid ��ƷID
	 * 
	 */
	int delPro(String pid);
	/**
	 * ������Ʒ��Ϣ
	 * @param pro ��Ʒ��Ϣ
	 * 
	 */
	int updPro(Project pro);
	/**
	 * �����û�ID�õ����ﳵ
	 * @param userid �û�ID
	 * 
	 */
	Map<Integer, Integer> queryCar(Integer userid);
	/**
	 * ����Ʒ��ӵ����ﳵ
	 * @param userid �û�ID
	 * @param proid ��ƷID
	 * @param procount ��Ʒ����
	 * 
	 */
	int addToCars(Integer userid,String proid, Integer procount);
	/**
	 * ���¹��ﳵ����Ʒ������
	 * @param userid �û�ID
	 * @param proid ��ƷID
	 * @param procount ��Ʒ����
 	 */
	void uptCarCount(Integer userid, String proid, Integer procount);
	/**
	 * �ӹ��ﳵ��ɾ����Ʒ
	 * @param userid �û�ID
	 * @param proid ��ƷID
	 */
	void delFromCar(Integer userid, Integer proid);
	/**
	 * ��չ��ﳵ
	 * @param userid
	 */
	void emptyCar(Integer userid);

}
