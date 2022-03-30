package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransport createObj(String nr) {

        return new Troleibuz(nr);
    }
}
