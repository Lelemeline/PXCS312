import Algos.ces;
import Algos.vernam;
import Crypto.Crypto;
import Algos.sub;

public class Main {
    public static void main(String[] args) {
		Crypto crypto = null;
		switch(args[1]){
			case "-rot13" :
				args[3] = "13";
				crypto = new ces() ;
				break ;
			case "-caesar" :
				crypto = new ces() ;
				break;
			case "-sub" :
				crypto = new sub();
				break;
			case "-otp" :
				crypto = new vernam();
				break;
			default :
				System.out.println ("commande non reconnue");
				break;
		}
		if (crypto == null){
			System.out.println ("erreur sur la reconnaissance du mode de chiffrement");
			return ;
		}
		else if(args[0].equals("-e")) {
			System.out.println(crypto.Cypher(args[2],args[3]));
		}
		else if(args[0].equals("-d")) {
			System.out.println(crypto.Decypher(args[2],args[3]));
		}

	}
}
