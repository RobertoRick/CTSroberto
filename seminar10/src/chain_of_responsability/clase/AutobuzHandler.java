package chain_of_responsability.clase;

public class AutobuzHandler extends Handler {
    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandat(int distanta) {
        if(distanta < super.limita){
            System.out.println("Mijlocul recomandat este autobuzul pt distanta mai mici de 3 km");
        }else{
            super.nextHandler.afisareRecomandat(distanta);
        }
    }
}
