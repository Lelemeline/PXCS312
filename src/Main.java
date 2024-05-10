import java.awt.Desktop;
import java.io.File;

import Algos.*;
import Crypto.Crypto;

public class Main {
    public static void main(String[] args) {
		Crypto crypto = null;
		String cle;
		if(args[0].equals("-help")){
			try {
				File file = new File("/home/lea/Documents/Esisar/3A/CS312/MiniProjet-2024/help.md");
				if (!Desktop.isDesktopSupported()) {
				  System.out.println("not supported");
				  return;
				}
				Desktop desktop = Desktop.getDesktop();
				if (file.exists())
				  desktop.open(file);
			  } catch (Exception e) {
				e.printStackTrace();
			  }
			return;
		}
		switch(args[1]){
			case "-rot13" :
				cle =  "13";
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
				System.out.println ("Erreur : Commande non reconnue. Aide : -help");
				break;
		}
		if (crypto == null){ // gestion d'erreur
			System.out.println ("Erreur: mode de chiffrement non reconnue");
			return ;
		}
		else if(args.length < 4){
			System.out.println ("Erreur : Argument(s) Manquant(s)");
			return ;
		}
		// gestion du mode de chiffrement
		else if(args[0].equals("-e")) {
			cle = args[3];
			System.out.println(crypto.Cypher(args[2],cle));
		}
		else if(args[0].equals("-d")) {
			cle = args[3];
			System.out.println(crypto.Decypher(args[2],cle));
		}

	}
}
