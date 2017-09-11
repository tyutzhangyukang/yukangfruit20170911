package fruit.dao;

import java.util.List;

import fruit.entity.Goods;

public interface GoodsDao {
	
	//�����Ʒ
	public int add(Goods goods);
	
	//�޸���Ʒ
	public int update(Goods goods);
	
	//ɾ����Ʒ
	public int delete(String goodsName);
	
	//��ѯȫ����Ʒ
	public List<Goods> findAll();
	
	//������Ʒ���Ʋ�ѯ��Ʒ
	public Goods find(String goodsName);
}
