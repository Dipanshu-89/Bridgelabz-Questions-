import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height:");
        int h=sc.nextInt();
        System.out.println("enter a radius:");
        int r= sc.nextInt();
        float v=3.14f*r*r*h;
        System.out.println("volume of a cylinder:"+v);
        sc.close();
    }
}
