package chain_of_responsability.clase;

public class MetrouHandler extends Handler {

    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandat(int distanta) {
        if(distanta < super.limita){
            System.out.println("Mijlocul recomandat este metroul pt distanta mai mari de 10 km");
        }
    }
}
