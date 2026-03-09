import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<RobloxItem> listData = new ArrayList<>();


        listData.add(new RobloxItem("1000 Robux", 150000));
        listData.add(new RobloxItem("Blox Fruit Kilo", 500));
        listData.add(new RobloxItem("Robot Animation", 25000));

        boolean berjalan = true;


        while (berjalan) {
            System.out.println("\n--- MENU ROBLOX (MODUL 2) ---");
            System.out.println("1. Tambah | 2. Lihat | 3. Ubah | 4. Hapus | 5. Keluar");
            System.out.print("Pilih: ");
            int menu = input.nextInt();
            input.nextLine();


            if (menu == 1) {
                System.out.print("Nama Item: "); String n = input.nextLine();
                System.out.print("Harga: "); int h = input.nextInt();
                listData.add(new RobloxItem(n, h));
            }
            else if (menu == 2) {
                System.out.println("DAFTAR ITEM:");
                for (int i = 0; i < listData.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    listData.get(i).tampilkanInfo();
                }
            }
            else if (menu == 3) {
                System.out.print("Nomor item yang diubah harganya: ");
                int index = input.nextInt() - 1;
                System.out.print("Harga Baru: ");
                listData.get(index).harga = input.nextInt();
            }
            else if (menu == 4) {
                System.out.print("Nomor item yang dihapus: ");
                int index = input.nextInt() - 1;
                listData.remove(index);
                System.out.println("Data dihapus.");
            }
            else if (menu == 5) {
                berjalan = false;
                System.out.println("Keluar program...");
            }
        }
    }
}