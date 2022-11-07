package org.example;

import java.util.ServiceLoader;

import org.api.API;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<API> apis = ServiceLoader.load(API.class);
        for (API api : apis) {
            System.out.println("The service " + api.getClass().getSimpleName() + " says "  + api.Get());
        }
    }
}