package Tests;
import Algos.*;

public class Test_sub{
	public static void main(String[] args) {
		sub substitut = new sub();
		String[] cle = {
				"bevrtyuilmazndcghsfqwjkpxoùàïêôéèâAZERTYUIOPQSDFGHJKLMWXCVBN",
				"azndcghsfqwjkpxoùàïêôéèâbevrtyuilmGHJKLMWXCVBNAZERTYUIOPQSDF",
				"azndcxoùàïêôéèâghsfbevrtyuilmqwjkpGHJKLERTYUIOPQSDFMWXCVBNAZ",
				"qwjkpaznbevrtyuilmdcxoùàïêôéèâghsfAZERTYUIOPQSDFGHJKLMWXCVBN",
				"êôéèâghsfqwjkpazyuilmdcxoùàïnbevrtSDFMWCJKQLERTYUIOPVBNAZXGH"};
		String[] phrase = {
				"Vif juge, trempez ce blond whisky aqueux",
				"Buvez donc le whisky fameux que je partage ",
				"Hé, Gwendal et Xavier, vous qui jouez beaucoup au Molkky : « feu » !",
				"Zut ! Je crois que le chien Sambuca préfère le whisky revigorant au doux porto.",
				"J'ouvris le gaz et un whisky,et tout ne fut qu'ordre, beauté,luxe, calme et volupté."};

		for(int i=0;i<5;i++) {
			test(phrase[i],substitut.Cypher(phrase[i], cle[i]),cle[i],substitut);
		}
	}
	public static int test(String init,String cd,String cle,sub substitut) {
		if(init.compareTo(substitut.Decypher(cd,cle))==0) {
			System.out.println("Test Substitution : Validé");
		}
		else {
			System.out.println("Test Substitution : Échec");
			System.out.println(substitut.Decypher(cd,cle));
			return -1;
		}
		return 1;
	}
}