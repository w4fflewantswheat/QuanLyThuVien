package BTT2;

import java.util.Scanner;

public class Quanlysachthuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] masach = new String[100];
        String[] tenSach = new String[100];
        String[] tacgia = new String[100];
        int[] namXuatBan = new int[100];
        int[] soluong = new int[100];
        int[] dongia = new int[100];
        int[] loaisach = new int[100];

        int n = 0;
        int chon;

        do {
            System.out.println("\\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach can nhap (toi da 100): ");
                    n = sc.nextInt();
                    sc.nextLine();

                    if (n <= 0 || n > 100) {
                        System.out.println("So luong khong hop le!");
                        n = 0;
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\\n--- Nhap thong tin sach thu " + (i + 1) + " ---");

                        System.out.print("Nhap ma sach: ");
                        masach[i] = sc.nextLine();

                        System.out.print("Nhap ten sach: ");
                        tenSach[i] = sc.nextLine();

                        System.out.print("Nhap ten tac gia: ");
                        tacgia[i] = sc.nextLine();

                        System.out.print("Nhap nam xuat ban: ");
                        namXuatBan[i] = sc.nextInt();

                        System.out.print("Nhap so luong: ");
                        soluong[i] = sc.nextInt();

                        System.out.print("Nhap don gia: ");
                        dongia[i] = sc.nextInt();

                        System.out.print("Nhap loai sach (1-4): ");
                        loaisach[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    System.out.println("\\nDa nhap " + n + " sach.");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach. Hay chon muc 1 truoc!");
                        break;
                    }

                    int tongSoLuong = 0;
                    int tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soluong[i];
                        tongGiaTri += soluong[i] * dongia[i];
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach. Hay chon muc 1 truoc!");
                        break;
                    }

                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (masach[i].equalsIgnoreCase(maCanTim)) {
                            int thanhtien = soluong[i] * dongia[i];
                            int phivanchuyen = thanhtien * 5 / 100;
                            int tongtien = thanhtien + phivanchuyen;

                            System.out.println("\\n--- THONG TIN SACH ---");
                            System.out.println("Ma sach: " + masach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Ten tac gia: " + tacgia[i]);
                            System.out.println("Nam xuat ban: " + namXuatBan[i]);
                            System.out.println("So luong: " + soluong[i]);
                            System.out.println("Don gia: " + dongia[i]);
                            System.out.println("Thanh tien: " + thanhtien);
                            System.out.println("Phi van chuyen: " + phivanchuyen);
                            System.out.println("Tong tien: " + tongtien);

                            if (dongia[i] > 0 && soluong[i] > 0) {
                                System.out.println("Sach hop le");
                            } else {
                                System.out.println("Sach khong hop le");
                            }

                            if (dongia[i] < 50000) {
                                System.out.println("Sach gia thap");
                            } else if (dongia[i] < 100000) {
                                System.out.println("Sach gia trung binh");
                            } else if (dongia[i] < 200000) {
                                System.out.println("Sach gia cao");
                            } else {
                                System.out.println("Sach gia dac biet");
                            }

                            if (soluong[i] > 20) {
                                System.out.println("Sach con nhieu");
                            } else if (soluong[i] >= 6) {
                                System.out.println("Con it");
                            } else if (soluong[i] > 1) {
                                System.out.println("Sap het");
                            } else {
                                System.out.println("Het sach");
                            }

                            switch (loaisach[i]) {
                                case 1:
                                    System.out.println("Loai sach: Sach giao khoa");
                                    break;
                                case 2:
                                    System.out.println("Loai sach: Sach tham khao");
                                    break;
                                case 3:
                                    System.out.println("Loai sach: Sach chuyen nganh");
                                    break;
                                case 4:
                                    System.out.println("Loai sach: Sach khac");
                                    break;
                                default:
                                    System.out.println("Loai sach khong hop le");
                            }

                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + maCanTim);
                    }
                    break;

                case 4:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (chon != 4);

        sc.close();
    }
}
