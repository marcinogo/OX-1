package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
public class OXApp {


    //TODO:: WRup - testowy main, jedynie na potrzeby wyswietlania probnej siatki gry. Pozniej przeniesc do glownej petli gry.
    public static void main(String[] args) {
        //FIXME::WRup - jak nie ogranicze jakos max. planszy to bedzie kaszana xD
        NetSettings netSettings = new NetSettings(10, 10);
        NetCreator netCreator = new NetCreator(netSettings);
        Net net = netCreator.createNet();
        MoveMaker moveMaker = new MoveMaker(Sign.X, 2, 2, net);
        moveMaker.putSign();
        moveMaker = new MoveMaker(Sign.X, 3, 3, net);
        moveMaker.putSign();
        moveMaker = new MoveMaker(Sign.X, 4, 4, net);
        moveMaker.putSign();
        NetPrinter netPrinter = new NetPrinter(net);
        netPrinter.printNet();

    }
}
