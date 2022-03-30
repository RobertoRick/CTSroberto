package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class AutobuzFactory implements Factory {
    @Override
    public MijlocTransport createObj(String nr) {
        return new Autobuz(nr);
    }
}
