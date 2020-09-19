public class Sandero extends Dacia{
    Sandero (int availableFuel,String chassisNumber){}
    public Sandero() {
        super.fuelTankSize = 20;
        super.fuelType = "Diesel";
        super.gears = 17;
        super.consumptionPer100Km = (float) 4.6;
        super.tireSize=15;
    }

    @Override
    public float drive() {
        float drive = availableFuel/consumptionPer100Km1;
        return super.drive();
    }
}
