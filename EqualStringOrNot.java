package day1Assignment;
import java.util.Scanner;
public class EqualStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first String : ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Second String : ");
        String secondName = scanner.nextLine();
        
        if(firstName.equals(secondName)) {
        	System.out.print("String is equal");
        }
        else
        {
        	System.out.print("String is not equal");
        }
	}

}
