package lesson2;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subject1 = 40;
		int subject2 = 60;
		// && is AND    || is OR
		if ((subject1 >= 35) && (subject2 >=35)) {
			System.out.println("Pass");
			// In AND operator both the condn must be true
		}
		else {
			System.out.println("Fail"); 
		}
		int subject3 = 20;
		int subject4 = 60;
		if ((subject3 >= 35) || (subject4 <=35)) {
			System.out.println("Pass");
			// in OR operator if one of the condn is true then it is true
		}
		else {
			System.out.println("Fail"); 
		}
	}

}
