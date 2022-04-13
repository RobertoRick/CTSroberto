package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class Metrou  extends MijlocTransport {
    protected Metrou(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Metrou{"+nrInmatriculare+"}";
    }
}
