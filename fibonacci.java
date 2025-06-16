public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Program to fibonacci");
		System.out.println("Enter Number of Terms");
		int n=1;
		int a=0; 
		int b=1;
		int c;
		System.out.print(a+","+b+",");
		for(int i=0;i<n-2;i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		
	}
	}
}
