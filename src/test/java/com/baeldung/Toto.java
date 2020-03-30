package com.baeldung;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Toto {
    @Value("${attribute1}")
    private String attribute1;
    @Value("${attribute2}")
    private String attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }
}
