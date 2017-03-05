package tw.org.iii;

public class boo {

	public static void main(String[] args) {
		
		int score=(int)(101*(Math.random())) ;
		
		System.out.println(score);
		
		if(score>=60)
		{
			System.out.println("pass");
		}

		else{
			System.out.println("fail");
		}
	}

}
