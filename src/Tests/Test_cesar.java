package Tests;
import Algos.*;


public class Test_cesar {

	public static void main(String[] args) {
		ces cesar = new ces();
		String[] decalage = {"2","6","19","32","18"};
		String[] phrase = {"Vif juge, trempez ce blond whisky aqueux","Buvez donc le whisky fameux que je partage ",
							"Hé, Gwendal et Xavier, vous qui jouez beaucoup au Molkky : « feu » !",
							"Zut ! Je crois que le chien Sambuca préfère le whisky revigorant au doux porto.",
							"J'ouvris le gaz et un whisky,et tout ne fut qu'ordre, beauté,luxe, calme et volupté."};
		for(int i=0;i<5;i++) {
			test(phrase[i],cesar.Cypher(phrase[i], decalage[i]),decalage[i],cesar);
		}
	}

	public static int test(String init,String cd,String decal,ces cesar) {
		if(init.compareTo(cesar.Decypher(cd,decal))==0) {
			System.out.println("Test César : Validé");
		}
		else {
			System.out.println("Test César : Échec");
			System.out.println(cesar.Decypher(cd,decal));
			return -1;
		}
		return 1;
	}
}
