import java.util.Scanner;
/**
 * This program sorts an array of 10 integers
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // make an array
    int[] sortingNumbers = new int[10];

    // asks for 10 integers to put in the array
    System.out.println("Please enter in 10 integers to put into the array");
    for (int i = 0; i < 10; i++) {
      sortingNumbers[i] = input.nextInt();
    }

    // sort the array
    for (int i = 0; i < (sortingNumbers.length - 1); i++) {
      for (int j = i+1; j < sortingNumbers.length; j++) {
        if (sortingNumbers[i] > sortingNumbers[j]) {
          // swaps the 2 values by making a circle of swaps
          int swapNumber = sortingNumbers[i];
          sortingNumbers[i] = sortingNumbers[j];
          sortingNumbers[j] = swapNumber;
        }
      }
    }

    // print the array one element at a time, the last one doesn't have a comma
    System.out.println("The array sorted in ascending order");
    for (int i = 0; i < 9; i++) {
      System.out.print(sortingNumbers[i] + ", ");
    }
    System.out.println(sortingNumbers[sortingNumbers.length - 1]);
    
  }
}
