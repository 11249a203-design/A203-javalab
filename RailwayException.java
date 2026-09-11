public class RailwayException{
 public static void main(String[] args) {
String[] trainCodes = {"TN101", "TN102", "TN103"};
try {
System.out.println("Train Code: " + trainCodes[5]); // Invalid index
} catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Error: Invalid train code index!");
}
System.out.println("Program executed successfully.");
 }
}