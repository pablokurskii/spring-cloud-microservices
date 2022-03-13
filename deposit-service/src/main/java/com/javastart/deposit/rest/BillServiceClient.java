package com.javastart.deposit.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bill-service")
public interface BillServiceClient {

    @GetMapping("/bills/{billId}")
    BillResponseDTO getBillById(@PathVariable("billId") Long billId);

    @PutMapping("/bills/{billId}")
    void update(@PathVariable("billId") Long billId, BillRequestDTO billRequestDTO);

    @GetMapping("/bills/account/{accountId}")
    List<BillResponseDTO> getBillsByAccountId(@PathVariable("accountId") Long accountId);

}
