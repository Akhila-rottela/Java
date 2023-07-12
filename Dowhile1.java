package loops;

import java.util.Scanner;
class Dowhile1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pageno=100;
		
		boolean boored=false;
		int i=1;
		do
		{
			System.out.println("KodMan next page  " +i);
			i++;
			System.out.println("Do u want to continue?");
			boored=scan.nextBoolean();
		}while(true);
		// TODO Auto-generated method stub

	}

}
