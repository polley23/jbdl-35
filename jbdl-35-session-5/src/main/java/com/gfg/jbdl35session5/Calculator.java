package com.gfg.jbdl35session5;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Calculator implements ICalculator{

    @Autowired
    @Qualifier("Mult")
    private Multiplier multiplier;
    public int add(int a , int b){
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        log.info("Calculator 1");
        log.info(String.valueOf(multiplier.hashCode()));
        return multiplier.mul(a,b);
    }


}
