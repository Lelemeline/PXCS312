
import Cesar.Cesar;
import Vernam.vernam;
import substitution.sub;

public class Interface {
	public static void main(String[] args) {
		switch(args[1]){
			case "-rot13" :
				if(args[0]=="-e") {
					System.out.println(Cesar.Encrypt(args[2].toCharArray(), 13));
				}
				else if(args[0]=="-d") {
					System.out.println(Cesar.Decrypt(args[2].toCharArray(), 13));
				}
				break;
			case "-caesar" :
				if(args[0]=="-e") {
					System.out.println(Cesar.Encrypt(args[2].toCharArray(), Integer.parseInt(args[3])));
				}
				else if(args[0]=="-d") {
					System.out.println(Cesar.Decrypt(args[2].toCharArray(), Integer.parseInt(args[3])));
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