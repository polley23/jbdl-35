package com.gfg.jbdl35session5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Calculator2 implements ICalculator{

    @Autowired
    @Qualifier("Mult2")
    Multiplier multiplier;

    public int add(int a , int b){
        return a+b+100;
    }

    @Override
    public int mul(int a, int b) {
        log.info("Calculator 2");

        log.info(String.valueOf(multiplier.hashCode()));
        return multiplier.mul(a,b);
    }
}
