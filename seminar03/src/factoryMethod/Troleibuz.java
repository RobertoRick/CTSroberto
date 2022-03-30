package factoryMethod;

import singlefactory.familie.MijlocTransport;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz{"+nrInmatriculare+"}";
    }
}
