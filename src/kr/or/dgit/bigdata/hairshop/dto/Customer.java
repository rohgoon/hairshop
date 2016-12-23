package kr.or.dgit.bigdata.hairshop.dto;

import java.util.Date;

public class Customer {
	private int cNo;
	private String cName;
	private Date cDob;
	private Date cDoJoin;
	public Customer(int cNo) {
		super();
		this.cNo = cNo;
	}
	
	public Customer(int cNo, String cName) {
		super();
		this.cNo = cNo;
		this.cName = cName;
	}
	
	public Customer(String cName, Date cDob) {
		super();
		this.cName = cName;
		this.cDob = cDob;
	}

	public Customer(int cNo, String cName, Date cDob, Date cDoJoin) {
		super();
		this.cNo = cNo;
		this.cName = cName;
		this.cDob = cDob;
		this.cDoJoin = cDoJoin;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Date getcDob() {
		return cDob;
	}

	public void setcDob(Date cDob) {
		this.cDob = cDob;
	}

	public Date getcDoJoin() {
		return cDoJoin;
	}

	public void setcDoJoin(Date cDoJoin) {
		this.cDoJoin = cDoJoin;
	}

	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", cName=" + cName + ", cDob=" + cDob + ", cDoJoin=" + cDoJoin + "]";
	}
	
	
	
}
