public class Polindrom {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if(isPalindrome(args[i])){
                String s = args[i];
                System.out.println(s + " " +isPalindrome(s));
            }
        }
    }
    public static String reverseString(String reverse) { //reverse - строка которая будет перевёрнута
        char[] array = reverse.toCharArray();
        String NewString = ""; // NewString - полученная строка после переворота
        for (int i = array.length - 1; i >= 0; i--) {
            NewString = NewString + array[i];
        }
        return NewString;
    }

    public static boolean isPalindrome(String str){
        String NewStr = reverseString(str);
        return str.equals(NewStr);// сравнение по ссылкам
    }
}















/*
import java.util.Objects;

public class Polindrom {
    public static void main(String[] args){
        //String[] word = {"дед", "джава"};
        for (int i = 0; i < args.length; i++) {
            if (isPalindrom(args[i])){
                String s = args[i];
                System.out.println(s + " " + isPalindrom(String.valueOf(s)));
            }
            else {
                System.out.println(" ");
            }

        }
    }
    public static String reverse (String myString){
        char[] array = myString.toCharArray();
        String myNewString = "";
        for (int i = array.length - 1; i>=0; i--){
            myNewString += array[i];
        }
        return myNewString;
    }
    public static boolean isPalindrom(String str){
        String myNewStr = reverse(str);
        if (Objects.equals(myNewStr, str)){
            return true;
        }
        else {
            return false;
        }
public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " +isPalindrome(s));
        }
    }
    }
}


 */