package template.main;

import template.clase.Tramvai;
import template.clase.TramvaiProbe;

public class mian {
    public static void main(String[] args) {
        Tramvai tramvai = new Tramvai();
        tramvai.parcurgeTraseu();
        TramvaiProbe tramvaiprobe = new TramvaiProbe();
        tramvaiprobe.parcurgeTraseuInvers();
    }
}
