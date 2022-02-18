package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] family = {new Person("Chynara", 18),
                new Person("Dinara", 20),
                new Person("Klara", 30),
                new Person("Gulnara", 22),
                new Person("Munara", 21),
                new Person("Sabira", 20),
                new Person("Nurgul", 20),
                new Person("Nurzada", 20)};


        Person[] kvartira = {new Person("Chynara", 18),
                new Person("Dinara", 20),
                new Person("Klara", 30)};


        Person[] obshejitya = {new Person("Jamilya", 19),
                new Person("Sabira", 20),
                new Person("Nurgul", 20)};


        Person[] gosti = {new Person("Gulnura", 22),
                new Person("Munara", 21),
                new Person("Nurzada", 20)};

        Kvartira kvartiranty = new Kvartira("Ak-Orgo 12", kvartira);
        int count = 0;
        for (Person i : kvartira) {
            System.out.println(i);
            count++;
        }
        System.out.println("Kvartirada" + " " + count + " " + " kishi jashait"+" "+ kvartiranty.getAdress());
        kvartiranty.payment();
        System.out.println("************************************************");

        Obshejitya studenty = new Obshejitya("Ahunbaeva-175", obshejitya);
        count = 0;
        for (Person o : obshejitya) {
            System.out.println(o);
            count++;
        }
        System.out.println("Obshejitiyada" + " " + count + " " + " student jashait"+" "+ studenty.getAdress());
        studenty.payment();
        System.out.println("************************************************");

        Gostnisa konoktor = new Gostnisa("Sovetskaya 100", gosti);
        count = 0;
        for (Person g : gosti) {
            System.out.println(g);
            count++;
        }
        System.out.println("Gostnisada" + " " + count + " " + " konok bar"+" "+konoktor.getAdress());
        konoktor.payment();
        System.out.println("************************************************");


    }
}
