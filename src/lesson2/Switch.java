package lesson2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		// byte, short, int or char
		switch(score)
		{
		case 90 :
			System.out.println("Very Good");
			break;
		case 60 :
			System.out.println("Good");
			break;
		case 40 :
			System.out.println("ok");
			break;
		default :
			System.out.println("Score is not defined");
			break;
		}
	}

}
