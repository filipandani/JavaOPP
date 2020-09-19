public abstract class Car implements Vehicles {
    //    public static class Finals{
//       final int fuelTankSize;
//       final String fuelType;
//       final int gear;
//       final float consumptionPer100Km ;
//        public Finals(int fuelTankSize, String fuelType, int gear, float consumptionPer100Km) {
//            this.fuelTankSize = fuelTankSize;
//            this.fuelType = fuelType;
//            this.gear = gear;
//            this.consumptionPer100Km = consumptionPer100Km;
//        }
//    }
    float availableFuel;
    int tireSize;
    String chassisNumber;
    float consumptionPer100Km1;
    int fuelTankSize;
    String fuelType;
    int gears;
    float consumptionPer100Km;
    switch (gears) {
        case 1:
            consumptionPer100Km1= (float) (consumptionPer100Km*1.5);
            break;
        case 2: consumptionPer100Km1=(float) (consumptionPer100Km*1.4);
            break;
        case 3: consumptionPer100Km1=(float) (consumptionPer100Km*1.3);
            break;
        case 4: consumptionPer100Km1=(float) (consumptionPer100Km*1.2);
            break;
        case 5: consumptionPer100Km1=(float) (consumptionPer100Km*1.1);
            break;
        default: consumptionPer100Km1=consumptionPer100Km;
    }
    @Override
    public boolean Start() {
        consumptionPer100Km1=0;
        return false;
    }
    @Override
    public boolean Stop() {

        return true;
    }
    @Override
    public float drive() {
        float drive = availableFuel/consumptionPer100Km1;
        return drive;
    }

}
