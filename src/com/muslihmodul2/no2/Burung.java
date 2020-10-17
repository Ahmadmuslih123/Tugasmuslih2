package com.muslihmodul2.no2;

public class Burung extends Binatang{
    public String nama;
    public String terbang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak aktivitas hewan burung
    public void terbang(){
        System.out.println("Aktivitas\t\t: " + terbang);
    }
}
