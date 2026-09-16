import java.util.Scanner;

public class Temperature {
     
     public static void main (String [] args) {
		 
     //double C_PER_F = (fahrenheit - 32)* 5.0/9.0;
     int x = 32;
     int y = 5;
     int z = 9;
     
     Scanner in = new Scanner(System.in);

System.out.print("Want to convert celsius to fahrenheit?");
     int c = in.nextInt()
     double f = ( c - x * y/z);
     




System.out.printf("Equal to %2f", f ,+ "F");
   }
}
