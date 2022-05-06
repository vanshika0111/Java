class Cipher {
    String plainText;
    int key;

    Cipher(String plaintext, int key) {
        this.plainText = plaintext;
        this.key = key;
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

    public static void main(String args[]) {
        Cipher str = new Cipher("MBIT", 3);
        str.Encryption();
        str.Decryption();
    }
}
