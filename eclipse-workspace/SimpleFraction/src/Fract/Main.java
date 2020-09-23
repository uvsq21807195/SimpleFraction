package Fract;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un numerateur ");
        
		int num = sc.nextInt();
		System.out.println("Saisissez un denominateur ");
		int denum = sc.nextInt();
		
		Fraction F= new Fraction(num,denum);
		String res=F.toString();
		System.out.println(res);
		
	
		
		sc.close();

	}

}
