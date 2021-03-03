package com.company.z2;

public class main {
    public static void main(String[] args) {
        Shop sklep = new Shop("Jasna Góra 69", "Olbrzymiej");
        sklep.get_info();

        Bookshop ksiegarnia = new Bookshop("Kopernika 32", "Średniej");
        ksiegarnia.get_info();

        Bakery piekarnia = new Bakery("Czarna Dziura -60", "Małej");
        piekarnia.get_info();

    }
}
