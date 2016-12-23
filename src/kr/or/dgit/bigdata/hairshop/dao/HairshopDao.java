package kr.or.dgit.bigdata.hairshop.dao;

import java.util.List;

import kr.or.dgit.bigdata.hairshop.dto.Customer;

public interface HairshopDao {
	void insertItem(Customer item);
	void deleteItem(Customer idx);
	void updateItem(Customer item);
	Customer selectByNo(int idx);
	Customer selectByName(Customer name);
	List<Customer> selectByAll();
}
