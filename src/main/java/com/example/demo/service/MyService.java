package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Cacheable(value = "myCache", key = "#id")
    public String getData(Long id) {
        // Giả lập xử lý phức tạp hoặc truy cập dữ liệu từ nguồn chậm
        return "Data for ID " + id;
    }
}