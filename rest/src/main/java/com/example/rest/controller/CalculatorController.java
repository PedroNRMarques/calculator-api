package com.example.rest.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public Map<String, Object> sum(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", calculatorService.add(a, b));
        return response;
    }

    @GetMapping("/subtract")
    public Map<String, Object> subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", calculatorService.subtract(a, b));
        return response;
    }

    @GetMapping("/multiply")
    public Map<String, Object> multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", calculatorService.multiply(a, b));
        return response;
    }

    @GetMapping("/divide")
    public Map<String, Object> divide(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", calculatorService.divide(a, b));
        return response;
    }
}
