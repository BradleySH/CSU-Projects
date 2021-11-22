public class Main {

  public static void main(String[] args) {
    bed(bedSize("Queen"), bedModel("Casper"), bedHeight(2));

  }

  public static void bed(String bedSize, String bedModel, int bedHeight) {
    System.out.println("My bed size is: " + bedSize);
    System.out.println("My bed model is: " + bedModel);
    System.out.println("My bed height is: " + bedHeight + "ft");
  }
}