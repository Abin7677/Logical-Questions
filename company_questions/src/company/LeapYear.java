package company;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year%4==0)
{
	System.out.println("Leap year");
}else {
	System.out.println("Not a leap year");
}
	}

}
