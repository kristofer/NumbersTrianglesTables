public class Encryptor {

    public static char substitute(char c) {
        char[] plainAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] cipherAlphabet = "defghijklmnopqrstuvwxyzabc".toCharArray();
        for (int i = 0; i < plainAlphabet.length; i++) {
            if (plainAlphabet[i] == c) {
                return cipherAlphabet[i];
            }
        }
        return c;
    }

    public static char substituteReverse(char c) {
        // use ascii values and modulus to wrap around
        if (c >= 'a' && c <= 'z') {
            return (char) (((c - 'a' + 23) % 26) + 'a');
        }
        return c;
    }

    public static String encrypt(String input) {
        if (input.length() < 3) {
            throw new IllegalArgumentException(
                "Input string must be at least 3 characters long."
            );
        }

        StringBuilder encryptedString = new StringBuilder();

        // Shift all characters except the last 3 by 3 positions
        for (int i = 0; i < input.length() - 3; i++) {
            char shiftedChar = (char) (input.charAt(i) + 3);
            encryptedString.append(shiftedChar);
        }

        // Substitute the last 3 characters
        for (int i = input.length() - 3; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char substitutedChar;
            switch (currentChar) {
                case 'x':
                    substitutedChar = 'a';
                    break;
                case 'y':
                    substitutedChar = 'b';
                    break;
                case 'z':
                    substitutedChar = 'c';
                    break;
                default:
                    substitutedChar = currentChar;
                    break;
            }
            encryptedString.append(substitutedChar);
        }

        return encryptedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "wxyz";
        String encryptedString = encrypt(inputString);
        System.out.println("Original: " + inputString);
        System.out.println("Encrypted: " + encryptedString);
    }
}
