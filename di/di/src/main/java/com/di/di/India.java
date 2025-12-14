package com.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class India {

    @Autowired
    @Qualifier("bdvt")
    private Shimoga smg;

    @Autowired
    @Qualifier("karnataka")
    private Shimoga karnataka;

    public void nature()
    {
        smg.greenary();
        karnataka.greenary();
        System.out.println("India is bset country");
    }
}
