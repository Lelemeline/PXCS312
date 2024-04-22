package Enigma;

public class enigma{
	public static String encod_enigma(String texte,String Rotor1,String Rotor2,String Rotor3,int index1, int index2, int index3,char[] echange) {
		int index_1_init = index1;
		int index_2_init = index2;
		int index_3_init = index3;
		// conversion des string en char[] ( plus pratique pour la manipulation)
		char[] to_code = texte.toCharArray();
		char[] rotor_1 = Rotor1.toCharArray();
		char[] rotor_2 = Rotor2.toCharArray();
		char[] rotor_3 = Rotor3.toCharArray();
		
		char temp; 
		
		for(int i=0;i<texte.length();i++) {
			// tableau de connexion
			for(int k=0;k<6;k++) {
				if(to_code[i]==echange[2*k]) {
					to_code[i] = echange[(2*k)+1];
				}
			}
			
			//les rotors bougent
			index1 = (index1++)%26;
			if(index1 ==index_1_init) { 
				index2=(index2++)%26;
			}
			if(index2 ==index_2_init) { 
				index3=(index3++)%26;
			}
			temp = 0;
			//les rotors subsituent la lettre à encoder par la lettre trouvée en fin de troisième rotor
			
		}		
		 
		
		return String.valueOf(to_code);
	}
	
}