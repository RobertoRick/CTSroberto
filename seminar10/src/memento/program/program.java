package memento.program;

import memento.clase.Autobuz;
import memento.clase.ManagerMemento;

public class program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Silviu",30,40,"Dacia",1985);
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.addMemento(autobuz1.creazaMemento());
        autobuz1.setNumeSofer("Roberto");
        autobuz1.setConsumMediu(50);
        System.out.println(autobuz1.toString());
        autobuz1.seteazaMemento(managerMemento.getMemento(0));
        System.out.println(autobuz1.toString());
    }
}
