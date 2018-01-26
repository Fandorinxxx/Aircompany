import static creator.GenerateTestData.generateSomeAirplane;
import static logic.CompanyOutputData.calculateTotalCargo;
import static logic.CompanyOutputData.calculateTotalPassangerPlace;


import java.util.Scanner;


import entity.Aircompany;
import logic.CompanyOutputData;
import service.Menu;


public class AirlineMain {

  public static void main(String[] args) {
    Menu menu = new Menu();
    Aircompany aircompany = new Aircompany();
    aircompany.setCompanyName("American Airlines");
    Scanner scanner = new Scanner(System.in);
      while (true) {

        menu.show();
        int selection=0;
        int minFuelconsumption=0;
        int maxFuelconsumption=0;
        try {
        String selectionString = scanner.nextLine();
        selection = Integer.parseInt(selectionString);
        }catch (NumberFormatException e){}
        System.out.println("");

        if (keystrokeProcessing(aircompany, scanner, selection, minFuelconsumption, maxFuelconsumption))
          break;
      }
  }

  private static boolean keystrokeProcessing(Aircompany aircompany, Scanner scanner, int selection, int minFuelconsumption, int maxFuelconsumption) {
    if (selection==1){
      System.out.println("1. Calculate the total capacity and carrying capacity of all the aircraft in the airline.");
      calculateTotalPassangerPlace(aircompany);
      calculateTotalCargo(aircompany);
    }
    if (selection==2) {
      System.out.println("2. Display the list of aircraft of the company sorted by flight range.");
      System.out.println(aircompany);
      aircompany.show();}

    if (selection==3) {
      System.out.println("3. Find airplanes corresponding to a given range of fuel consumption parameters.");

        System.out.print("Please enter the minimum fuel consumption :");
        try {
          String minFuelconsumptionString = scanner.nextLine();
          minFuelconsumption = Integer.parseInt(minFuelconsumptionString);
        } catch (NumberFormatException e) {
        }
      System.out.print("");
      System.out.print("Please enter the maximum fuel consumption :");
      try {
        String maxFuelconsumptionString = scanner.nextLine();
        maxFuelconsumption = Integer.parseInt(maxFuelconsumptionString);
      } catch (NumberFormatException e) {
      }
      aircompany.show(minFuelconsumption,maxFuelconsumption);;
    }
    if (selection==4) {
      System.out.println("4. Generate a test data - 10 Airplans.");
      generateSomeAirplane(aircompany);
      System.out.println("Data was generated.");}

    if (selection==5) System.out.println(aircompany);

    if (selection==6) {
      System.out.println("Good bay!!!");
      return true;
    }
    return false;
  }


}
