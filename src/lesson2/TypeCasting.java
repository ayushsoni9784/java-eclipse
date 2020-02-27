package lesson2;
/* 
 Type casting is when you assign the value of one primitive datatype to another.
 There is two type of casting 
 1 widening casting (Automatic casting) ( byte - short - char - int - long - float - double ) i.e from small to big
 2 narrowing casting (Manually casting) (double - float - long - int - char - short - byte) i,e. from big to short
 */

public class TypeCasting {

	public static void main(String[] args) {
		// widening casting
		int  myInt = 9;
		double myDouble = myInt ; // automatic casting
		System.out.println(myInt);
		System.out.println(myDouble);
		
		// narrowing casting
		double myDouble2 = 9.78;
		int myInt2 = (int) myDouble2; // manuallty casting
		System.out.println(myDouble2);
		System.out.println(myInt2);
	}

}
