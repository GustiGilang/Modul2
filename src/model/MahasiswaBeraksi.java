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
        mahasiswa.setNpm("19630321");
        mahasiswa.setNama("GustiGilangHaifaFadillah");
        try {
            mahasiswa.setTanggallahir(sdf.parse("24-02-2001"));
            mahasiswa.tampilkanAtribut();
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19630123");
        mahasiswa2.setNama("GustiGhithaHaifaFadillah");
        try {
            mahasiswa2.setTanggallahir(sdf.parse("13-05-1999"));
            mahasiswa2.tampilkanAtribut();
        } catch (ParseException e) {
            System.err.println("Format tanggal tidak sesuai");
        }


    }
}
