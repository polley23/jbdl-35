package com.gfg.jbdl35session5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Qualifier("Mult2")
public class Mult2 implements Multiplier{
    @Override
    public int mul(int a, int b) {
        log.info("In multiplier 2 impl");
        return a*b;
    }
}
