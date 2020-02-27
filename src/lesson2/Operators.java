package lesson2;
/*
 Increment operator and assignment operator
 */
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x++); //post incrementation
		System.out.println(x);
		int y = 10;
		System.out.println(++y); //pre incrementation
		y+=5; // it is equal to y=y+5
		x*=5; // it is equal to x=x*5
		System.out.println(x); // this is assigment operator
		System.out.println(y);
	}
	

}
