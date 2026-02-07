public class Calculator {
	
	//methods
	
	public static double add(double num1, double num2){
		return num1 + num2;
	}
	
	public static double multiply(double num1, double num2){
		return num1*num2;
	}
	
	public static double square(double num){
		return Math.pow(num,2);
	}
	
	public static void main(String[] args){
		
		System.out.print("Answer for (3*4 + 5*7)^2 = ");
		System.out.print(square(add(multiply(3,4), multiply(5,7))));
		System.out.println("");
		
		System.out.print("Answer for (4+7)^2 + (8+3)^2 is ");
		System.out.print(add(square(add(4,7)), square(add(8,3))));
	}
}