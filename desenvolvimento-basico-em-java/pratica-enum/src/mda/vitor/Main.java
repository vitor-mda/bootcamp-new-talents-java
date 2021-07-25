package mda.vitor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static Tetrapoda tetrapoda;

    public static void main(String[] args) {
        System.out.println(
                "-----------------------------------\n" +
                "             TETRAPODA             \n" +
                "            SUPER CLASS            \n" +
                "-----------------------------------\n" +
                "Tetrapods are four-limbed animals.\n" +
                "Select one of the classes below\n" +
                "for more info about them.\n");

        run();
    }

    private static void run() {
        printValues();
        selectClass();
        printInfo();
        rerun();
    }

    private static void printValues() {
        for(Tetrapoda t : Tetrapoda.values()) {
            System.out.printf("%d. %s%n", t.getIndex(), t.name());
        }
    }

    private static void selectClass() {
        System.out.print("\nChosen class index: ");
        tetrapoda = Tetrapoda.values()[getIndex()];
    }

    private static int getIndex() {
        int n;

        try {
            n = sc.nextInt();

            if(!(n >= 0 && n < Tetrapoda.values().length)) {
                printError();
                return getIndex();
            }

            return n;
        } catch(InputMismatchException e) {
            printError();
            return getIndex();
        }
    }

    private static void printError() {
        System.out.print("\nPlease type a valid index: ");
        sc.nextLine();
    }

    private static void printInfo() {
        System.out.printf(
                "-----------------------------------%n" +
                "%s information:%n%n" +
                "Number of species: %d%n" +
                "Species examples:%n",
                tetrapoda.getName(), tetrapoda.getSpeciesNumber()
        );

        for(String species : tetrapoda.getExamples()) {
            System.out.printf("\t- %s%n", species);
        }

        System.out.println("-----------------------------------");
    }

    private static void rerun() {
        char option;


        System.out.println("Type 1 to rerun or 0 to exit");
        option = sc.next().charAt(0);

        if(option == '0') {
            sc.close();
            System.out.println("Thanks for using the program. Ciao ciao!");
            System.exit(0);
        }

        sc.nextLine();
        run();
    }
}