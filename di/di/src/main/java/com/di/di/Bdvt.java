package com.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Bdvt implements Shimoga {

    public void greenary(){
        System.out.println("famous for steel...");
    }
}
