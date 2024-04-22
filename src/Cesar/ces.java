package Cesar;

public class ces {
	public static String Encrypt(String texte,int N) {
		char[] txt = texte.toCharArray();
		String modifie="";
		int temp;

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

		//System.out.println(modifie);
		return modifie;

	}


	public static String Decrypt(String texte,int N) {
		char[] txt = texte.toCharArray();
		String modifie="";
		int temp;

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
