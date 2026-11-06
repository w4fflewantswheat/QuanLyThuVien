package BTT2;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysachthuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BAI 1: Mang so luong cua 5 cuon sach
        int[] soLuong = new int[5];
        int tongMang = 0;
        int lonNhat = 0;

        System.out.println("===== BAI 1: MANG SO LUONG SACH =====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong cuon sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            tongMang += soLuong[i];

            if (i == 0 || soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("\nSo luong 5 cuon sach:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cuon sach " + (i + 1) + ": " + soLuong[i]);
        }
        System.out.println("Tong so luong: " + tongMang);
        System.out.println("So luong lon nhat: " + lonNhat);

        // BAI 2 va BAI 3: Su dung ArrayList de quan ly ma sach va thong tin sach
        ArrayList<String> danhSachMaSach = new ArrayList<String>();
        ArrayList<String> danhSachSach = new ArrayList<String>();

        int chon;

        // BAI 4: Menu quan ly thu vien
        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();

                    if (danhSachMaSach.contains(maSach)) {
                        System.out.println("Ma sach da ton tai!");
                        break;
                    }

                    System.out.print("Nhap ten sach: ");
                    String tenSach = sc.nextLine();

                    System.out.print("Nhap ten tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    int namXuatBan = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap so luong: ");
                    int soLuongSach = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap don gia: ");
                    int donGia = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap loai sach (1-4): ");
                    int loaiSach = Integer.parseInt(sc.nextLine());

                    // Luu thong tin sach trong mot phan tu String
                    String thongTin = maSach + "|" + tenSach + "|" + tacGia + "|"
                            + namXuatBan + "|" + soLuongSach + "|" + donGia + "|" + loaiSach;

                    danhSachMaSach.add(maSach);
                    danhSachSach.add(thongTin);
                    System.out.println("Da them sach thanh cong!");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang trong!");
                    } else {
                        System.out.println("\n===== DANH SACH SACH =====");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] sach = danhSachSach.get(i).split("\\|");
                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + sach[0]);
                            System.out.println("Ten sach: " + sach[1]);
                            System.out.println("Tac gia: " + sach[2]);
                            System.out.println("Nam xuat ban: " + sach[3]);
                            System.out.println("So luong: " + sach[4]);
                            System.out.println("Don gia: " + sach[5]);
                            System.out.println("Loai sach: " + sach[6]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    int viTriTim = danhSachMaSach.indexOf(maCanTim);

                    if (viTriTim != -1) {
                        String[] sach = danhSachSach.get(viTriTim).split("\\|");
                        System.out.println("\n===== THONG TIN SACH =====");
                        System.out.println("Ma sach: " + sach[0]);
                        System.out.println("Ten sach: " + sach[1]);
                        System.out.println("Tac gia: " + sach[2]);
                        System.out.println("Nam xuat ban: " + sach[3]);
                        System.out.println("So luong: " + sach[4]);
                        System.out.println("Don gia: " + sach[5]);
                        System.out.println("Loai sach: " + sach[6]);
                    } else {
                        System.out.println("Khong tim thay sach co ma " + maCanTim);
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maCanXoa = sc.nextLine();
                    int viTriXoa = danhSachMaSach.indexOf(maCanXoa);

                    if (viTriXoa != -1) {
                        danhSachMaSach.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);
                        System.out.println("Da xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    String maCanSua = sc.nextLine();
                    int viTriSua = danhSachMaSach.indexOf(maCanSua);

                    if (viTriSua != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        String tenSachMoi = sc.nextLine();

                        System.out.print("Nhap ten tac gia moi: ");
                        String tacGiaMoi = sc.nextLine();

                        System.out.print("Nhap nam xuat ban moi: ");
                        int namMoi = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap so luong moi: ");
                        int soLuongMoi = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap don gia moi: ");
                        int donGiaMoi = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap loai sach moi (1-4): ");
                        int loaiMoi = Integer.parseInt(sc.nextLine());

                        String thongTinMoi = maCanSua + "|" + tenSachMoi + "|" + tacGiaMoi + "|"
                                + namMoi + "|" + soLuongMoi + "|" + donGiaMoi + "|" + loaiMoi;

                        danhSachSach.set(viTriSua, thongTinMoi);
                        System.out.println("Da cap nhat sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                case 6:
                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] sach = danhSachSach.get(i).split("\\|");
                        tongSoLuong += Integer.parseInt(sach[4]);
                    }

                    System.out.println("Tong so luong sach trong thu vien: " + tongSoLuong);
                    break;

                case 7:
                    int tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] sach = danhSachSach.get(i).split("\\|");
                        int soLuongHienTai = Integer.parseInt(sach[4]);
                        int donGiaHienTai = Integer.parseInt(sach[5]);
                        tongGiaTri += soLuongHienTai * donGiaHienTai;
                    }

                    System.out.println("Tong gia tri sach trong thu vien: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (chon != 8);

        sc.close();
    }
}
