public class Q1{
	public static void main(String[] args){
		
		//Declaring variables
		int miles = 26;
		int yards = 385;
		double kilometer = 0;
		
		//Process 
		//Since 1 mile = 1.608km , 26 miles will be 26 x 1.609km
		kilometer = miles*1.609;
		System.out.println("26 miles = " + kilometer + " km. ");
		
		//Since 1 yard = 1.609/1760.0 km, 385 yards will be 1.609/1760
		kilometer = 385 * 1.609/1760;
		System.out.println("385 yards = " + kilometer + " km. ");
	}
}