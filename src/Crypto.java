import java.util.*;
import java.lang.*;

public class Crypto {
    public static void main(String[] args) {
        //encryptString (string  encrypted,  int shift , int size);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("provide a string please? ");
        String text = input.nextLine();
        String normalizedText = normalizeText(text);
        System.out.println(normalizedText);
        String obified = obify(normalizedText);
        System.out.println(obified);
        String caesarified = caesarify(obified,3);
        System.out.println(caesarified);
        String groupified = groupify(caesarified, 6);
        System.out.println(groupified);
    }

    public static String normalizeText(String something){
        something = something.replaceAll("[\\s\"()\\\\?:!.,]+", "");
        something = something.toUpperCase();
        return something; }

    public static String obify(String something){
        String all = "";
        for (int i = 0 ; i < something.length() ; i++){char cur = something.charAt(i);
            if (List.of('A','I','Y','O','E','U').contains(cur)){all += ("OB"+cur);} else { all += cur; }}return all;}

    public static String caesarify (String n, int shift) {
        String result = "";
        int alphabet = 26;
        for (int i = 0; i < n.length(); i++) {
            char cur = n.charAt(i);
            cur += (char) shift;
            if (cur > 'Z'){
                int plu = ((int) cur % alphabet)-13;
                //DON'T ASK, IT WORKS!
                cur = (char) ('A' + plu);
            }
            result = result + cur;}return result;}
/*
    public static String caesarify(String clear , int x) {
        int start = 0;
        if (x < 0) {
            start = (int) 'Z' + x + 1;
        } else {
            start = 'A' + x;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }} return result; }
*/
public static String groupify (String n , int x) {
    int length = n.length();
    int additive = x - (length % x);
    String result = "";
    if (length % x == 0) {

        if (length == x) {
            result = result + n.substring(0, x) + " ";
        } else {
            result = result + n.substring(0, x ) + " ";
            String newN = n.replace(n.substring(0, x), "");
            //groupify(newN, x);
            result = result + " " + groupify(newN, x);
            return result;
        }
    } else {
        String addN = "";
        for (int i = 0; i < additive; i++) {
            addN += "x";
        }
        n += addN;
        //System.out.print(n);
        return groupify(n, x);
    }
    return result;

}

}
/*Write a method called ungroupify which takes one parameter, a string containing space-separated groups,
and returns the string without any spaces. So if you call ungroupify(“THI SIS ARE ALL YGR EAT SEN TEN CEx”)
you will return “THISISAREALLYGREATSENTENCE”


Now write a function called decryptString which takes three parameters: a string to be decrypted and the
integer shift value used to encrypt the string, and returns a string which contains the (normalized) plaintext.
You can assume the string was encrypted by a call to encryptString().

So if you were to call

String cyphertext = encryptString(“Who will win the election?”,  5, 3);
String plaintext = decryptString(cyphertext, 5);
… then you’ll get back the normalized input string “WHOWILLWINTHEELECTION”.*/