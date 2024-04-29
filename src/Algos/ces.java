package Algos;
import Crypto.Crypto;

public class ces implements Crypto{
	@Override
	public String Cypher(String texte,String C) {
		int N = Integer.parseInt(C);
		char[] txt = texte.toCharArray();
		String modifie="";
		int temp;
		N=N%26;
		for (int index=0; index <txt.length; index++) {
			temp=(int)txt[index];
			if(((temp>= 65) & (temp<=90))) {
				temp=(temp+N-65)%26;
				temp=temp+65;
			}
			if(((temp>=97) & (temp <=122))) {
				temp=(temp+N-97)%26;
				temp=temp+97;
			}
			modifie=modifie+ (char)temp;
		};
		return modifie;

	}


	public String Decypher(String texte,String C) {
		int N = Integer.parseInt(C);
		char[] txt = texte.toCharArray();
		String modifie="";
		int temp;
		N=N%26;
		for (int index=0; index <txt.length; index++) {
			temp=(int)txt[index];
			if(((temp>= 65) & (temp<=90))) {
				temp=(temp+26-N-65)%26;
				temp=temp+65;
			}
			if(((temp>=97) & (temp <=122))) {
				temp=(temp+26-N-97)%26;
				temp=temp+97;
			}
			modifie=modifie+ (char)temp;
		};

		//System.out.println(modifie);
		return modifie;

	}

}
