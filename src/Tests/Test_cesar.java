package Tests;
import Cesar.ces;


public class Test_cesar {

	public static void main(String[] args) {
		String phrase = "Zut ! Je crois que le chien Sambuca prefere le whisky revigorant au doux porto";

		System.out.println("Phrase à coder :");
		System.out.println(phrase);


		String phrase_E_CESAR= ces.Encrypt(phrase,3);
		ces.Decrypt(phrase_E_CESAR,3);
		if(phrase.compareTo(ces.Decrypt(phrase_E_CESAR,3))!=0) {
			System.out.println("Le code César ne fonctionne pas");
		}
		else {
			System.out.println("Le code César fonctionne");
		}

	}


}
