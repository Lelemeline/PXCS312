import substitution.sub;
import Vernam.vernam;
import Cesar.ces;

public class Interface {
	public static void main(String[] args) {
		switch(args[1]){
			case "-rot13" :
				if(args[0]=="-e") {
					System.out.println(ces.Encrypt(args[2], 13));
				}
				else if(args[0]=="-d") {
					System.out.println(ces.Decrypt(args[2], 13));
				}
				break;
			case "-caesar" :
				if(args[0]=="-e") {
					System.out.println(ces.Encrypt(args[2], Integer.parseInt(args[3])));
				}
				else if(args[0]=="-d") {
					System.out.println(ces.Decrypt(args[2], Integer.parseInt(args[3])));
				}
				break;
			case "-sub" :
				if(args[0]=="-e") {
					System.out.println(sub.Encrypt(args[2],args[3]));

				}
				else if(args[0]=="-d") {
					System.out.println(sub.Decrypt(args[2],args[3]));
				}
				break;
			case "-otp" :
				if(args[0]=="-e") {
					System.out.println(vernam.Encrypt(args[2].toCharArray(),args[3].toCharArray()));
				}
				else if(args[0]=="-d") {
					System.out.println(vernam.Decrypt(args[2].toCharArray(),args[3].toCharArray()));
				}
				break;
			default :
				System.out.println ("commande non reconnue. Si besoin d'aide : ./ -help ");
				break;
		}
	}
}