package assignment1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, ran;
		Scanner sc = new Scanner(System.in);
		
		 Random random = new Random();
			
			int min=0,max=3;
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter a number");
				num = sc.nextInt();
				ran = random.ints(min,(max+1)).findFirst().getAsInt();
				if(num==ran)
				{
					System.out.println("YOU WIN!");
					System.out.println("Do you want to continue");
					char a=sc.next().charAt(0);
					if(a=='Y' || a=='y')
						continue;
					else
						break;
					
				}

				System.out.println("Input :- "+num+"System"+ran);
				
				if (num == ran) {
					System.out.println("YOU WIN!");
					System.out.println("Press Y to continue");
					String cond=sc.next();

					if (cond != "Y" || cond != "y")
						break;
				

				}
				
				
			}
			
			
			sc.close();
		}
	
	

}
