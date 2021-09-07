package String;

public class ReverseOfString1 {
	public static void main(String[] args) {
		String s = "Java Program";
		String output =" ";
		String[] split = s.split(" ");
		for (String string : split) {
			for(int i=string.length()-1;i>=0;i--) {
				char charAt = string.charAt(i);
				output =output + charAt;
		}
			output=output+" ";
		}
		System.out.println(output);

}
}