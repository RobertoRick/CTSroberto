package adapter.main;


import adapter.clase.stb.ValidatorAdapter;

public class Program {
    public static void main(String[] args){
        ValidatorAdapter scanner = new ValidatorAdapter();
        scanner.valideazaBilet();
        scanner.valideazaAbonamentMetrou();
    }
}
