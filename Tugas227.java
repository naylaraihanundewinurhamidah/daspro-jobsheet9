import java.util.Scanner;

public class Tugas227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("Cari nama menu untuk cek harga: ");
        String cariMenu = sc.nextLine();
        int indeksCari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                indeksCari = i;
                break;
            }
        }

        if (indeksCari != -1) {
            System.out.println("Menu tersedia: " + menu[indeksCari] + " (Rp " + harga[indeksCari] + ")");
        } else {
            System.out.println("Maaf, menu " + cariMenu + " tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            while (true) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String pilihMenu = sc.nextLine();
                int indeksMenu = -1;

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihMenu)) {
                        indeksMenu = j;
                        break;
                    }
                }

                if (indeksMenu != -1) {
                    daftarPesanan[i] = menu[indeksMenu];
                    hargaPesanan[i] = harga[indeksMenu];
                    totalBiaya += harga[indeksMenu];
                    break;
                } else {
                    System.out.println("Menu tidak ditemukan! Silakan masukkan nama menu yang valid sesuai daftar.");
                }
            }
        }

        System.out.println("=== STRUK PEMESANAN KAFE KAMPUS ===");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + ": Rp " + hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Biaya: Rp " + totalBiaya);

        sc.close();
    }
}