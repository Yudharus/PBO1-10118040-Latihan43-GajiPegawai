/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan43.gajipegawai;

/**
 *
 * @author asus
 * * NAMA  : Moch Yudha Rusdian
 * KELAS : IF 1
 * NIM   : 10118040
 * Deskripsi Program : Program ini untuk menampilkan output Gaji pegawai.
 */
public class PBO110118040Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        GajiPegawai karyawan1 = new GajiPegawai();
        karyawan1.setNama("Moch Yudha Rusdian");
        karyawan1.setAlamat("GBA 2");
        karyawan1.setUangTransport(250000);
        karyawan1.setUangTunjangan(300000);
        karyawan1.setGajiPokok(4500000);
        karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan()
                ,karyawan1.getUangTransport(),karyawan1.getGajiPokok()));
        karyawan1.tampilData(karyawan1.getNama(),karyawan1.getAlamat(),
                karyawan1.getUangTunjangan(),karyawan1.getUangTransport()
                ,karyawan1.getGajiPokok(),karyawan1.getTotalGaji());
        
    }
    
}
    
    

