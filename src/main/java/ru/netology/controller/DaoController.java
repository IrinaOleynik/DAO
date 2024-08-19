package ru.netology.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.repository.DaoRepository;

import java.util.List;

@RestController
public class DaoController {
    private final DaoRepository daoRepository;

    public DaoController(DaoRepository daoRepository) {
        this.daoRepository = daoRepository;
    }
    @GetMapping("/products/fetch-product")
    public ResponseEntity<List<String>> getProducts(@RequestParam String name) {
        List<String> products = daoRepository.getProductName(name);
        return ResponseEntity.ok(products);
    }
}
