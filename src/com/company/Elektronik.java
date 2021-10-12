package com.company;

import java.util.ArrayList;

public class Elektronik {
    public int billigeTastatur(ArrayList<Integer> tast)
    {int min=tast.get(0);
        for(int i=1;i<tast.size();i++)   //parcurg lista cu pretul tastaturilor
        {
            if(tast.get(i)<min)  //gasesc pretul cel mai mic
                min=tast.get(i);
        }
        return min;
    }
    public int teuererGegenstand(ArrayList<Integer> tast, ArrayList<Integer> usb) {
        int max1 = 0, max2 = 0;
        for (int i = 0; i < tast.size(); i++) {  //parcurg lista cu pretul tastaturilor
            if (tast.get(i) > max1)
                max1 = tast.get(i);  //gasesc pretul cel mai mare
        }
        for (int j = 0; j < usb.size(); j++) {  //parcurg lista cu pretul usb-urilor
            if (usb.get(j) > max2)
                max2 = usb.get(j);   //gasesc pretul cel mai mare
        }
        if (max1 > max2)  //compar cele doua preturi gasite si il returnez pe cel mai mare
            return max1;
        else
            return max2;
    }
        public int budgetUSB(ArrayList<Integer> usb, int budget) {
        int max=0;
            for (int i = 0; i < usb.size(); i++) {  //parcurg lista cu pretul usb-urilor
                if (usb.get(i) > max && usb.get(i) <= budget)  //caut pretul cel mai mare, care sa fie mai mic decat bugetul avut
                    max = usb.get(i);
            }
        return max;
        }

    public int budget (ArrayList<Integer> tast, ArrayList<Integer> usb, int budget){
        int max = -1,sum=0;
        for(int i = 0 ; i < tast.size(); i++){  //parcurg ambele liste simultan
            for(int j = 0; j < usb.size(); j++){
                sum = tast.get(i) + usb.get(j);  //calculez suma tuturor elementelor ambelor liste
                if(sum > max && sum <= budget) {
                    max = sum; //maximul devine suma daca suma este mai mare decat maximul si mai mica decat bugetul
                }
            }
        }
        return max;
    }
}
