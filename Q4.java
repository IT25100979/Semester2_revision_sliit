public class Q4{
	public static void main(String[] args){
			
		//Figure 1 
		//Using while loop
		int i =0;
		while(i < 5){
			
			int j=0;
			while(j < 5){
				System.out.print(" * ");
				j++;
			}
			System.out.println("");
			i++;
		}
		
		System.out.println("");
		
		//Figure 2
		//Using for loop
		
		for(int x=0;x < 5; x++){
			
			
			for(int z=0; z < 5 - x - 1; z++){
				System.out.print(" ");
			}
			for(int y=0; y<x; y++){
				
				System.out.print(" * ");
			}
			
			System.out.println("");
		}
	}
}