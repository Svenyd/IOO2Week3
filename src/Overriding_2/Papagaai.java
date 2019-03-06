package Overriding_2;

public class Papagaai implements Dier {

    private String naam;
    private Geluid geluid;

    public Papagaai(String naam, Geluid geluid) {
        this.naam = naam;
        this.geluid = geluid;
    }

    @Override
    public void maakGeluid() {
        System.out.println(naam + ": " + geluid.toString());
    }
}
