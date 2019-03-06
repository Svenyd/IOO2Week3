package Overriding_2;

public class Kat implements Dier {

    private Geluid geluid;

    public Kat(Geluid geluid) {
        this.geluid = geluid;
    }

    @Override
    public void maakGeluid() {
        System.out.println("Kat: " + geluid.toString());
    }
}
