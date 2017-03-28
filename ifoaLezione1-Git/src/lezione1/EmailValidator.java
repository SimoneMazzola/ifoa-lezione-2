package lezione1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pattern regex = Pattern.compile("^[a-z | 0-9](\\.{0,1}[a-z]{1,})*+@(\\.{0,1}[a-z]{1,})+\\.[a-z]{2,6}$");
		System.out.println("Inserisci una e-mail: ");
		
		String email = sc.nextLine();
		Matcher match = regex.matcher(email);
		Boolean emailMatch = match.matches();
		
		if(emailMatch)
			System.out.println("L'email \"" + email + "\" è valida");
		else
			System.err.println("L'email \"" + email + "\" NON è valida");
		
		sc.close();
	}
}
