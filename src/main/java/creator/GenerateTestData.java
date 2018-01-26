package creator;

import java.util.Random;

import entity.Aircompany;
import entity.Airplane;
import entity.AirplaneModelName;
import entity.PassangerAirplane;
import entity.TransportAirplane;

public  class GenerateTestData {
  public static Aircompany generateSomeAirplane(Aircompany aircompany) {
    Airplane airplane=null;
    for (int i = 0; i<5; i++) {
    Random ran = new Random();
    int number = ran.nextInt(99999) + 10000;
    int flyingRange = ran.nextInt(9999) + 10;
    int fuelUsage = ran.nextInt(999) + 10;
    int economPlace =100;
    int businessPlace = 50;
  airplane = new PassangerAirplane(AirplaneModelName.values()[new Random().nextInt(AirplaneModelName.values().length)], number, flyingRange, fuelUsage, economPlace, businessPlace);
   airplane.setFuelUsage(fuelUsage);
   airplane.setVehicleId(number/2);
   airplane.setModelName(AirplaneModelName.values()[new Random().nextInt(AirplaneModelName.values().length)]);
    ((PassangerAirplane) airplane).setBusinessPlace(businessPlace);
    ((PassangerAirplane) airplane).setEconomPlace(economPlace);
    aircompany.add(airplane);
      airplane =null;
  }

    for (int i = 0; i<5; i++) {
      Random ran = new Random();
      int number = ran.nextInt(99999) + 10000;
      int flyingRange = ran.nextInt(9999) + 10;
      int fuelUsage = ran.nextInt(999) + 10;
      int cargo = 5000;
      airplane = new TransportAirplane(AirplaneModelName.values()[new Random().nextInt(AirplaneModelName.values().length)], number, flyingRange, fuelUsage, cargo);
      airplane.setFuelUsage(fuelUsage);
      airplane.setVehicleId(number/2);
      airplane.setModelName(AirplaneModelName.values()[new Random().nextInt(AirplaneModelName.values().length)]);
      ((TransportAirplane) airplane).setCapacityCarrying(cargo);
      aircompany.add(airplane);
      airplane =null;
    }




    return aircompany;
  }

}
