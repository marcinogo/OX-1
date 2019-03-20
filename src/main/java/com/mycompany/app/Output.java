package com.mycompany.app;

import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class Output {

    private MessagePrinter messagePrinter = new MessagePrinter();
    private Scanner scanner = new Scanner(System.in);

    public String chooseWhoStarts() {
        messagePrinter.print("Podaj 1, jezeli chcesz zeby zaczal gracz 'O', albo 2 jezeli ma zaczac 'X'");
        return scanner.nextLine();
    }

    public String setHeightOfNet() {
        messagePrinter.print("Podaj wysokosc siatki z przedzialu (3-100)");
        return scanner.nextLine();
    }

    public String setWidthOfNet() {
        messagePrinter.print("Podaj szerokosc siatki z przedzialu (3-100)");
        return scanner.nextLine();
    }

    public String setWinStreak() {
        messagePrinter.print(
                "Podaj ilosc znakow potrzebych do wygrania z przedzialu (3 - minimum z wysokosci/szerokosci siatki)");
        return scanner.nextLine();
    }

    public void wrongInput() {
        messagePrinter.print("Podales zle dane. Sprobuj jeszcze raz.");
    }

    public String userMove(User user) {
        messagePrinter.print("Ruch gracza " + user.toString() + ". Podaj pole w formacie 'r,k', gdzie r to rzad, a k to kolumna.");
        return scanner.nextLine();
    }

    public void winner(User user) {
        messagePrinter.print("Wygrywa gracz " + user.toString() + ".");
    }

    void printNet(Net net) {
        NetPrinter netPrinter = new NetPrinter(net);
        netPrinter.printNet();
    }
}
