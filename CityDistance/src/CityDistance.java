import java.util.Scanner;
public class CityDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		int[][] distArray = {
				{0,1110,1050,1607},
				{1110,0,1880,800},
				{1050,1880,0,900},
				{1607,800,900,0}
				};
		
		int InitialCity = 0;
		int FinalCity = 0;
		int CityDist = 0;
		
		System.out.println("We will be calculating the distance you will be traveling today. Please enter the number corresponding to your departing city: ");
		System.out.println("New York - 0");
		System.out.println("Los Angeles - 1");
		System.out.println("Toronto - 2");
		System.out.println("Philidelphia - 3");
		
		InitialCity = scnr.nextInt();
		
		System.out.println("Please enter the number corresponding to your arriving city: ");
		System.out.println("New York - 0");
		System.out.println("Los Angeles - 1");
		System.out.println("Toronto - 2");
		System.out.println("Philidelphia - 3");
		
		FinalCity = scnr.nextInt();
	
		System.out.println("The distance between your cities is: " + distArray[InitialCity][FinalCity]);
	}

}
