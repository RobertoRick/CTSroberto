package composite.src.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Nod {
    private String nume;
    private List<Nod> noduri;

    public Grup(String nume) {
        this.nume = nume;
        this.noduri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        noduri.add(nod);
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        noduri.remove(nod);
    }

    @Override
    public void descriere() {
        for (Nod nod : noduri) {
            nod.descriere();
        }
    }

    @Override
    public Nod getNod(int index) throws Exception {
        return noduri.get(index);
    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        float suma = 0;
        for (Nod nod : noduri){
            suma+= nod.calculeazaSumaGarantie(pretPeLoc);
        }
        return suma;
    }
}
