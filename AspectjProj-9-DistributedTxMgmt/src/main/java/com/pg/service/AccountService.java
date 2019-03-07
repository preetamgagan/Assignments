package com.pg.service;

import com.pg.dao.DepositeDAO;
import com.pg.dao.WithdrawDAO;

public class AccountService {

	private WithdrawDAO withdrawDAO;
	private DepositeDAO depositeDAO;
	
	public void setWithdrawDAO(WithdrawDAO withdrawDAO) {
		this.withdrawDAO = withdrawDAO;
	}
	public void setDepositeDAO(DepositeDAO depositeDAO) {
		this.depositeDAO = depositeDAO;
	}
	
	public boolean TransferMoney(int srcAcc,int destAcc,int amt) {
		int result1=withdrawDAO.withdraw(srcAcc, amt);
		int result2=depositeDAO.deposite(destAcc, amt);
		if(result1==0 || result2==0) {
			throw new RuntimeException("Transaction Failed(Tx Rollback");
		}
		return true;
	}
	
}
