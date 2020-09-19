public class Zoe extends Renault {
    Zoe (int availableFuel,String chassisNumber){}
    public Zoe() {
        super.fuelTankSize = 100;
        super.fuelType = "GPL";
        super.gears = 6;
        super.consumptionPer100Km = (float)12;
        super.tireSize=17;
    }

    @Override
    public float drive() {
        float drive = availableFuel/consumptionPer100Km1;
        return super.drive();
    }
}
