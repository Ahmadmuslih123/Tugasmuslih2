package com.muslihmodul2.no2;

public class Ikan extends Binatang{
    public String nama;
    public String berenang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan Ikan
    public void berenang(){
        System.out.println("Aktivitas\t\t: " + berenang);
    }
}
