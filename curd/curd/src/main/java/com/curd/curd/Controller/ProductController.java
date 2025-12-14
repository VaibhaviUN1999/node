package com.curd.curd.Controller;

import com.curd.curd.Model.Product;
import com.curd.curd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getproducts()
    {
        return service.getproducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getbyid(@PathVariable("prodId")int prodId){
        return service.getbyId(prodId);
    }
    @PostMapping("/products")
    public void createproducts(@RequestBody Product prod)
    {
        service.createproducts(prod);
    }
    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod)
    {
        service.updateProducts(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public Product delete(@PathVariable("prodId") int prodId)
    {
        return service.delete(prodId);
    }






}
