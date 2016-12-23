package kr.or.dgit.bigdata.hairshop.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.bigdata.hairshop.dao.HairshopDao;
import kr.or.dgit.bigdata.hairshop.dto.Customer;
import kr.or.dgit.bigdata.hairshop.util.MyBatisSqlSessionFactory;

public class CustomerService implements HairshopDao{
	private static final CustomerService instance = new CustomerService();
	
	public static CustomerService getInstance() {
		return instance;
	}
	public CustomerService() {}
	
	private static final Logger logger = Logger.getLogger(CustomerService.class);
	
	@Override
	public void insertItem(Customer item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Customer idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(Customer item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer selectByNo(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer selectByName(Customer name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> selectByAll() {
		logger.debug("selectByAll()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		HairshopDao studentDao =sqlSession.getMapper(HairshopDao.class);
		try {
			return studentDao.selectByAll();
		} finally {
			sqlSession.close();
		}
	}
	

}
