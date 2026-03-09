class RobloxItem {
    String namaItem;
    int harga;

    RobloxItem(String namaItem, int harga) {
        this.namaItem = namaItem;
        this.harga = harga;
    }

    void tampilkanInfo() {
        System.out.println("Item: " + this.namaItem + " | Harga: " + this.harga + " Robux");
    }
}