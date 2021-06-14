package model;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;
import com.sun.org.apache.xerces.internal.xs.XSImplementation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        String polaTanggal = "dd-MM-yyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polaTanggal);

        //instance - pembuatan object
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630321";
        mahasiswa.nama = "GustiGilangHaifaFadillah";
        try {
            mahasiswa.tanggallahir = sdf.parse("24-02-2001");

            System.out.println("Nama \t\t\t : " + mahasiswa.nama);
            System.out.println("NPM \t\t\t : " + mahasiswa.npm);
            System.out.println("Tanggal Lahir \t : " + sdf.format(mahasiswa.tanggallahir));
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630123";
        mahasiswa2.nama = "GustiGhithaHaifaFadillah";
        try {
            mahasiswa2.tanggallahir =sdf.parse("13-05-1999");

            System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
            System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
            System.out.println("Tanggal Lahir \t : " + sdf.format(mahasiswa2.tanggallahir));
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


    }
}
