package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class MetrouFactory implements Factory {
    @Override
    public MijlocTransport createObj(String nr) {
        return new Metrou(nr);
    }
}
