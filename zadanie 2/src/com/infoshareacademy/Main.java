package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Wybierz działanie do wykoniania: " + MathCalc.Odejmowanie + " czy " + MathCalc.Dodawanie + " czy " + MathCalc.Dzielenie + " czy " + MathCalc.Mnozenie);

        while (true) {

            Scanner dzialania = new Scanner(System.in);
            String wybranieDzialanie = dzialania.nextLine();

            if (MathCalc.Mnozenie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Newtonie");
                System.out.println();

                //  pobieranieLiczb { blablabla

                Scanner wczytaj = new Scanner(System.in);
                System.out.print("Ile liczb chcesz użyć do działania? ");
                System.out.println();
                int ileLiczb = wczytaj.nextInt();

                if (ileLiczb<=0){
                    System.out.println("Wybierz dodatnią liczbę gołąbie!");
                    break;
                }
                System.out.println("Wybrałeś " + ileLiczb + " liczb(y) do działania " + wybranieDzialanie + ".");
                System.out.println();
                double[] tab = new double[ileLiczb];
                for (int i = 0; i < ileLiczb; i++) {
                    int s = i + 1;
                    System.out.println("Podaj " + s + " liczbę do " + wybranieDzialanie + ":");
                    tab[i] = wczytaj.nextDouble();
                }
                System.out.println();
//  }
                int wynik = 0;
                for (int i = 0; i < ileLiczb; i++) {

                    wynik *= tab[i];

                                    }
                System.out.println("Wynik Twojego działania to: " + wynik);

                break;
            } else if (MathCalc.Dzielenie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Pitagorasie");
                System.out.println();
                break;
            } else if (MathCalc.Dodawanie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Arystotelesie");
                System.out.println();
                break;
            } else if (MathCalc.Odejmowanie.toString().equals(wybranieDzialanie)) {
                System.out.println("Wybrałeś " + wybranieDzialanie + " Archimedesie");
                System.out.println();
                break;
            } else {
                System.out.println(" Wybrałeś złe działanie, spróbuj jeszcze raz gołąbie!");
                System.out.println();

            }
        }


    }
}
