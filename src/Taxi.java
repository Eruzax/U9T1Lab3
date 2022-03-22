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

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        int numRiders = getPassengers() - 1;
        fareCollected += numRiders * farePerRider;
        return dropOffPassengers(numRiders);
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }
}