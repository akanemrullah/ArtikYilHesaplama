import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int year;

        // Scanner sinifina ait degisken projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan yil bilgisi alinip ilgili degiskene atandi.
        System.out.print("Yıl Giriniz :");
        year = input.nextInt();

        // If-else yapisiyla birlikte mantiksal karsilastirmalar yapilip sonucunda kullaniciya cikti verildi.
        if (year % 100 != 0 && year % 4 == 0) {
            System.out.print(year + " bir artık yıldır !");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.print(year + " bir artık yıldır !");
        } else {
            System.out.print(year + " bir artık yıl değildir !");
        }
    }
}