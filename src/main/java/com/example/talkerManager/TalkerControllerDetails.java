package com.example.talkerManager;


import java.util.ArrayList;


public class TalkerControllerDetails {

    static ArrayList<TalkerControllerDetails> Data = new ArrayList<TalkerControllerDetails>();

    public int number;
    public String name;

    public TalkerControllerDetails(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
}
