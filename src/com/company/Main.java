package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String anzahlspieler = "Wie viele Spieler wollen spielen?
        System.out.println("Wie viele Spieler wollen spielen? ");
        Scanner sc = new Scanner(System.in);
        int anzahlspieler = sc.nextInt();

        if (anzahlspieler == 1) {
            System.out.println("Guten Tag! Wir spielen jetzt ein Spiel: das Nimm-Spiel!");
            System.out.println("Es sind 15 Streichhölzer auf einem Tisch. Jeder darf bis zu 3 Streichhölzer nehmen. Der letzte, der eins zieht, gewinnt");
            //String spieler = "Wie willst du heißen?"
            System.out.println("Spieler, wie willst du heißen?");
            String spieler = sc.next();
            System.out.println("Hallo, Spieler 1 dein Name ist " + spieler);
            System.out.println("Du spielst gegen den Computer. ");
            System.out.println("Okay " + spieler + "! Bist du bereit? Denn jetzt geht´s los! " + spieler + " beginnt. ");
            //String zahl = "Hier soll eine zahl rein (1 - 3): "

            int hoelzer = 15;
            int runde = 1;
            String aktuellerSpieler;

            while (hoelzer > 0) {
                // wer ist dran?
                if (runde % 2 != 0) {
                    // ungerade zahl spieler1
                    aktuellerSpieler = spieler;

                    if (hoelzer > 1) {
                        System.out.println(spieler + " Wie viele Streichhölzer willst du dir holen (1 - 3)? Es sind noch " + hoelzer + " Streichhölzer übrig.");
                    }else {
                        System.out.println(spieler + " Wie viele Streichhölzer willst du dir holen (1 - 3)? Es sind noch " + hoelzer + " Streichholz übrig.");
                    }
                    int zahleins = sc.nextInt();

                    if (zahleins > 3 || zahleins < 1) {
                        System.out.println("Bitte eine zahl von 1 - 3:");
                        continue;
                    } else {
                        hoelzer = hoelzer - zahleins;
                        runde++;
                    }
                } else {
                    Random wuerfel = new Random();
                    int zahlc;
                    int max = 3;
                    if (hoelzer == 2) {
                        max = 2;
                    } else if (hoelzer == 1) {
                        max = 1;
                    }

                    zahlc = 1 + wuerfel.nextInt(max);

                    System.out.println("Der Computer hat " + zahlc + " Streichhölzer genommen.");

                    hoelzer = hoelzer - zahlc;
                    runde++;
                }
            }
            if (runde % 2 == 0) {
                System.out.println("Herzlichen Glückwunsch " + spieler + "! Du hast gewonnen!");
            } else {
                System.out.println("GAME OVER! " + spieler + " hat leider verloren.");
            }
        } else if (anzahlspieler == 2) {

                // write your code here
                System.out.println("Guten Tag! Wir spielen jetzt ein Spiel: das Nimm-Spiel!");
                System.out.println("Es sind 15 Streichhölzer auf einem Tisch. Jeder darf bis zu 3 Streichhölzer nehmen. Der letzte, der eins zieht, gewinnt");
                //String eins = "Hier soll dein Name sein";
                System.out.println("Spieler 1, Wie willst du heißen?");
                String eins = sc.next();
                System.out.println("Hallo, Spieler 1 dein Name ist " + eins);
                //String zwei = "Hier soll dein Name sein";
                System.out.println("Spieler 2, Wie willst du heißen?");
                String zwei = sc.next();
                System.out.println("Hallo, Spieler 2 dein Name ist " + zwei);

                System.out.println("Okay " + eins + " und " + zwei + "! Seid ihr bereit? Denn jetzt geht´s los! " + eins + " beginnt.");
                //String zahleins = "Hier soll eine Zahl rein (von 1 - 3): ";

                int hoelzer = 15;
                int runde = 1;
                String aktuellerSpieler;

                while (hoelzer > 0) {
                    // wer ist dran?
                    if (runde % 2 != 0) {
                        // ungerade zahl spieler1
                        aktuellerSpieler = eins;
                    } else {
                        // gerade zahl spieler2
                        aktuellerSpieler = zwei;
                    }

                    if (hoelzer > 1) {
                        System.out.println(aktuellerSpieler + " Wie viele Streichhölzer willst du dir holen (1 - 3)? Es sind noch " + hoelzer + " Streichhölzer übrig.");
                    }else {
                        System.out.println(anzahlspieler + " Wie viele Streichhölzer willst du dir holen (1 - 3)? Es sind noch " + hoelzer + " Streichholz übrig.");
                    }
                    int zahleins = sc.nextInt();

                    // prüfe was der Spieler eingegeben hat
                    if (zahleins > 3 || zahleins < 1) {
                        System.out.println("Bitte eine zahl von 1 - 3:");
                    } else {
                        hoelzer = hoelzer - zahleins;
                        runde++;

                        if (hoelzer == 0) {
                            System.out.println("Herzlichen Glückwunsch! Der Sieger ist: " + aktuellerSpieler + "!");
                        }
                    }
                }
            }
        }
    }