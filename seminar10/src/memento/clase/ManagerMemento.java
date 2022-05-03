package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<MementoAutobuz> lista;

    public ManagerMemento(){
        this.lista = new ArrayList<>();
    }
     public void addMemento(MementoAutobuz memento){
        lista.add(memento);
     }
     public MementoAutobuz getMemento (int index){
        return lista.get(index);
     }
}
