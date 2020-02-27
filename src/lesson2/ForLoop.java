package lesson2;
/*
 for (initialization; expression; increment)
 {
 
 }
 */
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myintarray = {100,31,26,48,56};
		for ( int index = 0; index < 5; index++)
		{
			System.out.println(myintarray[index]); 
		}
		// another method to acess elements of array using for loop
		for (int element : myintarray)
		{
			System.out.println(element);
		}
		// Java string
		
		String mystring = "My first string";
		System.out.println(mystring);
		int myStringLength = mystring.length();
		System.out.println(myStringLength);
		String myStringinLowerCase = mystring.toLowerCase();
		String myStringinUpperCase = mystring.toUpperCase();
		String mystring2 = "MY second String";
		String conc = mystring + mystring2;
		System.out.println(myStringinUpperCase);
		System.out.println(myStringinLowerCase);
		System.out.println(conc);
		System.out.println(mystring.replace('f', 's'));

		
	}

}
