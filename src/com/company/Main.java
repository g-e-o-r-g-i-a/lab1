package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1");
        Noten noten = new Noten();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(95,63,70,80,44,15,89,28));
        System.out.println(a1);
        System.out.println("1. Der Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.");
        System.out.println(noten.nicht_ausreichend(a1));
        System.out.println("Der Rückgabewert soll die Methode den Durchschnittswert liefern.");
        System.out.println(noten.durchschnitt(a1));
        System.out.println("Der Rückgabewert soll die Methode eine Array mit die abgerundete Noten liefern.");
        System.out.println(noten.abgerundet(a1));
        System.out.println("Der Rückgabewert soll die Methode die maximale abgerundete Note liefern.");
        System.out.println(noten.max_ab_Note(a1));
        System.out.println("\n Aufgabe 2");
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4,8,3,10,17));
        System.out.println(a2);
        PositiveZ pos = new PositiveZ(a2);
        System.out.println("1. Finden Sie die maximale Zahl");
        System.out.println(pos.max());
        System.out.println("2. Finden Sie die minimale Zahl");
        System.out.println(pos.min());
        System.out.println("3. Finden Sie die maximale Summe von n-1 Zahlen.");
        System.out.println(pos.max_summe());
        System.out.println("4. Finden Sie die minimale Summe von n-1 Zahlen.");
        System.out.println(pos.min_summe());
        System.out.println("\n Aufgabe 3");
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(1,3,0,0,0,0,0,0,0));
        ArrayList<Integer> a4 = new ArrayList<>(Arrays.asList(8,7,0,0,0,0,0,0,0));
        ArrayList<Integer> a5 = new ArrayList<>(Arrays.asList(2,3,6,0,0,0,0,0,0));
        ArrayList<Integer> a6 = new ArrayList<>(Arrays.asList(8,3,0,0,0,0,0,0,0));
        ArrayList<Integer> a7 = new ArrayList<>(Arrays.asList(5,4,0,0,0,0,0,0,0));
        int ziffer=2;
        ZweiZ aufg3 = new ZweiZ();
        System.out.println("1.Summe:");
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(aufg3.summe(a4, a3));
        System.out.println("2.Differenz:");
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(aufg3.differenz(a6, a7));
        System.out.println("3.Multiplikation:");
        System.out.println(a5);
        System.out.println(ziffer);
        System.out.println(aufg3.multipikation(a5,ziffer));
        System.out.println("4.Division:");
        System.out.println(a5);
        System.out.println(ziffer);
        System.out.println(aufg3.division(a5,ziffer));
        System.out.println("\n Aufgabe 4");
        ArrayList<Integer> a8 = new ArrayList<>(Arrays.asList(40,35,70,15,45));
        ArrayList<Integer> a9 = new ArrayList<>(Arrays.asList(15,20,10,35));
        ArrayList<Integer> a10 = new ArrayList<>(Arrays.asList(20,15,40,15));
        ArrayList<Integer> a11 = new ArrayList<>(Arrays.asList(15,45,20));
        ArrayList<Integer> a12 = new ArrayList<>(Arrays.asList(40,50,60));
        ArrayList<Integer> a13 = new ArrayList<>(Arrays.asList(8,12));
        ArrayList<Integer> a14 = new ArrayList<>(Arrays.asList(60));
        int budget1=30;
        int budget2=60;
        Elektronik aufg4 = new Elektronik();
        System.out.println("1. Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.");
        System.out.println(a8);
        System.out.println(aufg4.billigeTastatur(a8));
        System.out.println("2. Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.");
        System.out.println(a9);
        System.out.println(a10);
        System.out.println(aufg4.teuererGegenstand(a9,a10));
        System.out.println("3.Schreiben Sie eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen kann, zurückgibt.");
        System.out.println(a11);
        System.out.println("Budget: 30");
        System.out.println(aufg4.budgetUSB(a11,budget1));
        System.out.println("4.Finden Sie, anhand Markus’ Budget und der Preislisten für die Tastaturen und USB-Laufwerke, den maximalen Geldbetrag, der von Markus ausgegeben wird. ");
        System.out.println(a12);
        System.out.println(a13);
        System.out.println("Budget: 60");
        System.out.println(aufg4.budget(a12,a13,budget2));
        System.out.println("Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten Gegenstände.");
        System.out.println(a14);
        System.out.println(a13);
        System.out.println("Budget: 60");
        System.out.println(aufg4.budget(a13,a14,budget2));



    }
}
class Noten {
    public ArrayList<Integer> nicht_ausreichend(ArrayList<Integer> array) {
        ArrayList<Integer> noten = new ArrayList<>(); //creez o lista
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 40)  //verific daca notele sunt sau nu sub 40
                noten.add(array.get(i));  //adaug valorile ce-mi indeplinesc conditia in lista creata
        }
        return noten;
    }

    public double durchschnitt(ArrayList<Integer> array) {
         double sum=0;
        for (int i = 0; i < array.size(); i++) {  //parcurg lista cu note
            sum=sum+array.get(i);  //le fac suma
        }
        return sum/ array.size();  //impart suma la numarul de note din lista
    }

    public ArrayList<Integer> abgerundet (ArrayList<Integer> array) {
        ArrayList<Integer> noten = new ArrayList<>();
        int r1, r2;
        for(int i=0;i<array.size();i++) {
            if (array.get(i) > 42) {  //notele sub 42 nu au cum sa fie rotunjite
                if (array.get(i) % 10 == 3 || array.get(i) % 10 == 8) { //daca ultima cifra e 3 sau 8
                    r1 = array.get(i) + 2;  //adaug 2 pentru a le rotunji
                    noten.add(r1);
                } else if (array.get(i) % 10 == 4 || array.get(i) % 10 == 9) {  //daca ultima cifra e 4 sau 9
                    r2 = array.get(i) + 1;   //adaug 1 pentru a le rotunji
                    noten.add(r2);
                }
            }
        }
        return noten;
    }
    public int max_ab_Note(ArrayList<Integer> array) {
        int max=0;
        int r1,r2;
        ArrayList<Integer> abgerundeteNoten = new ArrayList(); //creez o lista pentru toate notele rotunjite
        for(int i=0; i<array.size();i++) {
            if (array.get(i) >= 43 && array.get(i) <= 94) {
                if (array.get(i) % 10 == 3 || array.get(i) % 10 == 8) {
                    r1 = array.get(i) + 2;
                    abgerundeteNoten.add(r1);
                } else if (array.get(i) % 10 == 4 || array.get(i) % 10 == 9) {  //rotunjesc notele dupa caz
                    r2 = array.get(i) + 1;
                    abgerundeteNoten.add(r2);  //le adaug in lista creata
                }
            }
        }
       for(int j=0;j<abgerundeteNoten.size();j++) {  //parcurg lista de note rotunjite
           if(abgerundeteNoten.get(j) > max)  //gasesc valoarea cea mai mare
               max=abgerundeteNoten.get(j); }
       return max;
            }
        }
