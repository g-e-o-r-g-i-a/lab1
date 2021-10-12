package com.company;

import java.util.ArrayList;

public class ZweiZ {

    public int array_to_int (ArrayList<Integer> array) {  //metoda pentru transformarea unei liste intr-un numar de tip int
        int i, erg = 0;
        for (i = 0; i < array.size(); i++)
            erg = 10 * erg + array.get(i);
        return erg;
    }

    public ArrayList<Integer> int_to_array(int zahl) {  //metoda pentru transformarea unui numar de tip int intr-o lista
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (; zahl != 0; zahl /= 10)
            ar.add(zahl % 10);
        for(int j=ar.size()-1;j>=0;j--)
            arr.add(ar.get(j));

        return arr;
    }

    public ArrayList<Integer> summe (ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int z1,z2;
        z1 = array_to_int(a1);  //convertesc listele in numere
        z2 = array_to_int(a2);
        int sum=0;
        ArrayList<Integer> array_sum = new ArrayList<>();
        sum= z1 + z2;  //le fac suma
        array_sum = int_to_array(sum);  //convertesc suma inapoi in array
        return array_sum;

    }
    public ArrayList<Integer> differenz (ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int z1,z2;
        z1 = array_to_int(a1);  //convertesc listele in numere
        z2 = array_to_int(a2);
        int diff=0;
        ArrayList<Integer> array_diff = new ArrayList<>();
        diff= z1 - z2;  //socotesc diferenta
        array_diff = int_to_array(diff);   //convertesc diferenta inapoi in array
        return array_diff;

    }

    public ArrayList<Integer> multipikation (ArrayList<Integer> a1, int ziffer) {
        int z1;
        z1 = array_to_int(a1);  //convertesc lista in numere
        int multi=0;
        ArrayList<Integer> array_multi = new ArrayList<>();
        multi= z1 * ziffer;  //socotesc produsul
        array_multi = int_to_array(multi);   //convertesc produsul inapoi in array
        return array_multi;

    }

    public ArrayList<Integer> division (ArrayList<Integer> a1, int ziffer) {
        int z1;
        z1 = array_to_int(a1);  //convertesc lista in numere
        int div=0;
        ArrayList<Integer> array_div = new ArrayList<>();
        div= z1 / ziffer;  //socotesc impartirea
        array_div = int_to_array(div);  //convertesc impartirea inapoi in array
        return array_div;

    }
}
