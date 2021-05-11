package mypack;

public class as7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch = 'D';
		
		if (Character.isLowerCase(ch)) 
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));

	}

}
