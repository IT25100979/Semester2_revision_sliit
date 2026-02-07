public class Q2 {
	public static void main(String[] args) {
		
		//Declaring arrays
		int A[] = {10,20,30,40,50};
		int B[] = {34,67,12,89,12};
		int C[] = new int[5];
		
		//Process 
		for(int i = 0; i<5; i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.print("Array C : [ ");
		for(int j =0; j<5; j++){
			System.out.print(C[j] + " ," + " ");
		}
		System.out.print(" ]");
	}
}