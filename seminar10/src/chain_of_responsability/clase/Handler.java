package chain_of_responsability.clase;

public abstract class Handler {
    protected Handler nextHandler;
    protected int limita;

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    public Handler(int limita) {
        this.nextHandler = null;
        this.limita = limita;
    }

    public abstract void afisareRecomandat(int distanta);

}
