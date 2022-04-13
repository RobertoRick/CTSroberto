package composite.src.programm;

import composite.src.clase.Autobuz;
import composite.src.clase.Grup;
import composite.src.clase.Nod;

public class main {
    public static void main(String[] args) throws Exception {
        Nod autobuz1 = new Autobuz("Mercedes","S63",45);
        Nod autobuz2 = new Autobuz("BMW","M8",34);
        Nod autobuz3 = new Autobuz("BMW","Series7",65);
        Nod autobuz4 = new Autobuz("BMW","F10",35);
        Nod autobuz5 = new Autobuz("Mercedes","S63",80);
        Nod autobuz6 = new Autobuz("Mercedes","S63",90);

        Grup flota = new Grup("grup total");
        Grup mici = new Grup("grup mic");
        Grup medii = new Grup("grup mediu");
        Grup mari= new Grup("grup mare");
try {
    mici.adaugaNod(autobuz2);
    mici.adaugaNod(autobuz4);

    medii.adaugaNod(autobuz1);
    medii.adaugaNod(autobuz3);

    mari.adaugaNod(autobuz5);
    mari.adaugaNod(autobuz6);

    flota.adaugaNod(mici);
    flota.adaugaNod(medii);
    flota.adaugaNod(mari);
}catch (Exception e){}
        System.out.println("Pret per total: "+ flota.calculeazaSumaGarantie(25));
        System.out.println("Pret pentru grup mic: "+mici.calculeazaSumaGarantie(25));
        System.out.println("Pret pentru grup mediu: "+medii.calculeazaSumaGarantie(25));
        System.out.println("Pret pentru grup mare: "+mari.calculeazaSumaGarantie(25));

    }
}
