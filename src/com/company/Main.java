package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        String n;
        second lista = new second();
        referencia rf = second::new;

        List<second> segundo = Arrays.asList();

        interfase x = new interfase() {
            public void Anonimo() throws IOException {
                BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> lista = new ArrayList<String>();
                ArrayList<String> valor = new ArrayList<String>();

                String val;
                String num;

                System.out.println("Impresion de la lista implementando Clases Anónimas");
                System.out.println("Ingrese una letra");
                for(int x=0;x<10;x++){
                    System.out.print("Palabra " + (x+1) + ": ");
                    val = t.readLine();
                    lista.add(val);
                    System.out.println();
                }

                System.out.println("Ingrese un numero");
                for(int x=0;x<10;x++){
                    System.out.print("Palabra " + (x+1) + ": ");
                    num = t.readLine();
                    valor.add(num);
                    System.out.println();
                }
                //Ordenar  por orden numerico
                Collections.sort(lista);
                Collections.sort(valor);

                for(String i: valor){
                    System.out.print(i + ", " );
                }
                System.out.println();
                for(String f: valor){
                    System.out.print(f + ", " );
                }
            }
        };

        lista.Longitud();
        x.Anonimo();
        for(int i=0;i<10;i++){
            String f= t.readLine();
            second primero = rf.crearValor(f);
            primero.getval();
        }
    }
    //FALTA REFERENCIA
    public static class prueba{
        public void referencia(second val){

            System.out.println("Impresion de la lista implementando Referencia");
            System.out.println(val.getval());
        }
    }
}