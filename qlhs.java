package DOAN;


import java.util.Scanner;

public class qlhs {
  
    public static float a[];
    public static int sl = 5;
    public static String ht[];
    public static String mhs[];
    public static String xl[];

    public static float nhapdiem() {
        float tg;
        Scanner sc = new Scanner(System.in);
        tg = sc.nextFloat();
        return tg;
    }

    public static String nhapht() {
        Scanner sc = new Scanner(System.in);
        String tg = sc.nextLine();
        return tg;
    }

    public static String nhapmhs() {
        Scanner sc = new Scanner(System.in);
        String tg = sc.nextLine();
        return tg;
    }

    public static void nhapmang() {
        int i;
        a = new float[10];
        ht = new String[10];
        mhs = new String[10];

        for (i = 0; i < sl; i++) {

            System.out.println("Nhap ma hoc sinh thu " + (i + 1) + ": ");
            mhs[i] = nhapmhs();
            for (int j = 0; j < i; j++) {
                if (mhs[i].compareTo(mhs[j]) == 0) {
                    System.out.println("Ma hoc sinh da ton tai, xin nhap lai: ");
                    mhs[i] = nhapmhs();
                }
            }
            System.out.println("Nhap ho ten hoc sinh thu " + (i + 1) + " : ");
            ht[i] = nhapht();

            System.out.println("Nhap diem hoc sinh thu  " + (i + 1) + ": ");
            a[i] = nhapdiem();
            if ((a[i] < 0) && (a[i] > 10))
                a[i] = nhapdiem();
        }
    }

    public static void tieude(){
        System.out.println("\n \nDANH SACH HIEN THOI");
        
    }
    public static void hthi() {
        
        System.out.printf("| %-12s | %-20s | %-10s|\n", "Ma hoc sinh", "Ho ten", "Diem");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < sl; i++) {
            ht[i] = ht[i].toUpperCase();
            System.out.printf("| %-12s | %-20s | %-10.2f| \n", mhs[i], ht[i], a[i]);
            System.out.println("---------------------------------------------------");
        }
    }

    public static void sxdiem() {
        float tg = a[0];
        String tg2 = ht[0], tg3 = mhs[0];
        for (int i = 0; i < sl - 1; i++) {
            for (int j = i + 1; j < sl; j++) {
                if (a[i] < a[j]) {
                    tg = a[j];
                    a[j] = a[i];
                    a[i] = tg;
                    tg2 = ht[j];
                    ht[j] = ht[i];
                    ht[i] = tg2;
                    tg3 = mhs[j];
                    mhs[j] = mhs[i];
                    mhs[i] = tg3;
                }
            }
        }
    }

    public static void diemcao() {
        int i;
        float max;
        sxdiem();
        max = a[0];
        System.out.println("DANH SACH HOC SINH CO DIEM SO CAO NHAT");
        System.out.printf("\n|%-12s | %-20s | %-10s |\n", "Ma hoc sinh", "Ho ten", "Diem");

        for (i = 0; i < sl; i++) {
            if (a[i] == max) {
                System.out.println("---------------------------------------------------");
                System.out.printf("| %-12s | %-20s | %-10.2f | \n", mhs[i], ht[i], a[i]);

            } else
                break;

        }
        System.out.println("---------------------------------------------------\n\n");
    }

    public static int tk(String ma) {
        int i;
        for (i = 0; i < sl; i++) {
            if (mhs[i].compareTo(ma) == 0) {
                break;
            }
        }
        return (i);
    }

   

    public static void suadoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoc sinh can sua doi thong tin:");
        String ma = sc.nextLine();
        float diem;
        System.out.println("Sua doi ten hoc sinh:");
        String ten = sc.nextLine();
        System.out.println("Sua doi diem hoc sinh:");
        diem = sc.nextFloat();

        if (tk(ma) < sl) {

            ht[tk(ma)] = ten;
            System.out.println("\n \nnTHONG TIN SAU KHI THAY DOI");
            System.out.printf("\n| %-12s | %-20s | %-10s|\n", "Ma hoc sinh", "Ho ten", "Diem");
            System.out.println("---------------------------------------------------");

            ht[tk(ma)] = ht[tk(ma)].toUpperCase();
            System.out.printf("| %-12s | %-20s | %-10.2f| \n", mhs[tk(ma)], ht[tk(ma)], a[tk(ma)]);
            System.out.println("---------------------------------------------------");

            a[tk(ma)] = diem;

        }
        if (tk(ma) == sl)
            System.out.println("Khong tim thay sinh vien");
    }

    public static void xoahs(String maxoa) {
        if (tk(maxoa) < sl) {
            for (int i = tk(maxoa); i < sl; i++) {
                mhs[i] = mhs[i + 1];
                ht[i] = ht[i + 1];
                a[i] = a[i + 1];
            }
            sl -= 1;
        } else
            System.out.println("Khong tim thay ma hoc sinh can xoa");
    }

    public static void themhs() {
        int i;
        System.out.println("Nhap ma hoc sinh thu " + (sl + 1) + ": ");
        mhs[sl] = nhapmhs();
        for (i = 0; i < sl; i++) {
            if (mhs[sl].compareTo(mhs[i]) == 0) {
                System.out.println("Ma hoc sinh da ton tai, xin nhap lai:");
                mhs[sl] = nhapmhs();
            }
        }
        System.out.println("Nhap ho ten hoc sinh thu " + (i + 1) + " : ");
        ht[i] = nhapht();
        System.out.println("Nhap diem hoc sinh thu " + (i + 1) + ": ");
        a[i] = nhapdiem();
        sl += 1;
    }

    public static void xeploai() {
        xl = new String[10];
        for (int i = 0; i < sl; i++) {
            if (a[i] < 3)
                xl[i] = "KEM";
            else if (a[i] >= 8)
                xl[i] = "GIOI";
            else if (a[i] >= 7)
                xl[i] = "KHA";
            else if (a[i] >= 5)
                xl[i] = "TRUNG BINH";
            else
                xl[i] = "YEU";
        }
        System.out.println("\n \nDANH SACH HOC SINH SAU KHI XEP LOAI");
        System.out.printf("\n| %-12s | %-20s | %-10s | %10s|\n", "Ma hoc sinh", "Ho ten", "Diem", "Xep loai");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < sl; i++) {
            ht[i] = ht[i].toUpperCase();
            System.out.printf("| %-12s | %-20s | %-10.2f | %10s| \n", mhs[i], ht[i], a[i], xl[i]);
            System.out.println("----------------------------------------------------------------");
        }
    }

    
}
