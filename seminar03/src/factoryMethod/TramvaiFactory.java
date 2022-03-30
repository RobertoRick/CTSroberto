package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class TramvaiFactory implements Factory{

    @Override
    public MijlocTransport createObj(String nr) {
        return new Tramvai(nr);
    }
}
