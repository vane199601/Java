package pl.emil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj swoje imie:");
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        Scanner scan2 = new Scanner(System.in);
        String nazwisko = scan2.nextLine();
        System.out.println("Witaj " + imie + " " +nazwisko);
    }
}
