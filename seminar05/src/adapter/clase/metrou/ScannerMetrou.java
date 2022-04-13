package adapter.clase.metrou;

public class ScannerMetrou implements ValidatorMetrou{
    @Override
    public void valideazaBiletMetrou() {
        System.out.println("A fost validat BILETUL de metrou");
    }

    @Override
    public void valideazaAbonamentMetrou() {
        System.out.println("A fost validat ABONAMENTUL de metrou");
    }
}
