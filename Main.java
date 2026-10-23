import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.println("Xin chao " + hoTen + "!");

        sc.close();
    }
}