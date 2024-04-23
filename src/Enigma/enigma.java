package Enigma;
public class enigma{
	/*
	 * @brief : la fonction encod_enigma permet d'encrypter un texte en simulant une machine Enigma
	 * @param :
	 * les rotors sont en String, par souci de practicité lors de l'appel de la fonction, et reconvertis ensuite en char[], plus pratique à la manipulation
	 * String texte = le texte à encoder
	 * String Rotor1,String Rotor2,String Rotor3,String Reflecteur = les rotors ( le reflecteur est aussi un rotor, bien qu'immobile)
	 * int index1, int index2, int index3,int index4,String swap
	 */
	public static String encod_enigma(String texte,String Rotor1,String Rotor2,String Rotor3,String Reflecteur,int index1, int index2, int index3,String swap) {
		// déclaration des variables
		// on conserve la position initiale du rotor n pour savoir quand bouger le rotor n+1
		int index_1_init = index1;
		int index_2_init = index2;
		// conversion des string en char[] ( plus pratique pour la manipulation)
		char[] to_code = (texte.toUpperCase()).toCharArray();
		char[] rotor_1 = Rotor1.toCharArray();
		char[] rotor_2 = Rotor2.toCharArray();
		char[] rotor_3 = Rotor3.toCharArray();
		char[] reflector = Reflecteur.toCharArray();
		char[] echange = swap.toCharArray();
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char temp;

		for(int i=0;i<texte.length();i++) {
			if(to_code[i]==' ') i++;
			//System.out.println("le char est "+to_code[i]);
			// tableau de connexion
			for(int k=0;k<10;k++) {
				if(to_code[i]==echange[(2*k)]) {
					to_code[i] = echange[(2*k)+1];
				}
			}

			//les rotors bougent
			index1 = (++index1) % 26;
			if (index1 == index_1_init) {
			    index2 = (++index2) % 26;
			}
			if (index2 == index_2_init) {
			    index3 = (++index3) % 26;
			}
			//System.out.println("index1 = "+index1 + " index 2= "+index2+" index3= "+index3);
			//les rotors subsituent la lettre à encoder par la lettre trouvée en fin de troisième rotor
			temp = to_code[i];
			char temp1 = rotor_1[index1]; // caractère après le premier rotor
			//System.out.print(temp1);
			char temp2 = rotor_2[find_index(alphabet,temp1)]; // après le deuxième rotor
			//System.out.print(temp2);
			temp = rotor_3[find_index(alphabet,temp2)]; // après le troisième rotor
//			System.out.println(temp);
//			System.out.println("réflecteur");
//			System.out.println(find_index(alphabet,temp));
			char ref = reflector[find_index(alphabet,temp)]; // après le réflecteur
			//System.out.println(ref);
			char temp3 = rotor_3[find_index(alphabet,ref)];
			temp2 = rotor_2[find_index(alphabet,temp3)];
			to_code[i] = rotor_1[find_index(alphabet,temp2)];
			//System.out.println(to_code[i]);
			for(int k=0;k<10;k++) {
				if(to_code[i]==echange[(2*k)]) {
					to_code[i] = echange[(2*k)+1];
					System.out.println(to_code[i]);
				}
			}
		}


		return String.valueOf(to_code);
	}
	private static int find_index(char[] tableau, char find){
		for(int i =0;i<tableau.length;i++){
			if(tableau[i]==find) {
				return i;
			}
		}
		return 0;
	}

}