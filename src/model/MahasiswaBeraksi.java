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
            mahasiswa.tampilkanAtribut();
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630123";
        mahasiswa2.nama = "GustiGhithaHaifaFadillah";
        try {
            mahasiswa2.tanggallahir =sdf.parse("13-05-1999");
            mahasiswa2.tampilkanAtribut();
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


    }
}
