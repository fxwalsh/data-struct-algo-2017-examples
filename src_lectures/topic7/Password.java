package topic7;

import java.io.Console;
import java.io.IOException;

public class Password {
	public static void main(String[] args) throws IOException {
		Console c = System.console();
		if (c == null) {
			System.err.println("No console.");
			System.exit(1);
		}
		String login = c.readLine("Enter your login: ");
		char[] oldPassword = c.readPassword("Enter your old password: "); 
	}
}
