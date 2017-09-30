import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();
        System.out.println(Math.round(a1+a2+a3));
        System.out.println(Math.round(a1+a2+a3)/3);
    }
}
