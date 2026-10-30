
package BTT2;

import java.util.Scanner;

public class Quanlysachthuvien {
    public static void main(String[] args) {
        String masach, tenSach, tacgia;
        int namXuatBan, soluong, dongia, thanhtien, phivanchuyen, tongtien;
        int loaisach;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sach: ");
        masach = sc.nextLine();

        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.println("Nhap ten tac gia: ");
        tacgia = sc.nextLine();

        System.out.println("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();

        System.out.println("Nhap so luong: ");
        soluong = sc.nextInt();

        System.out.println("Nhap don gia: ");
        dongia = sc.nextInt();

        System.out.println("Nhap loai sach (1-4): ");
        loaisach = sc.nextInt();

        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soluong);
        System.out.println("Don gia: " + dongia);

        thanhtien = soluong * dongia;
        System.out.println("Thanh tien: " + thanhtien);

        phivanchuyen = thanhtien * 5 / 100;
        System.out.println("Phi van chuyen: " + phivanchuyen);

        tongtien = thanhtien + phivanchuyen;
        System.out.println("Tong tien: " + tongtien);

        if (dongia > 0 && soluong > 0) {
            System.out.println("Sach hop le");
        } else {
            System.out.println("Sach khong hop le");
        }

        if (dongia < 50000) {
            System.out.println("Sach gia thap");
        } else if (dongia < 100000) {
            System.out.println("Sach gia trung binh");
        } else if (dongia < 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        if (soluong > 20) {
            System.out.println("Sach con nhieu");
        } else if (soluong >= 6) {
            System.out.println("Con it");
        } else if (soluong > 1) {
            System.out.println("Sap het");
        } else {
            System.out.println("Het sach");
        }

        switch (loaisach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }

        sc.close();
    }
}
