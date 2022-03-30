package singlefactory;

import singlefactory.familie.Autobuz;
import singlefactory.familie.MijlocTransport;
import singlefactory.familie.Tramvai;
import singlefactory.familie.Troleibuz;

public class Factory {

    public MijlocTransport createObject(TipTransport tip, String nr){
        switch(tip){
            case AUTOBUZ:
                return new Autobuz(nr);
            case TRAMVAI:
                return new Tramvai(nr);
            case TROLEIBUZ:
                return new Troleibuz(nr);
            default:
                return null;
        }
    }
}
