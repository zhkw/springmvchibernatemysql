package com.cisdi.enfi.pbs;

import com.cisdi.enfi.pbs.domain.BankAccountDetails;
import com.cisdi.enfi.pbs.service.BankAccountService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class BankAppTest {
    private static Logger logger = Logger.getLogger(BankAppTest.class);

    @Test
    public void testCreateBankAccount(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");

        BankAccountService bankAccountService = context.getBean(BankAccountService.class);
        BankAccountDetails bankAccountDetails = new BankAccountDetails();
        bankAccountDetails.setBalanceAmount(1100);
        bankAccountDetails.setLastTransactionTimestamp(new Date());

        int bankAccountId = bankAccountService.createBankAccount(bankAccountDetails);

        logger.info("Created bank account with id - " + bankAccountId);
    }

    @Test
    public void testGetAll(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        BankAccountService bankAccountService = context.getBean(BankAccountService.class);
        List<BankAccountDetails> bankAccountDetailsList = bankAccountService.getAll();
        for(BankAccountDetails b : bankAccountDetailsList){
            logger.info("list->"+b.getAccountId() + " : "+ b.getBalanceAmount());
        }

    }
}
