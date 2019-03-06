package Overloading;

public class Figuur {
    public double geefOppervlakte(double width) {
        //doe iets
        return 0;
    }

    public double geefOppervlakte(double height, double width) {
        //doe iets
        return 1;
    }

    public double geefOppervlakte(float diameter) {
        //doe iets
        return 2;
    }

    public static void main(String[] args) {
        Figuur figuur = new Figuur();

        System.out.println(figuur.geefOppervlakte(0));
        System.out.println(figuur.geefOppervlakte(1,1));
        System.out.println(figuur.geefOppervlakte(2));
    }
}
