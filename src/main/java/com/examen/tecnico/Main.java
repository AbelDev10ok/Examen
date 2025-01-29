package com.examen.tecnico;

public class Main {

    public static void main(String[] args) throws Exception {

        EncontrarSumaArray encontrarSuma = new EncontrarSumaArray();
        

        System.out.println(encontrarSuma.encontrarSuma(new int[]{1,2,4,4}, 8));
        System.out.println(encontrarSuma.encontrarSuma(new int[]{1,4,3,9}, 8));

        System.out.println(encontrarSuma.encuentraSumaEficiente(new int[]{1,2,4,4}, 8));
        System.out.println(encontrarSuma.encuentraSumaEficiente(new int[]{1,4,3,9}, 8));
    }
}
