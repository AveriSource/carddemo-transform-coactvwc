package com.mycompany.coactvwc.client;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("cxacaixmicro")
public interface CxacaixClient {

    @GetMapping("api/cxacaixes")
    ResponseEntity<List<Map>> getAllCxacaixes();
}