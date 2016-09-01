import java.util.Scanner;

public class Potato {
    public static void main (String args []) {
        Scanner input = new Scanner (System.in);
       String lineseparator = System.getProperty ("line.separator");
  
  potato1 potato1 = new potato1();
        System.out.println("Enter Name:");
         potato1.setName(input.nextLine());
       System.out.println("Enter Age:");
       potato1.setAge (input.nextInt ());
       
       System.out.println("Name: "+ potato1.getName() + lineseparator + "Age: " + potato1.getAge());
    }
}


       
        