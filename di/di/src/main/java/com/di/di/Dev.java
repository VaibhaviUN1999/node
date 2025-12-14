package com.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer lap;

    @Autowired
    @Qualifier("desktop")
    private  Computer desktop;


    Dev(Laptop laptop) {
        this.lap=laptop;
    }

    public void setlaptop(Laptop laptop)
    {
         this.lap=laptop;
    }

    public void disp(){
        lap.compile();
        System.out.println("Dev compiling...");
        desktop.compile();
    }

}
