
package FebSeven;
import java.lang.String;
import java.util.Scanner;

public class wordReversal {

    public static String reversal(String str) {
        String reversed ="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp="";
        
        String s = reversal(str); // function call to reverse the taken string
        str = "";
        for (int i = 0; i < s.length(); i++) {
            if( i== s.length()-1){
                str += s.charAt(i);
                str = reversal(str);
                temp += str;
                break;
            }else if(s.charAt(i)==' '){
                str = reversal(str);
                temp += str;
                temp += s.charAt(i);
                str ="";
            }else{
                str+= s.charAt(i);
            }

        }
        
        System.out.println(temp);
        
        sc.close();
        
    }
}
