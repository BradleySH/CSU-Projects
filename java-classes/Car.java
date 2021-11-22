public class Car {

  private String make;
  private String model;
  private int year;
  private String color;

  public void setAuto(String make, String model, int year, String color) {
    String validMake = make.toLowerCase();
    String validModel = model.toLowerCase();
    String validColor = color.toLowerCase();

    if (validMake.equals("ford")) {
      this.make = make;
    } else if (validModel.equals("escape")) {
      this.model = model;
    } else if (validColor.equals("gray")) {

    } else {
      this.make = "uknown";
    }

  }

  public void validYear(int vehicleYear) {
    year = vehicleYear;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }

  public String getColor() {
    return this.color;
  }
}
