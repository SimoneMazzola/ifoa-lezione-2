package proveGit;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		/*
		 * Se il vettore dei parametri da linea di comando (args) è nullo prendo i valori da tastiera
		 * finchè non inserisco il valore "0" e ne faccio la somma.
		 */
		/*double dNum = -1, dSomma = 0;
		Scanner scan = new Scanner(System.in);
		try {
			if(args.length == 0){
				while(dNum != 0)
				{
					System.out.print("Inserisci un numero: ");
					dNum = scan.nextDouble();
					dSomma += dNum;
				}
				System.out.println("Il valore della somma è: " + dSomma);
				scan.close();
			}else{
				for(int i=0; i<args.length; i++){
					dSomma += Double.parseDouble(args[i]);
				}

				System.out.println("Il valore della somma è: " + dSomma);
			}
		} catch(Exception ex) {
			System.err.println(ex);
			System.err.println("E' possibile inserire solamente numeri in ingresso!");
		}*/
		
		/**********************************************************************************************************************/

		/*
		 * Consente di riconoscere un'espressione in input e di calcolarne il totale, 
		 * capendo se si tratta di una somma o di una sottrazione.
		 */
		

		{
			//Non gli interessa se inserisco più spazi tra operatore e numero
			String operaz = "1 +   4";
			System.out.println(operaz);
			calcolaRisultato(operaz);
			System.out.println("----");
		}
		
		{
			//Da problemi nel caso in cui tra operatore e il numero successivo non ci sia lo spazio
			String operaz = "1 +4";
			System.out.println(operaz);
			calcolaRisultato(operaz);
			System.out.println("----");	
		}

	}

	static void calcolaRisultato(String operaz) {
		String operazCorrette = correggiOperazioni(operaz);
		
		double amount = 0;
		Scanner s = new Scanner(operazCorrette);

		if(s.hasNext()){
			double firstElem = s.nextDouble();
			amount = firstElem;
		}

		while(s.hasNext()){
			String a = s.next("[+-]");
			double value = s.nextDouble();

			if(a.equals("+"))
				amount += value;
			else
				amount -= value;

			System.out.println("Operatore: " + a);
			System.out.println("Valore: " + value);
			System.out.println("Totale: " + amount);
		}

		System.out.println("Totale Finale: " + amount);
		s.close();
	}

	private static String correggiOperazioni(String operaz) {
		String res = "";
		for(int i=0; i<operaz.length(); i++){
			String v = operaz.substring(i, i+1);
			
			System.err.println("Char at " + i + " = [" + v + "]");
			
			if("+".equals(v) || "-".equals(v))
				res += " " + v + " ";
			else
				res += v;
		}
		return res;
	}
}