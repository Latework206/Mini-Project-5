import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How tall is the world's tallest building in feet?");
    int height = scan.nextInt();
    findHeight(height);
  }

  static boolean findHeight(int height) {
    Scanner scan = new Scanner(System.in);
    if (height == 2722) {
      System.out.println("You are correct!");
      return true;
    } else {
      System.out.println("That is incorrect! Try again! (Hint, it's over 2000)");
      height = scan.nextInt();
      return findHeight(height);
    }
  }
}
