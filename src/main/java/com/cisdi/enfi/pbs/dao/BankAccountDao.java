package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.domain.BankAccountDetails;

import java.util.List;

public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    List<BankAccountDetails> getAll();
}
