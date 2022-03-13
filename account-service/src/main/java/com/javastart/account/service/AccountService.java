package com.javastart.account.service;

import com.javastart.account.entity.Account;
import com.javastart.account.exception.AccountNotFoundException;
import com.javastart.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Account getAccountById(Long accountId){
        return accountRepository.findById(accountId)
                .orElseThrow(()->new AccountNotFoundException("No such account with id: " + accountId));
    }

    public Long createAccount(String name, String phone, String email, List<Long> bills){
        Account account = new Account(name,phone,email, OffsetDateTime.now(),bills);
        return accountRepository.save(account).getAccountId();
    }

    public Account updateAccount(Long accountId, String name, String phone, String email, List<Long> bills){
        Account account = new Account();
        account.setAccountId(accountId);
        account.setName(name);
        account.setEmail(email);
        account.setPhone(phone);
        account.setBills(bills);
        return accountRepository.save(account);
    }

    public Account deleteAccount(Long accountId){
        Account deletedAccount = getAccountById(accountId);
        accountRepository.deleteById(accountId);
        return deletedAccount;
    }
}
