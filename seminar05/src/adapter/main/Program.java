package adapter.main;


import adapter.clase.metrou.ScannerMetrou;
import adapter.clase.stb.ScannerSTB;
import adapter.clase.stb.ValidatorAdapter;

public class Program {
    public static void main(String[] args){
        ValidatorAdapter scanner = new ValidatorAdapter();
        scanner.valideazaBilet();
        scanner.valideazaAbonament();
        ScannerSTB stb = new ScannerSTB();
        stb.valideazaBilet();
        ScannerMetrou scannerMetrou = new ScannerMetrou();

    }
}
