package factoryMethod;

import singlefactory.familie.MijlocTransport;

import javax.swing.plaf.metal.MetalToggleButtonUI;

public class MainFactoryMeth {

    public static void main(String[] args){
        Factory factoryAutobuz = new AutobuzFactory();
        Factory factoryTroleibuz = new TroleibuzFactory();
        Factory factoryTramvai = new TramvaiFactory();
        Factory factoryMetrou = new MetrouFactory();

        MijlocTransport autobuz = factoryAutobuz.createObj("B-123-ASD");
        MijlocTransport troleibuz = factoryTroleibuz.createObj("B-123-MMM");
        MijlocTransport tramvai = factoryTramvai.createObj("B-123-ASD");
        MijlocTransport metrou = factoryMetrou.createObj("B-123-ASD");

        System.out.println(autobuz);
        System.out.println(troleibuz);
        System.out.println(tramvai);
        System.out.println(metrou);
    }
}
