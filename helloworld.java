import java.util.Scanner;
public class Temperature {
	public final double TEMP=100.00;
	public static void main (String [] args) {
		
		System.out.println("Enter current temperature");
		Scanner keyboard = new Scanner(System.in);
		double temp = keyboard.nextDouble();
		if(temp<TEMP) {
	        System.out.println("low temperature");
		}else{
			System.out.println("High Temperature");
        	}
	}

}

