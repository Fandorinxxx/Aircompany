package entity;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Aircompany {
  private String companyName;
  private Set<Airplane> airplanes=new TreeSet<Airplane>();

  public Aircompany() {
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public boolean add(Airplane airplane) {
    return airplanes.add(airplane);
  }

  public Set<Airplane> getAirplanes() {
    return airplanes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null||getClass() != o.getClass()) return false;

    Aircompany that = (Aircompany) o;

    if (!companyName.equals(that.companyName)) return false;
    return airplanes.equals(that.airplanes);
  }

  @Override
  public int hashCode() {
    int result = companyName.hashCode();
    result = 31 * result + airplanes.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return airplanes.isEmpty()? String.format("The %s has no airplanes.", companyName) :
        String.format("The %s has %d airplanes.", companyName, airplanes.size());
  }
  public  void  show() {
    for (Airplane item : airplanes) {
      System.out.println(item);

    }
  }
    public  void  show(int minFuel,int maxFuel){
    int N=0;
      for (Airplane item : airplanes) {
       if ((minFuel<=item.getFuelUsage())&& (item.getFuelUsage()<=maxFuel)){
          System.out.println(item);
          N++;
        }
      }
if (N==0) { System.out.println("Sorry! In the given range of data, there is no. ");}

  }


}
