import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = in.nextInt();
        
        Double TrNum = ((num/2)*(num+1));
        System.out.println(TrNum);
    }
}