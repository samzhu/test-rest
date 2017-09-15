package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class TestControllert {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "v1/test")
    public Map<String, String> test() {
        Map<String, String> data = new HashMap<String, String>();
        data.put("rc", "1");
        data.put("version", "1.0");
        return data;
    }
}
