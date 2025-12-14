package com.curd_eg.curd_eg.Service;

import com.curd_eg.curd_eg.Model.Product;
import com.curd_eg.curd_eg.Repositary.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


    @Autowired
    ProductRepo repo;

    /*List<Product> products=new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Vivo", 20000)
    ));*/
    public List<Product> getproducts() {
        // return products;
        return repo.findAll();
    }

    public Product getbyid(int prodId) {

        /*return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst()
                .orElse(new Product(0,"no-data",0));*/
        return repo.findById(prodId).orElse(new Product());
    }

    public void addproducts(Product prod) {
        // products.add(prod);
        repo.save(prod);
    }

    public void updateprod(Product prod) {
        /*int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prod.getProdId())
             index=i;
        products.set(index,prod);*/
        repo.save(prod);
    }

    // public Product deleteprod(int prodId) {
        /*int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prodId)
                index=i;
        return products.remove(index);*/
    //  return repo.deleteById(prodId);


    //}

    public Product deleteprod(int prodId) {
        Product prod = repo.findById(prodId).orElse(null);
        if (prod != null) {
            repo.deleteById(prodId);
        }
        return prod;


    }
}
