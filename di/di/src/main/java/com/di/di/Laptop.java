package com.di.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements  Computer {

       public void compile()
       {
           System.out.println("laptop");
       }
}
