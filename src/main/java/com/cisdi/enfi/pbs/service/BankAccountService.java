package com.cisdi.enfi.pbs.service;

import com.cisdi.enfi.pbs.domain.BankAccountDetails;

import java.util.List;

public interface BankAccountService {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    List<BankAccountDetails> getAll();
}
