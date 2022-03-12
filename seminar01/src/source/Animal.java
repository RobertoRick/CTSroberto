package source;

public abstract class Animal {
    private String nume;

    public String getNume() {
        return nume;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public abstract void mananca(String mancare);
}
