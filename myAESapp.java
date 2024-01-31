import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class myAESapp {
    private static SecretKeySpec secretKey;
    private static byte[] key;

    public static void setKey(String myKey) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        key = myKey.getBytes("UTF-8");

        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        key = sha.digest(key);
        key = Arrays.copyOf(key,16);
        secretKey = new SecretKeySpec(key,"AES");
    }

    //Encryption
    public static String encrypt(String strToEnc,String sec){
        try {
            setKey(sec);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEnc.getBytes("UTF-8")));

        }
        catch (Exception e){

        }
        return null;
    }

    //Decryption
    public static String decrypt(String strToDec,String sec){
        try {
            setKey(sec);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDec)));

        }
        catch (Exception e){

        }
        return null;
    }

    public static void main(String[] args) {
        final String secretKey = "AnnaUniversity";
        String originalString = "WWW.annauniv.edu";


        String ensite = myAESapp.encrypt(originalString,secretKey);
        String desite = myAESapp.decrypt(ensite,secretKey);

        System.out.println("Original String : "+ originalString);
        System.out.println("Encrypted Text : "+ ensite);
        System.out.println("Ddecrypted Text : "+ desite);
    }


}
