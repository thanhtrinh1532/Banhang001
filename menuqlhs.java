package DOAN;

import java.util.Scanner;
import DOAN.qlhs;
public class menuqlhs {
    public static void main(String[] args) {

        qlhs.nhapmang();
        int chucNang, chucNang1, chucNang2;

        do {
            System.out.println("\n\n");
            System.out.println("                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("                                *-*-*           Chon chuc vu thuc hien chuc nang      *-*-*");
            System.out.println("                                *-*           1: HOC SINH                              *-*-*");
            System.out.println("                                *-*           2: GIAO VIEN                             *-*-*");
            System.out.println("                                *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n");

            Scanner s = new Scanner(System.in);
            System.out.print("Chon chuc nang can thuc hien: ");
            chucNang = s.nextInt();
            switch (chucNang) {
                case 1:
                    do {
                        System.out.println("\n \n");
                        System.out.println(
                                "                                *-*-*-*-*-*-*-DANH SACH CHUC NANG CUA HOC SINH*-*-*-*-*-*-*");
                        System.out.println("                                *-*   1: HIEN THI DANH SACH                             *-*");
                        System.out.println("                                *-*   2: SAP XEP THEO DIEM TANG DAN                     *-*");
                        System.out.println("                                *-*   3: TIM DANH SACH HOC SINH CAO DIEM NHAT           *-*");
                        System.out.println("                                *-*   4: XEP LOAI HOC SINH                              *-*");
                        System.out.println("                                *-*   5: TIM KIEM HOC SINH THEO MA HOC SINH             *-*");
                        System.out.println("                                *-*   6: THOAT CHUONG TRINH                             *-*");
                        System.out.println(
                                "                                -----------------------------------------------------------\n \n");

                        System.out.print("Chon chuc nang can thuc hien: ");
                        chucNang1 = s.nextInt();
                        switch (chucNang1) {
                            case 1:
                                qlhs.tieude();
                                qlhs.hthi();
                                break;
                            case 2:
                                qlhs.tieude();
                                qlhs.hthi();
                                qlhs.sxdiem();
                                System.out.println("DANH SACH HOC SINH SAU KHI SAP XEP");
                                qlhs.hthi();
                                break;
                            case 3:
                                System.out.println("DANH SACH HOC SINH CO DIEM SO CAO NHAT");
                                qlhs.diemcao();
                                break;
                            case 4:
                                qlhs.xeploai();
                                break;
                            case 5:
                                qlhs.hstk();
                                break;
                            default:
                                break;
                        }
                    } while (chucNang1 != 6);
                    break;

                case 2:
                    do {
                        System.out.println("\n \n");
                        System.out.println(
                                "                                *-*-*-*-*-*-DANH SACH CHUC NANG QUAN LY HOC SINH*-*-*-*-*-*");
                        System.out.println("                                *-*   1: HIEN THI DANH SACH                             *-*");
                        System.out.println("                                *-*   2: SAP XEP THEO DIEM TANG DAN                     *-*");
                        System.out.println("                                *-*   3: TIM 1 HOC SINH THEO MA HS                      *-*");
                        System.out.println("                                *-*   4: TIM DANH SACH HOC SINH CAO DIEM NHAT           *-*");
                        System.out.println("                                *-*   5: BO SUNG HOC SINH VAO DANH SACH                 *-*");
                        System.out.println("                                *-*   6: XOA HOC SINH TRONG DANH SACH THEO MA HS        *-*");
                        System.out.println("                                *-*   7: XEP LOAI HOC SINH                              *-*");
                        System.out.println("                                *-*   8: THOAT CHUONG TRINH                             *-*");
                        System.out.println(
                                "                                -----------------------------------------------------------\n \n");

                        System.out.print("Chon chuc nang can thuc hien: ");
                        chucNang2 = s.nextInt();
                        switch (chucNang2) {
                            case 1:
                                qlhs.tieude();
                                qlhs.hthi();
                                break;
                            case 2:
                            qlhs.teiude();
                                qlhs.hthi();
                                qlhs.sxdiem();
                                qlhs.hthi();
                                break;
                            case 3:
                                qlhs.suadoi();
                                qlhs.tieude();
                                qlhs.hthi();
                                break;
                            case 4:
                                System.out.println("DANH SACH HOC SINH CO DIEM SO CAO NHAT");
                                qlhs.diemcao();
                                break;
                            case 5:
                                qlhs.themhs();
                                qlhs.tieude();
                                qlhs.hthi();
                                break;
                            case 6:
                                Scanner sx = new Scanner(System.in);
                                System.out.println("Ma hoc sinh can xoa:");
                                String maxoa = sx.nextLine();
                                qlhs.xoahs(maxoa);
                                System.out.println("DANH SACH HOC SINH XOA");
                                qlhs.hthi();
                                break;
                            case 7:
                                qlhs.xeploai();
                                break;
                            default:
                                break;
                        }
                    } while (chucNang2 != 8);
                    break;

                default:
                    break;
            }
        } while (chucNang != 3);
    }
}
