package entity;

public abstract class AbstractVehicle {
  private long vehicleId;
  private String vehicleModel;

  public long getVehicleId() {
    return vehicleId;
  }

  public AbstractVehicle() {
  }

  public void setVehicleId(long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }


}
