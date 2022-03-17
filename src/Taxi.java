public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double f)
    {
        super(licensePlate, tollFee, passengers, electric);
        fareCollected = f;
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric?: " + isElectric() + "\nDiscount applied?" + isDiscountApplied() + "\nTotal fare collected: " + fareCollected);
    }
}