package com.company;

import java.util.Arrays;

public class Kvartira implements KomUsluga {
    private String adress;
    private Person[] kvartira;

    public Kvartira(String adress, Person[] kvartira) {
        this.adress = adress;
        this.kvartira = kvartira;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person[] getKvartira() {
        return kvartira;
    }

    public void setKvartira(Person[] kvartira) {
        this.kvartira = kvartira;
    }


    @Override
    public String toString() {
        return "Kvartira{" +
                "adress='" + adress + '\n' +
                ", kvartira=" + Arrays.toString(kvartira) +
                '}';
    }

    @Override
    public void payment() {
        System.out.println("Kvarira kom usluga toloit");
    }
}
