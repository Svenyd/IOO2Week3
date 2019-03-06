package Overriding;

public class Vuurwerk implements Geluid {

    @Override
    public void maakGeluid() {
        System.out.println("Kaboem kaboem");
    }
}
