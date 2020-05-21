package cardealership;

public class Car extends Vehicle implements Leaseable, Discountable {
    // Simple Car constructor inheriting all of the methods and properties of
    // Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        return super.getTargetMargin() - 1000;
        // Use the getTargetMargin method as its defined in our superclass (Vehicle)
    }

    @Override
    public boolean isLeaseable() {
        return true;
    }

    @Override
    public int getLeaseTerm() {
        return 24;
    }

    @Override
    public int getMaxMilesPerYear() {
        return 15_000;
    }

    // Implementing methods from IDiscountable
    @Override
    public float getMaximumDiscountPct() {
        return 18.5f;
    }

    @Override
    public float getPersonDiscount() {
        return 12.5f;
    }

    @Override
    public float getCorporateDiscount() {
        return 20.0f;
    }
}