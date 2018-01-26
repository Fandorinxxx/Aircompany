package entity;

public class TransportAirplane extends Airplane {
  private int capacityCarrying;
  public TransportAirplane(AirplaneModelName modelName, int boardNumber, int flyingRange,  int fuelUsage,int capacityCarrying) {
    super(modelName, boardNumber, flyingRange, fuelUsage);
    this.capacityCarrying = capacityCarrying;
   }

  public int getCapacityCarrying() {
    return capacityCarrying;
  }

  public void setCapacityCarrying(int capacityCarrying) {
    this.capacityCarrying = capacityCarrying;
  }
}
