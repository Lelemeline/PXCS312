package Vernam;


public class test_vernam {
	public static void main(String[] args) {
		String phrase = "Zut ! Je crois que le chien Sambuca prefere le whisky revigorant au doux porto";

		System.out.println("Phrase à coder :");
		System.out.println(phrase);

		int longueur= phrase.length();
		System.out.println("Longueur de la chaine :"+longueur);
		char[]cle=vernam.cle_verman(longueur);



		String phrase_E_VERMAN=vernam.Encrypt(phrase.toCharArray(), cle);
		vernam.Decrypt(phrase_E_VERMAN.toCharArray(), cle);


		if(phrase.compareTo(vernam.Decrypt(phrase_E_VERMAN.toCharArray(),cle))!=0) {
			System.out.println("Le code Verman ne fonctionne pas");
		}
		else {
			System.out.println("Le code Verman fonctionne");
		}
	}
}
