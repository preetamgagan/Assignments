package com.pg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class WithdrawDAOImpl implements WithdrawDAO {
	private static final String WITHDRAW_QUERY="UPDATE ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?"; 
	private JdbcTemplate jt;
	public WithdrawDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}
	
	@Override
	public int withdraw(int accNo, int amt) {
		int count=jt.update(WITHDRAW_QUERY, amt,accNo);
		return count;
	}

}
