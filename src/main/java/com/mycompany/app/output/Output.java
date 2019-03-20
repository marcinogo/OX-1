package com.mycompany.app.output;



import com.mycompany.app.net.Net;
import com.mycompany.app.net.NetPrinter;

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
        messagePrinter.print("Podaj ilosc znakow potrzebych do wygrania z przedzialu (3 - minimum z wysokosci/szerokosci siatki");
        return scanner.nextLine();
    }
    public void wrongInput(){
        messagePrinter.print("Podales zle dane. Sprobuj jeszcze raz.");
    }
}
