import java.util.Scanner;

public class EvenOddNumber {
	
	//method
	public static boolean findEvenOrOdd(int i){
		
		int x = i%2;
		
		return (x > 0); 
	}
	
	public static void main(String[] args){
		
		Scanner ui = new Scanner(System.in);
		
		//Declaring variables 
		int num;
		
		System.out.println("Enter a number ");
		num = ui.nextInt();
		
		if(findEvenOrOdd(num) == true){
			System.out.println("Your Number Is A ODD Number. ");
		}
		else{
			System.out.println("Your Number is A EVEN Number. ");
		}
		
	}
}
