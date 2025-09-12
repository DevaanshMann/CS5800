package Polymorphism;

class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String shipName, String yearBuilt, int tonnage) {
        super(shipName, yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + getShipName());
        System.out.println("Maximum cargo capacity (in tonnage): " + getTonnage());
    }
}
