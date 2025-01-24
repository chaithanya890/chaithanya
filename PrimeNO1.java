package world;

public class PrimeNO1 {
	
	public static void main(String[] args) {
		
		int num = 31,counter=1;
		for(int p=num;p>=1;p--) {
			if(num % p== 0) counter++;
		
			
		}
		if(counter == 2) System.out.println("yes it is Prime");
		else System.out.println(" not a prime");
	
	}	
  
}	