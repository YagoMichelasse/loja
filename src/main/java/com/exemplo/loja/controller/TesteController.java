package com.exemplo.loja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TesteController {
    @GetMapping("/teste")
    public String TestController() {
        return "API funcionando!";
    }
}
