package chain_of_responsability.clase;

public class TroleibuzHandler extends Handler {
    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandat(int distanta) {
        if(distanta < super.limita){
            System.out.println("Mijlocul recomandat este Troleibuzul pt distante intre 5 si 10 km");
        }else{
            super.nextHandler.afisareRecomandat(distanta);
        }
    }
}
