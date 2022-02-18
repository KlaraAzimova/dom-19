package com.company;

import java.util.Arrays;

public class Obshejitya implements Arenda {
    private String adress;
    private Person[] obshejitya;

    @Override
    public void payment() {
        System.out.println("Obshejitya arenda toloyt");

    }

    public Obshejitya(String adress, Person[] obshejitya) {
        this.adress = adress;
        this.obshejitya = obshejitya;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getObshejitya() {
        return obshejitya;
    }

    public void setObshejitya(Person[] obshejitya) {
        this.obshejitya = obshejitya;
    }

    @Override
    public String toString() {
        return "Obshejitya{" +
                "adress='" + adress + '\n' +
                ", obshejitya=" + Arrays.toString(obshejitya) +
                '}';
    }
}