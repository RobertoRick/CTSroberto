package adapter.clase.stb;

public class ScannerSTB implements ValidatorSTB{
    @Override
    public void valideazaBilet() {
        System.out.println("A fost validat BILETUL de STB");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("A fost validat ABONAMENTUL de STB");
    }
}
