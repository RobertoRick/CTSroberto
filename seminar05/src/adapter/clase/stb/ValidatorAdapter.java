package adapter.clase.stb;


import adapter.clase.metrou.ScannerMetrou;

public class ValidatorAdapter extends ScannerMetrou implements ValidatorSTB {
    @Override
    public void valideazaBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
