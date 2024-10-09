public class CaesarCipher {
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char offset = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - offset + shift + 26) % 26 + offset);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "HELLO WORLD";
        int shift = 3;
        String encrypted = caesarCipher(text, shift);
        System.out.println("Teks terenkripsi: " + encrypted);
        String decrypted = caesarCipher(encrypted, -shift);
        System.out.println("Teks terdekripsi: " + decrypted);
    }
}