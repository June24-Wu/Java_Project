package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tries tries = new Tries();
        tries.insert("car");
        tries.insert("care");
        System.out.println(tries.contain("car"));
    }

}
