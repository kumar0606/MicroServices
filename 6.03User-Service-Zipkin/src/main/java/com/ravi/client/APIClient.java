package com.ravi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ravi.dto.DepartmentDto;

@FeignClient(value = "DEPARTMENT-SERVICE-CLIENT-FEIGN")
public interface APIClient {
    @GetMapping(value = "/api/departments/{id}")
    DepartmentDto getDepartmentById(@PathVariable("id") Long id);
}