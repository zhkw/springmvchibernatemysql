package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.domain.BankAccountDetails;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int createBankAccount(final BankAccountDetails bankAccountDetails) {
        sessionFactory.getCurrentSession().save(bankAccountDetails);
        return bankAccountDetails.getAccountId();
    }

    @Override
    public List<BankAccountDetails> getAll() {
        List<BankAccountDetails> bankAccountDetailsList =
                sessionFactory.getCurrentSession().createQuery("from BankAccountDetails").list();
        return bankAccountDetailsList;
    }
}
