/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankjava.InterviewPrepKit;

/**
 *
 * @author faiya
 */
public class EncryptionDecryption {

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String decryptMessage(String encryptedMessage) {
        String reversed = "";
        String word = "";
        for (int i = encryptedMessage.length() - 1; i >= 0; i--) {
            if (String.valueOf(encryptedMessage.charAt(i)) == " ") {
                StringBuilder input1 = new StringBuilder();
                input1.append(word);
                input1.reverse();
                reversed += input1;
                reversed += " ";
                word = "";
            } else {
                word += String.valueOf(encryptedMessage.charAt(i));
            }

        }
        String res = "";
        int i = 0;
        while (i <= reversed.length() - 1) {
            if (isNumeric(String.valueOf(reversed.charAt(i)))) {
                for (int j = 0; j < Integer.parseInt(String.valueOf(reversed.charAt(i))); j++) {
                    res += String.valueOf(reversed.charAt(i - 1));
                }
                i++;
            } else {
                res += String.valueOf(reversed.charAt(i));
                i++;
            }
        }
        return res;
    }
}
