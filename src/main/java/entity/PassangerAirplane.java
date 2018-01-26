package entity;

public class PassangerAirplane extends Airplane {
  private int economPlace;
  private int businessPlace;


  public PassangerAirplane(AirplaneModelName modelName, int boardNumber, int flyingRange,  int fuelUsage, int economPlace, int businessPlace) {
    super(modelName, boardNumber, flyingRange, fuelUsage);
    this.economPlace = economPlace;
    this.businessPlace = businessPlace;
  }

  public void setEconomPlace(int economPlace) {
    this.economPlace = economPlace;
  }

  public void setBusinessPlace(int businessPlace) {
    this.businessPlace = businessPlace;
  }

  public int getEconomPlace() {
    return economPlace;
  }

  public int getBusinessPlace() {
    return businessPlace;
  }
}
