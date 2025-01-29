package com.examen.tecnico;

import java.util.HashSet;
import java.util.Set;

public class EncontrarSumaArray {

    public boolean encontrarSuma(int[]aray, int num){
        if(aray.length==0){
            return false;
        }
        for(int i= 0; i<=aray.length-1; i++){
            for(int j= i+1; j<aray.length; j++){
                if(aray[i]+aray[j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean encuentraSumaEficiente(int[] array, int requiredSum) {
        if(array.length==0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            int complemento = requiredSum - num;
            if (set.contains(complemento)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
