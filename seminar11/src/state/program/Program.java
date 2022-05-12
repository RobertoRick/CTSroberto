package state.program;


import state.clase.Autobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(120);
        autobuz.pleacaInCursa();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
    }
}
