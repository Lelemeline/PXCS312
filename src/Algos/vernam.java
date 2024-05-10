package Algos;
import Crypto.Crypto;
public class vernam implements Crypto {
	@Override
	public String Cypher(String texte,String cle) {
		char[] key = (cle.toUpperCase()).toCharArray();
		char[] txt = texte.toCharArray();
		String som="";
		int temp_txt;
		int temp_cle;
		for(int index=0;index<txt.length;index++) {
			temp_txt= (int) txt[index];
			temp_cle= (int) key[index] -65;


			if(((temp_txt>= 65) & (temp_txt<=90))) {
				temp_txt=temp_txt-65;
				temp_txt=(temp_txt+temp_cle)%26;
				temp_txt=temp_txt+65;
			}
			if(((temp_txt>=97) & (temp_txt <=122))) {
				temp_txt=temp_txt-97;
				temp_txt=(temp_txt+temp_cle)%26;
				temp_txt=temp_txt+97;
			}
			som=som + (char) temp_txt;
		}
		//System.out.println(som);
		return som;

	}
	public String Decypher(String texte,String cle) {
		char[] key = (cle.toUpperCase()).toCharArray();
		char[] txt = texte.toCharArray();
		String som="";
		int temp_txt;
		int temp_cle;
		for(int index=0;index<txt.length;index++) {
			temp_txt= (int) txt[index];
			temp_cle= (int) key[index] -65;

			if(((temp_txt>= 65) & (temp_txt<=90))) {
				temp_txt=temp_txt-65;
				temp_txt=(temp_txt-temp_cle+26)%26;
				temp_txt=temp_txt+65;
			}
			if(((temp_txt>=97) & (temp_txt <=122))) {
				temp_txt=temp_txt-97;
				temp_txt=(temp_txt-temp_cle+26)%26;
				temp_txt=temp_txt+97;
			}
			som=som + (char) temp_txt;
		}
		//System.out.println(som);
		return som;

	}


	public static char[] cle_verman(int longueur) {
		char[] cle=new char[longueur];
		for(int i=0;i<longueur;i++) {
			cle[i]=(char)(random_int(0,26)+65);
		}
		return cle;
	}


	public static int random_int(int Min, int Max)
	{
		return (int) (Math.random()*(Max-Min))+Min;
	}

}
