package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class second {

    public  BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
    public ArrayList<String> lista = new ArrayList<String>();
    public ArrayList<String> valor = new ArrayList<String>();
    private String val;

    public second(){
        val = "";
        this.val = val;
    }

    public second(String val){
        this.val = val;
    }
    public String getval(){
        return this.val;
    }
    public void imprimirval(){
        System.out.println(this.val);
    }

    public void Longitud() throws IOException {
       /* Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        System.out.println("Impresion de la lista implementando Longitud: ");
        crear();
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
        Collections.sort(valor, (String d1, String d2) -> d1.compareTo(d2));

        imprimir();
        System.out.println("\n");
    }

    public void crear() throws IOException {
        String val;
        String num;

        System.out.println("Ingrese una palabra");
        for(int x=0;x<10;x++){
            System.out.print("Palabra " + (x+1) + ": ");
            val = t.readLine();
            lista.add(val);
        }

        System.out.println("Ingrese un numero");
        for(int x=0;x<10;x++){
            System.out.print("Palabra " + (x+1) + ": ");
            num = t.readLine();
            valor.add(num);
        }

    }

    public void imprimir(){

        for(String i: lista){
            System.out.print(i+", " );
        }

        for(String f: valor){
            System.out.print(f+", " );
        }
    }



}
