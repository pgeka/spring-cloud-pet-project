package com.eugenep.catalog.controller;

import com.eugenep.catalog.model.ProductEntity;
import com.eugenep.catalog.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog/products")
public class CatalogController {

    private final ProductService productService;

    @GetMapping("/id/{id}")
    private ProductEntity getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @GetMapping("/sku/{sku}")
    private List<ProductEntity> getProductListBySku(@PathVariable String sku) {
        return productService.getProductListBySku(sku);
    }

}
