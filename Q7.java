import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a length:");
        int l=sc.nextInt();
        System.out.println("enter a bredth:");
        int b=sc.nextInt();
        int p=2*(l+b);
        System.out.println("perimeter:"+p);
        sc.close();
    }
}
