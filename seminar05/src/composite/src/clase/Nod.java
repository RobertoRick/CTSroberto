package composite.src.clase;

public interface Nod {
    public void adaugaNod(Nod nod) throws Exception;
    public void stergeNod(Nod nod) throws Exception;
    public void descriere();
    public Nod getNod(int index) throws Exception;

    float calculeazaSumaGarantie(float pretPeLoc);
}
