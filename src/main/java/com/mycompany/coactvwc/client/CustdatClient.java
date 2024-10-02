package com.mycompany.coactvwc.client;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// import com.mycompany.custdatpkg.service.dto.CustdatDTO;


@FeignClient("custdatmicro")
public interface CustdatClient {

    @GetMapping("api/custdats/{id}")
    ResponseEntity<Map> getCustdat(@PathVariable("id") Long id);
}