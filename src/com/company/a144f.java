package com.company;

import java.util.Scanner;

public class a144f {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nOpcions = scanner.nextInt();

        float[] click = new float[nOpcions];  // guardarem quantes voltes s'ha fet click en cada opcio
        float[] show = new float[nOpcions];   // guardarem quantes voltes s'ha mostrat cada opcio

        // inicialitzem totes les opcions a:   1 click / 1 show
        for (int i = 0; i < nOpcions; i++) {
            click[i] = 1;
            show[i] = 1;
        }

        // anem llegint les accions dels usuaris (fer click o no)
        int nAccions = scanner.nextInt();
        for (int i = 0; i < nAccions; i++) {

            // busquem la opcio que te major ratio clicks/shows
            int opcioMax = 0;
            for (int j = 0; j < show.length; j++) {
                if(click[j]/show[j] > click[opcioMax]/show[opcioMax]){
                    opcioMax = j;
                }
            }

            // marquem que aquesta opcio s'ha mostrat una vegada mes
            show[opcioMax]++;

            // mirem si l'usuari ha fet click o no
            boolean c = scanner.nextBoolean();
            if(c){
                // si ha fet click augmentem el comptador de clicks
                click[opcioMax]++;
            }
        }

        // mostrem els percentatges finals de cada opcio
        System.out.print("[");
        for (int i = 0; i < nOpcions - 1; i++) {
            System.out.print(click[i]/show[i]*100 + ", ");
        }
        System.out.print(click[nOpcions-1]/show[nOpcions-1]*100 + "]");
    }
}
