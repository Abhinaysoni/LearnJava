 /* printing number in descending order 
 * with the help of recursion. This is my first recursion program.
   Recursion is a special technique which call itself.
 * 1-> create a function which inkoves recursion named "printdec()".
   2-> Declare base class.
   3-> write code which calls itself according to the question.
 */
public class Recursion {
   
    public static void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printdec(n-1);
    }
    

    public static void main(String args[]){
        int n = 10;
        printdec(n);


    }
}

