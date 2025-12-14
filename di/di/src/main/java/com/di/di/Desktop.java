package com.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Autowired
    public void compile()
    {
        System.out.println("Desktop...");
    }
}
