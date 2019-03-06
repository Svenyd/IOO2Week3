package Overriding_2;

public class GeluidMain {

    public static void main(String[] args) {
        Dier papagaai = new Papagaai("Koppiekrauw", new Geluid("Screeeh"));
        Dier kat = new Kat(new Geluid("Meow"));

        papagaai.maakGeluid();
        kat.maakGeluid();
    }
}
