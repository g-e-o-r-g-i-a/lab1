package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class PositiveZ {
    private ArrayList<Integer> zahlen;
    public PositiveZ(ArrayList<Integer> zahlen) {
        this.zahlen=zahlen;
    }
public int max() {  //metoda pentru determinarea elementului cu valoarea maxima din lista existenta
    int max=0;
    for(int i=0;i< this.zahlen.size();i++) {
        if(this.zahlen.get(i)>max)
            max=this.zahlen.get(i);
    }
    return max;

}

    public int min() {    //metoda pentru determinarea elementului cu valoarea minima din lista existenta
        int min = 2147483647;
        for (int i = 0; i < this.zahlen.size(); i++) {
            if (this.zahlen.get(i) < min)
                min = this.zahlen.get(i);
        }
        return min;
    }
public int max_summe () {
    int min = 2147483647;
    int sum=0;
    for (int i = 0; i < this.zahlen.size(); i++) {  //caut minimul din lista existenta
        if (this.zahlen.get(i) < min)
            min = this.zahlen.get(i);
    }
    for(int i=0;i< this.zahlen.size();i++) {  //calculez suma tuturor elementelor
        sum=sum+this.zahlen.get(i);
    }
    sum=sum-min;  //scad minimul din suma precizata pentru a detrmina suma cu valoarea maxima a listei
    return sum;
}

    public int min_summe() {


        int max=0;
        int sum=0;
        for(int i=0;i< this.zahlen.size();i++) {  //caut maxima din lista existenta
            if(this.zahlen.get(i)>max)
                max=this.zahlen.get(i);
        }
        for(int i=0;i< this.zahlen.size();i++) {   //calculez suma tuturor elementelor
            sum=sum+this.zahlen.get(i);
        }
        sum=sum-max;   //scad maximul din suma precizata pentru a detrmina suma cu valoarea minima a listei
        return sum;

    }

}
