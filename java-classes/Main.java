public class Main {

  public static void main(String[] args) {

    Car ford = new Car();
    ford.setAuto(null, null, 0, null);

    System.out.println("Model is " + ford.getMake());
    System.out.println("Make is " + ford.getModel());
    System.out.println("Year is " + ford.getYear());
    System.out.println("Color is " + ford.getColor());

  }
}