package siswa;

public class KaryawanTester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Karyawan Azam = new Karyawan(22,"Azam","Kurikulum","Malang");
        Karyawan Ibra = new Karyawan(29,"Ibra","Kesiswaan","Lamongan");
        Karyawan Bintang = new Karyawan(25,"Bintang","Kurikulum","Tulungagung");
        Karyawan Kinza = new Karyawan(15,"Kinza","TU","Bondowoso");
        Karyawan Gilam = new Karyawan(19,"Gilam","TU","Papua");

        Azam.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        Bintang.print();
        System.out.println();
        Kinza.print();
        System.out.println();
        Gilam.print();


    }
    
}
