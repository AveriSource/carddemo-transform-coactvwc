package com.mycompany.coactvwc.client;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("acctdatmicro")
public interface AcctdatClient {

    @GetMapping("api/acctdats/{id}")
    public ResponseEntity<Map> getAcctdat(@PathVariable("id") Long id);
}