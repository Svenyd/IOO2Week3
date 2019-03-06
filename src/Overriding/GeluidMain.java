package Overriding;

public class GeluidMain {
    public static void main(String[] args) {

        Papagaai papagaai = new Papagaai();
        papagaai.maakGeluid();

        Vuurwerk vuurwerk = new Vuurwerk();
        vuurwerk.maakGeluid();
    }
}
