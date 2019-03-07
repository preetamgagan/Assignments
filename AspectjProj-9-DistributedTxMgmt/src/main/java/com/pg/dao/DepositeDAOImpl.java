package com.pg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DepositeDAOImpl implements DepositeDAO {
	private static final String WITHDRAW_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?"; 
	private JdbcTemplate jt;
	public DepositeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	@Override
	public int deposite(int accNo, int amt) {
		int count=jt.update(WITHDRAW_QUERY, amt,accNo);
		return count;
	}

}
