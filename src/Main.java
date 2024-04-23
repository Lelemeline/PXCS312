import Algos.*;
public class Main {
    public static void main(String[] args) {
		switch(args[1]){
			// case "-rot13" :
            //     ces rot = new ces();
			// 	if(args[0].equals("-e")) {
            //         System.out.println(rot.Cypher(args[2], "13"));
			// 	}
			// 	else if(args[0]=="-d") {
			// 		System.out.println(rot.Decypher(args[2], "13"));
			// 	}
			// 	break;
			// case "-caesar" :
            //     ces cesar = new ces();
			// 	if(args[0]=="-e") {
			// 		System.out.println(cesar.Cypher(args[2],args[3]));
			// 	}
			// 	else if(args[0]=="-d") {
			// 		System.out.println(cesar.Decypher(args[2],args[3]));
			// 	}
			// 	break;
			case "-sub" :
                sub substitut = new sub();
				if(args[0].equals("-e")) {
					System.out.println(substitut.Cypher(args[2],args[3]));

				}
				else if(args[0].equals("-d")) {
					System.out.println(substitut.Decypher(args[2],args[3]));
				}
				break;
			case "-otp" :
                vernam vern = new vernam();
				if(args[0].equals("-e")) {
					System.out.println(vern.Cypher(args[2],args[3]));
				}
				else if(args[0].equals("-d")) {
					System.out.println(vern.Decypher(args[2],args[3]));
				}
				break;
			default :
				System.out.println ("commande non reconnue");
				break;
		}
	}
}
