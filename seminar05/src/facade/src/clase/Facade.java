package facade.src.clase;

public class Facade {
    public Autobuz autobuz;

    public Facade(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideToateUsile(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberToateUsile(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }

}
