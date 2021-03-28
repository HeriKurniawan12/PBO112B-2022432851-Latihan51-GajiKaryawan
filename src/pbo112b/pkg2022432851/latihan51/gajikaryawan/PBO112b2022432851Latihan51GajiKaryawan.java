


/**
 *
 * @author
 * Nama : Heri Kurniawan
 * Kelas : PBO112B
 * NIM : 2022432851
 * Deskripsi Program : Program latihan 51 menghitung gaji karyawan
 */


package pbo112b.pkg2022432851.latihan51.gajikaryawan;

import java.util.Scanner;


public class PBO112b2022432851Latihan51GajiKaryawan {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        Manager hki = new Manager();
        System.out.print("Masukan NIK : ");
        hki.setNik(scan.nextLine());
        System.out.print("Masukan Nama : ");
        hki.setNama(scan.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        hki.setGolongan(scan.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        hki.setJabatan(scan.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        hki.setKehadiran(scan.nextInt());
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK\t:"+hki.getNik());
        System.out.println("NAMA\t:"+hki.getNama());
        System.out.println("GOLONGAN:"+hki.getGolongan());
        System.out.println("JABATAN\t:"+hki.getJabatan());
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN\t:"+hki.tunjanganGolongan(hki.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t:"+hki.tunjanganJabatan(hki.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t:"+hki.tunjanganKehadiran(hki.getKehadiran()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Gaji Total\t: "+hki.gajiTotal());
    }
    
}
