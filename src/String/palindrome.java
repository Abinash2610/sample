package String;

public class palindrome {
	public static void main(String[] args) {
		String s = "loki";
		String output ="";
		for(int i= s.length()-1;i>=0;i--) {
		char c = s.charAt(i);
		output =output +c;
		
	}
		System.out.println(output);
		if (s.equals(output)) {
			System.out.println("the given word is palindrome");
			
		}else {
			System.out.println("the given word is not palindrome");
		}
	}
	

}
