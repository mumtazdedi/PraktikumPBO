/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mumta
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama, nim;
        int uts, uas, umur, set;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("NIM : ");
        nim = input.nextLine();

        System.out.print("Umur : ");
        umur = input.nextInt();

        System.out.print("UTS : ");
        uts = input.nextInt();

        System.out.print("UAS : ");
        uas = input.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, umur, uts, uas);

        do {
            System.out.println("");
            System.out.println("Silahkan pilih salah satu menu di bawah ini :");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Exit");
            System.out.print("Silahkan Pilih : ");
            set = input.nextInt();

            if (set == 1) {
                System.out.println("");
                System.out.println("Perkenalkan, nama saya " + mhs.nama + ". NIM saya adalah " + mhs.nim + ".");
                System.out.println("Usia : " + mhs.umur);
                System.out.print("Nilai Akhir : " + mhs.nilaiRerata());
            } else if (set == 2) {

                input.nextLine();
                System.out.print("Nama : ");
                mhs.nama = input.nextLine();

                System.out.print("NIM : ");
                mhs.nim = input.nextLine();

                System.out.print("Umur : ");
                mhs.umur = input.nextInt();

                System.out.print("UTS : ");
                mhs.uts = input.nextInt();

                System.out.print("UAS : ");
                mhs.uas = input.nextInt();

            }
        } while (set < 3);

        input.close();

    }
}
