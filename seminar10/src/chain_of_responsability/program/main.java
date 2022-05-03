package chain_of_responsability.program;

import chain_of_responsability.clase.AutobuzHandler;
import chain_of_responsability.clase.MetrouHandler;
import chain_of_responsability.clase.TramvaiHandler;
import chain_of_responsability.clase.TroleibuzHandler;

public class main {
    public static void main(String[] args) {
        AutobuzHandler autobuzHandler = new AutobuzHandler(3);
        TroleibuzHandler troleibuzHandler = new TroleibuzHandler(5);
        TramvaiHandler tramvaiHandler = new TramvaiHandler(8);
        MetrouHandler metrouHandler = new MetrouHandler(1000);

        autobuzHandler.setNextHandler(troleibuzHandler);
        troleibuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        autobuzHandler.afisareRecomandat(300);
    }
}
