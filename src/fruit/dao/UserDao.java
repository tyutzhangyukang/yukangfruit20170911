package fruit.dao;

import java.util.List;

import fruit.entity.User;

public interface UserDao {
	// ��¼
	public boolean login(String userName, String password);

	// �û�ע��
	public int regist(User user);

	// �û�ɾ��
	public int delete(String userName);

	// �û�����
	public int update(User user);

	// ���������û�
	public List<User> findAll();

	// ���ҵ����û�
	public User findByUserName(String userName);
}
