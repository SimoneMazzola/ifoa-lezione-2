package lezione1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		Pattern regex = Pattern.compile("^[a-z](\\.{0,1}[a-z]{1,})*+@(\\.{0,1}[a-z]{1,})+\\.[a-z]{2,6}$");
		Matcher match = regex.matcher(args[0]);
		Boolean emailMatch = match.matches();
		
		if(emailMatch)
			System.out.println("L'email " + args[0] + " è valida");
		else
			System.err.println("L'email " + args[0] + " NON è valida");
	}
}
