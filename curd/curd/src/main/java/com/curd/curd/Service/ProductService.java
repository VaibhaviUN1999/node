package com.curd.curd.Service;


import com.curd.curd.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


    List<Product>list=new ArrayList<>(Arrays.asList(
            new Product(101, "Samsung", 20000),
            new Product(102, "Vivo", 25000))
    );

    public List<Product> getproducts()
    {
        return list;
    }
    public Product getbyId(int prodId) {
        return list.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst()
                .orElse(new Product(0,"no-data",0));
    }

    public void createproducts(Product prod) {
        list.add(prod);
    }

    public void updateProducts(Product prod) {
        int index=0;
        for(int i=0;i<list.size();i++)
            if(list.get(i).getProdId()==prod.getProdId())
                index=i;
        list.set(index,prod);
    }

    public Product delete(int prodId) {
        int index=0;
        for(int i=0;i<list.size();i++)
            if(list.get(i).getProdId()==prodId)
                index=i;
        return list.remove(index);
        }

}
