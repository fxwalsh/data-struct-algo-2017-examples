package assessment_2016;

public class Replace {

	public static void main(String[] args) {
		System.out.println(replace('e', 'a', "Steve"));
	}

	public static String replace(char from, char to, String s) {

		if (s.length() == 0)
			return "";

		char firstChar = s.charAt(0);

		if (s.charAt(0) == from)
			firstChar = to;
		
		// recursive call is here
		return firstChar + replace(from, to, s.substring(1));

	}

	public static String replaceNonRecursive(char from, char to, String s) {
		// TODO

		return null;
	}

}
