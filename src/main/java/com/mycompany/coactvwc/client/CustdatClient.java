package com.mycompany.coactvwc.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("custdatmicro")
public interface CustdatClient {

    @GetMapping("api/custdats")
    ResponseEntity<List<Map>> getCustdatsByCustId(@RequestParam("custId") Integer custId);
}