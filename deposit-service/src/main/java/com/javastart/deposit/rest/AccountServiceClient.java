package com.javastart.deposit.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service")
public interface AccountServiceClient {
    @GetMapping("accounts/{accountId}")
    AccountResponseDTO getAccountById(@PathVariable("accountId") Long accountId);
}
