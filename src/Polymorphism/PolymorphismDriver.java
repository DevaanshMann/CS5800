package Polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args) {

        Ship[] Ships = new Ship[3];

        Ships[0] = new Ship("The Queen Mary", "1936");
        Ships[1] = new CruiseShip("Carnival Breeze", "2012", 4428);
        Ships[2] = new CargoShip("The Evergreen", "1968", 235579);

        for (Ship ship : Ships) {
            ship.print();
            System.out.println();
        }

    }
}
