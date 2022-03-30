package mainn;

import singlefactory.Factory;
import singlefactory.TipTransport;
import singlefactory.familie.MijlocTransport;

public class Main {

    public static void main(String[] args){
        Factory factory = new Factory();
        MijlocTransport autobuz = factory.createObject(TipTransport.AUTOBUZ,"B-999-CTS");
        MijlocTransport tramvai = factory.createObject(TipTransport.TRAMVAI,"B-999-AUR");
        MijlocTransport troleibuz = factory.createObject(TipTransport.TROLEIBUZ,"B-999-RRR");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

    }
}
