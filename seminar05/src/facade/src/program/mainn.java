package facade.src.program;


import facade.src.clase.Autobuz;
import facade.src.clase.Facade;

public class mainn {
    public static void main(String[] args){

        Facade autobuzFacade = new Facade(new Autobuz());
        autobuzFacade.deschideToateUsile();
        autobuzFacade.liberToateUsile();
    }
}