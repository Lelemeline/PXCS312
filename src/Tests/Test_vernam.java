package Tests;
import Algos.*;
public class Test_vernam {
	public static void main(String[] args) {
		vernam vern = new vernam();
		String[] phrase = {
				"Vif juge, trempez ce blond whisky aqueux",
				"Buvez donc le whisky fameux que je partage ",
				"Hé, Gwendal et Xavier, vous qui jouez beaucoup au Molkky : « feu » !",
				"Zut ! Je crois que le chien Sambuca préfère le whisky revigorant au doux porto.",
				"J'ouvris le gaz et un whisky,et tout ne fut qu'ordre, beauté,luxe, calme et volupté."};
		for(int i=0;i<5;i++) {
			int longueur= phrase[i].length();
			char[]cle=vernam.cle_verman(longueur);
			test(phrase[i],vern.Cypher(phrase[i], String.valueOf(cle)),String.valueOf(cle),vern);
		}

	}

	public static int test(String init,String cd,String cle,vernam vern) {
		if(init.compareTo(vern.Decypher(cd,cle))==0) {
			System.out.println("Test Vernam : Validé");
		}
		else {
			System.out.println("Test Vernam : Échec");
			System.out.println(vern.Decypher(cd,cle));
			return -1;
		}
		return 1;
	}
}
