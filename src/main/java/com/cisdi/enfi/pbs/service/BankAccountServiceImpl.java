package com.cisdi.enfi.pbs.service;

import com.cisdi.enfi.pbs.dao.BankAccountDao;
import com.cisdi.enfi.pbs.domain.BankAccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    @Transactional
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }

    @Override
    @Transactional
    public List<BankAccountDetails> getAll() {
        return bankAccountDao.getAll();
    }
}
