package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.domain.BankAccountDetails;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "bankAccountDaoNew")
public class BankAccountDaoNewImpl implements BankAccountDao {

    protected static HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    static {
        if (hibernateTemplate == null) {
            hibernateTemplate = TemplateFactory
                    .getHibernateTemplate("dataSource");
        }
    }


    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        return 0;
    }

    @Override
    public List<BankAccountDetails> getAll() {
        List<BankAccountDetails> bankAccountDetailsList =
                sessionFactory.getCurrentSession().createQuery("from BankAccountDetails").list();
        return bankAccountDetailsList;
    }
}
