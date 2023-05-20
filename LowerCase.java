import java.util.*;

public class LowerCase {
    public static void main(String args[]){
        System.out.println("Enter string");
        
        String str = new Scanner(System.in).next();
        int count =0;
        //Scanner sc = new Scanner(System.in);
        
        //str = sc.nextLine();

        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

            
        }
        System.out.println("The vowel count is = " +count);

    }
}
