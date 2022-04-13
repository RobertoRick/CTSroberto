package composite.src.clase;

public class Autobuz implements Nod {
    public String producator;
    public String model;
    public int numarLocuri;

    public Autobuz(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }


    @Override
    public void adaugaNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate adauga");
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate sterge");
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public Nod getNod(int index) throws Exception {
        throw new Exception("Nu se poate obtine");
    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        return numarLocuri * pretPeLoc;
    }
}
