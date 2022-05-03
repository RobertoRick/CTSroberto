package memento.clase;

public class Autobuz {
    private String numeSofer;
    private int consumMediu;
    private int nrLocuri;
    private String model;
    private int anFabricatie;

    public Autobuz(String numeSofer, int consumMediu, int nrLocuri, String model, int anFabricatie) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.nrLocuri = nrLocuri;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(int consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", nrLocuri=" + nrLocuri +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }

    public MementoAutobuz creazaMemento(){
        return new MementoAutobuz(this.numeSofer,this.consumMediu);
    }

    public void seteazaMemento(MementoAutobuz mementoAutobuz){
        this.numeSofer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }
}
