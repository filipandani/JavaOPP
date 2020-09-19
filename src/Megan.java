public class Megan extends Renault {
    Megan (int availableFuel,String chassisNumber){}
    public Megan(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km) {
        super.fuelTankSize = 55;
        super.fuelType = "Diesel";
        super.gears = 6;
        super.consumptionPer100Km =(float)6.2;
        super.tireSize=18;
    }

    @Override
    public float drive() {
        float drive = availableFuel/consumptionPer100Km1;
        return super.drive();
}
}
