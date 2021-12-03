import java.util.Scanner;
import java.lang.Math;

public class Prime{

	int num;
	Scanner input;

	public Prime()
		{
		  input = new Scanner(System.in);	
		}
	
	public void readNum()
		{
			System.out.println("Enter a number :");
			num= input.nextInt();
		}


	public void isPrime()
		{
			boolean flag = false;
			if(this.num<=1)
			{
				System.out.println("This is not prime number");
				return;
			}
				
			for(int i=2;i<=Math.sqrt(this.num);i++)
			{
		
				if(this.num%i==0)
				{
					flag=true;
					break;
				}

			}
 			
			if(flag==true)
			{
				System.out.println("This is not prime number");
			}
			else
			{
				System.out.println("This is a prime number");
			}

		}


	public static void main(String[]args)
	{

		Prime p1 = new Prime();
		p1.readNum();
		p1.isPrime();
	}
		
	 
	

	
        


	}


