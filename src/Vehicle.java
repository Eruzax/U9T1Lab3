public class Vehicle
{
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers)
  {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public String getLicensePlate()
  {
    return licensePlate;
  }

  public double getTollFee()
  {
    return tollFee;
  }

  public int getPassengers()
  {
    return passengers;
  }

  public void setPassengers(int p)
  {
    passengers = p;
  }

  public void setTollFee(double n)
  {
    tollFee = n;
  }
  public double calculateTollPrice()
  {
    return tollFee * passengers;
  }

  public void printInfo()
  {
    System.out.println("License Plate: " + licensePlate + "\nToll Fee: " + tollFee + "\nPassengers: " + passengers);
  }
}