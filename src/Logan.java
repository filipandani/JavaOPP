public class Logan extends Dacia{
    Logan (int availableFuel,String chassisNumber){}
    public Logan() {
        super.fuelTankSize = 40;
        super.fuelType = "Petrol";
        super.gears = 5;
        super.consumptionPer100Km = (float) 5.3;
        super.tireSize=15;
    }
    @Override
    public float drive() {
        float drive = availableFuel/consumptionPer100Km1;
        return super.drive();
    }
}
