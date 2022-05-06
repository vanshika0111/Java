abstract class Cipher
{
    String plainText;
    int key;

    Cipher(String plainText,int key) {
        this.plainText=plainText;
        this.key=key;
    }

    abstract String Encryption();
    abstract String Decryption();
}

class SubstitutionCipher extends Cipher {
    int i;
    SubstitutionCipher (String plainText, int key) {
        super (plainText, key);
    }

    String Encryption () {
        char b[]=plainText.toCharArray();
        for (i = 0; i < b.length; i++) {
            if      ( b[i] == 'a') { b[i] = 'q'; }
            else if ( b[i] == 'b') { b[i] = 'a'; }
            else if ( b[i] == 'c') { b[i] = 'z'; }
            else if ( b[i] == 'd') { b[i] = 'w'; }
            else if ( b[i] == 'e') { b[i] = 's'; }
            else if ( b[i] == 'f') { b[i] = 'x'; }
            else if ( b[i] == 'g') { b[i] = 'e'; }
            else if ( b[i] == 'h') { b[i] = 'd'; }
            else if ( b[i] == 'i') { b[i] = 'c'; }
            else if ( b[i] == 'j') { b[i] = 'r'; }
            else if ( b[i] == 'k') { b[i] = 'f'; }
            else if ( b[i] == 'l') { b[i] = 'v'; }
            else if ( b[i] == 'm') { b[i] = 't'; }
            else if ( b[i] == 'n') { b[i] = 'g'; }
            else if ( b[i] == 'o') { b[i] = 'b'; }
            else if ( b[i] == 'p') { b[i] = 'y'; }
            else if ( b[i] == 'q') { b[i] = 'h'; }
            else if ( b[i] == 'r') { b[i] = 'n'; }
            else if ( b[i] == 's') { b[i] = 'u'; }
            else if ( b[i] == 't') { b[i] = 'j'; }
            else if ( b[i] == 'u') { b[i] = 'm'; }
            else if ( b[i] == 'v') { b[i] = 'i'; }
            else if ( b[i] == 'w') { b[i] = 'k'; }
            else if ( b[i] == 'x') { b[i] = 'o'; }
            else if ( b[i] == 'y') { b[i] = 'l'; }
            else if ( b[i] == 'z') { b[i] = 'p'; }
        }

        for (i = 0; i < b.length; i++) { System.out.println (b[i]); }
        System.out.println();
        return "/0";
    }

    String Decryption() {
        char b[] = plainText.toCharArray();
        for (i = 0; i < b.length; i++) {
            if      ( b[i] == 'a') { b[i] = 'q'; }
            else if ( b[i] == 'b') { b[i] = 'a'; }
            else if ( b[i] == 'c') { b[i] = 'z'; }
            else if ( b[i] == 'd') { b[i] = 'w'; }
            else if ( b[i] == 'e') { b[i] = 's'; }
            else if ( b[i] == 'f') { b[i] = 'x'; }
            else if ( b[i] == 'g') { b[i] = 'e'; }
            else if ( b[i] == 'h') { b[i] = 'd'; }
            else if ( b[i] == 'i') { b[i] = 'c'; }
            else if ( b[i] == 'j') { b[i] = 'r'; }
            else if ( b[i] == 'k') { b[i] = 'f'; }
            else if ( b[i] == 'l') { b[i] = 'v'; }
            else if ( b[i] == 'm') { b[i] = 't'; }
            else if ( b[i] == 'n') { b[i] = 'g'; }
            else if ( b[i] == 'o') { b[i] = 'b'; }
            else if ( b[i] == 'p') { b[i] = 'y'; }
            else if ( b[i] == 'q') { b[i] = 'h'; }
            else if ( b[i] == 'r') { b[i] = 'n'; }
            else if ( b[i] == 's') { b[i] = 'u'; }
            else if ( b[i] == 't') { b[i] = 'j'; }
            else if ( b[i] == 'u') { b[i] = 'm'; }
            else if ( b[i] == 'v') { b[i] = 'i'; }
            else if ( b[i] == 'w') { b[i] = 'k'; }
            else if ( b[i] == 'x') { b[i] = 'o'; }
            else if ( b[i] == 'y') { b[i] = 'l'; }
            else if ( b[i] == 'z') { b[i] = 'p'; }
        }

        char d[] = plainText.toCharArray();
        for(i = 0; i < d.length; i++) {
            if      ( b[i] == 'q') { d[i] = 'a'; }
            else if ( b[i] == 'a') { d[i] = 'b'; }
            else if ( b[i] == 'z') { d[i] = 'c'; }
            else if ( b[i] == 'w') { d[i] = 'd'; }
            else if ( b[i] == 's') { d[i] = 'e'; }
            else if ( b[i] == 'x') { d[i] = 'f'; }
            else if ( b[i] == 'e') { d[i] = 'g'; }
            else if ( b[i] == 'd') { d[i] = 'h'; }
            else if ( b[i] == 'c') { d[i] = 'i'; }
            else if ( b[i] == 'r') { d[i] = 'j'; }
            else if ( b[i] == 'f') { d[i] = 'k'; }
            else if ( b[i] == 'v') { d[i] = 'l'; }
            else if ( b[i] == 't') { d[i] = 'm'; }
            else if ( b[i] == 'g') { d[i] = 'n'; }
            else if ( b[i] == 'b') { d[i] = 'o'; }
            else if ( b[i] == 'y') { d[i] = 'p'; }
            else if ( b[i] == 'h') { d[i] = 'q'; }
            else if ( b[i] == 'n') { d[i] = 'r'; }
            else if ( b[i] == 'u') { d[i] = 's'; }
            else if ( b[i] == 'j') { d[i] = 't'; }
            else if ( b[i] == 'm') { d[i] = 'u'; }
            else if ( b[i] == 'i') { d[i] = 'v'; }
            else if ( b[i] == 'k') { d[i] = 'w'; }
            else if ( b[i] == 'o') { d[i] = 'x'; }
            else if ( b[i] == 'l') { d[i] = 'y'; }
            else if ( b[i] == 'p') { d[i] = 'z'; }
        }

        for (i = 0; i < d.length; i++) { System.out.print (d[i]); }
        System.out.println();

        return "/0";
    }
}

class CaesarCipher extends Cipher {
    CaesarCipher (String plainText, int key) {
        super (plainText, key);
    }

    String Encryption() {
        char[] c = plainText.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) (c[i] + key);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
        return "/0";
    }

    String Decryption() {
        char[] c = plainText.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) (c[i] + key);
        }
        char a[] = plainText.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (c[i] - key);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        return "/0";
    }
}

public class CipherAbst {
    public static void main (String [] args) {
        SubstitutionCipher s = new SubstitutionCipher("gcet", 3);
        CaesarCipher c = new CaesarCipher("gcet", 3);
        s.Encryption();
        s.Decryption();
        c.Encryption();
        c.Decryption();
    }
}
