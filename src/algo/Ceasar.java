package algo;

public class Ceasar {


    public static String code(String plaintext, int key) {
        String ciphertext = "";
        plaintext = plaintext.toLowerCase();
        for (int i = 0; i < plaintext.length(); i++) {

            char next = plaintext.charAt(i);
            ciphertext = ciphertext + shift(next, key);
        }
        return ciphertext;
    }

    public static char shift(char letter, int shift) {
        if (letter >= 'a' && letter <= 'z') {
            letter += shift;
            while (letter > 'z') {
                letter -= 26;
            }
        }
        return letter;
    }

    public static String decode(String ciphertext, int key) {
        String decoded = "";
        ciphertext = ciphertext.toLowerCase();
        for (int i = 0; i < ciphertext.length(); i++) {
            char next = ciphertext.charAt(i);
            decoded = decoded + shift(next, 26 - key);
        }
        return decoded;
    }
}
