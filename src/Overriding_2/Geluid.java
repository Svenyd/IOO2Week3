package Overriding_2;

public class Geluid {

    private String geluid;

    public Geluid(String geluid) {
        this.geluid = geluid;
    }

    @Override
    public String toString() {
        return geluid;
    }
}
