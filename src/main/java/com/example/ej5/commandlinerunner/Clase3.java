package com.example.ej5.commandlinerunner;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase3 {
    @PostConstruct
    public void clase2(){
        System.out.println("Hola soy clase 3");
    }
}