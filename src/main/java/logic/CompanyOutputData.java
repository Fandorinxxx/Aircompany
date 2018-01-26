package logic;

import java.util.Set;

import entity.Aircompany;
import entity.Airplane;
import entity.PassangerAirplane;
import entity.TransportAirplane;

public class CompanyOutputData {
 public static void    calculateTotalPassangerPlace(Aircompany company) {
    int totalPlace=0;

    Set<Airplane> airplanes=company.getAirplanes();
    for(Airplane tmp: airplanes){
      if(tmp instanceof PassangerAirplane){
        totalPlace+=((PassangerAirplane) tmp).getBusinessPlace()+((PassangerAirplane) tmp).getEconomPlace();
      }
    }

    System.out.println("");
    System.out.println("Total passanger place - "+totalPlace );
    System.out.println("");


  }
  public static void calculateTotalCargo(Aircompany company) {
    int totalCargo=0;

    Set<Airplane> airplanes=company.getAirplanes();
    for(Airplane tmp: airplanes){
      if(tmp instanceof TransportAirplane){
        totalCargo+=((TransportAirplane) tmp).getCapacityCarrying();
      }
    }

    System.out.println("");
    System.out.println("Total Cargo : "+totalCargo );
    System.out.println("");


  }

}
