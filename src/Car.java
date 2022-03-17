public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public boolean isElectric()
  {
    return electric;
  }

  public void printCar()
  {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric?: " + electric + "\nDiscount applied?" + discountApplied);
  }

  public boolean dropOffPassengers(int numOut)
  {
    if(getPassengers() > numOut)
    {
      setPassengers(getPassengers() - numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount()
  {
    if (discountApplied == false)
    {
      if (isElectric())
      {
        setTollFee(getTollFee() * 0.5);
        discountApplied = true;
      }
    }
  }
}