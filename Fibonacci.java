 public class Fibonacci {
	
	 public static int Fibonacci(int num)
	{
		
		if(num == 1 || num == 2)
			{
				return 1;
			}
		else 
			{
		
				return Fibonacci(num - 2) + Fibonacci(num - 1);
			}
	}
	
	
	 public static void main(String[] args) 
	{
		
	
		for(int i = 1;;i++)
		 {
			if (Fibonacci(i) >200)
				break;
			System.out.print(Fibonacci(i) + "\t");
			
			
		}	
	}
	
}
