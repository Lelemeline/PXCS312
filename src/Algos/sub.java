package Algos ;
import Crypto.Crypto ;
public class sub implements Crypto{
	// on va chercher tous les a minuscules du texte et modifier en conséquence, puis tous les b
	// jusqu'à modifier tous les Z
	@Override
	public String Cypher(String texte, String cle) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','à','â','é','è','ê','ï','ô','ù','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] tocode = texte.toCharArray();
		char[] clef  = cle.toCharArray();
		for(int j=0;j<tocode.length;j++) { // parcourt tout le texte
			for(int i =0;i<60;i++) { // parcourt tout l'alphabet
				if(tocode[j]== alphabet[i]) {
					tocode[j] = clef[i];
					break;
				}
			}
		}
		return String.valueOf(tocode);
	}

	// algorithme décodage : à chaque fois qu'on croise le premier carcatère de la table de déchiffrement, on remplace par le caractère 'a'
	// Puis on passe au deuxième caractère de la clef, et ainsi de suite.
	public String Decypher(String texte,String cle) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','à','â','é','è','ê','ï','ô','ù','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] todecode = texte.toCharArray();
		char[] clef  = cle.toCharArray();
		for(int j=0;j<todecode.length;j++) { // on parcourt le texte à décoder
			for(int i = 0; i<60;i ++) { // on parcourt la clef
				if(todecode[j]==clef[i]) {
					todecode[j] = alphabet[i];
					break;
				}
			}
		}
		return String.valueOf(todecode);
	}
}