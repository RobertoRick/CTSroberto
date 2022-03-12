package source;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZoo ingrijitor;
    private List<Animal> listAnimale;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(IngrijitorZoo ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public List<Animal> getListAnimale() {
        return listAnimale;
    }

    public void setListAnimale(List<Animal> listAnimale) {
        this.listAnimale = listAnimale;
    }

    public ZOO(String nume, IngrijitorZoo ingrijitor) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.listAnimale = new ArrayList<>();
    }

        public void adaugaAnimal(Animal animal){
            listAnimale.add(animal);
        }
    public void hranesteAnimale(){
        for (Animal a : listAnimale){
            ingrijitor.hranesteAnimal(a,"iarba");
        }
    }
}

