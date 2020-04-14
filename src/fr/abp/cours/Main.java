package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte mois = 0;
        byte nbJours = 0;
        short annee;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("De quel mois s'agit il (entrer le numéro correspondant au mois)?:");
        mois = lectureClavier.nextByte();
        System.out.println("De quelle année s'agit il ?");
        annee = lectureClavier.nextShort();
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nbJours = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nbJours = 30;
                break;

            case 2:
                if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
                break;
            default:
                System.out.println("Impossible, ce mois n'existe pas !");
                System.exit(0);
        }
        System.out.println("En " + annee + ", le mois n°" + mois + " a " + nbJours + " jours");

    }
}
