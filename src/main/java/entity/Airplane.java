package entity;

public class Airplane extends AbstractVehicle implements  Comparable<Airplane> {
  private AirplaneModelName modelName;
  private int boardNumber;
  private int flyingRange;
  private int fuelUsage;

  public Airplane(AirplaneModelName modelName, int boardNumber, int flyingRange, int fuelUsage) {
    this.modelName = modelName;
    if(boardNumber>=Constants.MIN_BOARD_NUMBER){
      this.boardNumber = boardNumber;
    } else {
      System.out.println("Incorrect boardNumber value");
    }
    if(flyingRange>=Constants.MIN_FLYING_RANGE){
      this.flyingRange = flyingRange;
    } else {
      System.out.println("Incorrect flyingRange value");
    }

  }

  public Airplane() {
  }

  public int getFuelUsage() {
    return fuelUsage;
  }

  public void setFuelUsage(int fuelUsage) {
    if(Constants.MIN_FUEL_USAGE<=fuelUsage && fuelUsage<=Constants.MAX_FUEL_USAGE){
      this.fuelUsage = fuelUsage;
    } else {
      this.fuelUsage = Constants.DEFAULT_FUEL_USAGE;
    }
  }

  public void setModelName(AirplaneModelName modelName) {
    this.modelName = modelName;
  }

  public void setBoardNumber(int boardNumber) {
    this.boardNumber = boardNumber;
  }

  public void setFlyingRange(int flyingRange) {
    this.flyingRange = flyingRange;
  }

  public AirplaneModelName getModelName() {
    return modelName;
  }

  public int getBoardNumber() {
    return boardNumber;
  }

  public int getFlyingRange() {
    return flyingRange;
  }

  @Override
  public String toString() {

    if(this instanceof PassangerAirplane){
      return String.format("Airplane %15s, board number - %7d, flying range %6d, fuel consumption %3d, econom %3d ,business %3d",
                  modelName, boardNumber, flyingRange,fuelUsage ,((PassangerAirplane) this).getEconomPlace(),
                 ((PassangerAirplane) this).getBusinessPlace());
    }

    if(this instanceof TransportAirplane){
      return String.format("Airplane %15s, board number - %7d, flying range %6d, fuel consumption %3d,  cargo %5d",
          modelName, boardNumber, flyingRange,fuelUsage,((TransportAirplane) this).getCapacityCarrying());
    }

    return "";
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null||getClass() != o.getClass()) return false;

    Airplane airplane = (Airplane) o;

    return boardNumber == airplane.boardNumber;
  }

  @Override
  public int hashCode() {
    return 31+boardNumber;
  }

  @Override
  public int compareTo(Airplane o) {
    if(o==null){
      return -1;
    }else {
      return flyingRange-o.flyingRange;
    }
  }

}
