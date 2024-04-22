package Cesar;



public class Test {

	public static void main(String[] args) {
		String phrase = "Zut ! Je crois que le chien Sambuca prefere le whisky revigorant au doux porto";

		System.out.println("Phrase à coder :");
		System.out.println(phrase);


		String phrase_E_CESAR=Cesar.Encrypt(phrase.toCharArray(),3);
		Cesar.Decrypt(phrase_E_CESAR.toCharArray(),3);
		if(phrase.compareTo(Cesar.Decrypt(phrase_E_CESAR.toCharArray(),3))!=0) {
			System.out.println("Le code César ne fonctionne pas");
		}
		else {
			System.out.println("Le code César fonctionne");
		}

	}


}
