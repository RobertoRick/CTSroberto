package factoryMethod;

import singlefactory.familie.MijlocTransport;

public interface Factory {
    MijlocTransport createObj(String nr);
}
