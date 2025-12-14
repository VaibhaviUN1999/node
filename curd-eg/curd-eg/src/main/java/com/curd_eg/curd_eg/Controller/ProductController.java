package com.curd_eg.curd_eg.Controller;


import com.curd_eg.curd_eg.Model.Product;
import com.curd_eg.curd_eg.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts()
    {
        return service.getproducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getbyid(@PathVariable("prodId") int prodId)
    {
        return service.getbyid(prodId);
    }
    @PostMapping("/products")
    public void addproducts(@RequestBody Product prod)
    {
        service.addproducts(prod);
    }
    @PutMapping("/products")
    public void updateprod(@RequestBody Product prod){
        service.updateprod(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public Product deleteprod(@PathVariable("prodId") int prodId)
    {
        return service.deleteprod(prodId);
    }
}
