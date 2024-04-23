package Tests;
import Enigma.enigma;

public class Test_enigma {
    public static void main(String[] args){
        String texte = "le mathematicien est a la recherche de quelque chose qui n existe pas mais qu il doit néanmoins expliquer a quelques collegues";
        String rotor1 = "JGDQOXUSCAMIFRVTPNEWKBLZYH";
        String rotor2 = "NTZPSFBOKMWRCJDIVLAEYUXHGQ";
        String rotor3 = "JVIUBHTCDYAKEQZPOSGXNRMWFL";
        String reflector = "EJMZALYXVBWFCRQUONTSPIKHGD";
        String echange = "BQCRDIEJKWMTOSPXUZGH";
        String code = enigma.encod_enigma(texte,rotor1,rotor2,rotor3,reflector,1,17,12,echange);
        String decode = enigma.encod_enigma(code, rotor1, rotor2, rotor3, reflector,1,17,12,echange);
        System.out.println("message : "+texte);
        System.out.println("message codé : "+code);
        System.out.println("message décodé : "+decode);
    }
}
