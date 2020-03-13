package part2;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		int productid[]= {101,102,109,209,100};
		System.out.println("Enter product ID:");
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		
		for(int i :productid)
		{
			if(i==x)
			{
				System.out.println("Product exsits");
			}
			else 
				throw new ProductNotFoundException("Exception:ProductNOtFoundException");
		}
		
		
	}

}
