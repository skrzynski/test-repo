package com.company.palindromy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerSlowo = new Scanner(System.in);
        System.out.println("Podaj słowo / zdanie: ");
        String slowo = scannerSlowo.nextLine();

        String slowoPoUsunieciuSpacji = slowo.replace(" ", "");
        int dlugoscSlowa = slowoPoUsunieciuSpacji.length();


        int kk = 0; //ze nie bedzie palindromem
        int k = (dlugoscSlowa - 1);
        for (int i = 0; i < dlugoscSlowa; i++) {
            if (slowoPoUsunieciuSpacji.charAt(i) != slowoPoUsunieciuSpacji.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");

            System.out.println("Witaj świecie palindromow, pszybyszu!");
        }
    }
}
