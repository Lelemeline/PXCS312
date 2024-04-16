package substitution;

public class Test{
	public static void main(String[] args) {
		String tocode = "Whisky vert : jugez cinq fox d'aplomb";
		String cle = "bevrtyuilmazndcghsfqwjkpxoAZERTYUIOPQSDFGHJKLMWXCVBN";
		String chiffre = sub.Encrypt(tocode,cle);
		System.out.println(" On chiffre "+ tocode + " et on obtient "+chiffre);
		String dechiffre = sub.Decrypt(chiffre,cle);
		System.out.println(" On déhiffre "+ chiffre + " et on obtient "+dechiffre);
		
	}
}