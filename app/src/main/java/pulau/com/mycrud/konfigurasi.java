package pulau.com.mycrud;
public class konfigurasi {
    public static final String URL_ADD="http://192.168.2.114/Android/uasdani/tambahsiswa.php";
    public static final String URL_GET_ALL = "http://192.168.2.114/Android/uasdani/tampilsemuasiswa.php";
    public static final String URL_GET_EMP = "http://192.168.2.114/Android/uasdani/tampilsiswa.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.2.114/Android/uasdani/updatesiswa.php";
    public static final String URL_DELETE_EMP = "http://192.168.2.114/Android/uasdani/hapussiswa.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_KELAS = "kelas";
    public static final String KEY_EMP_NOHP = "nohp";
    public static final String KEY_EMP_ALAMAT = "alamat";
    public static final String KEY_EMP_CITACITA = "citacita";


    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_KELAS = "kelas";
    public static final String TAG_NOHP = "nohp";
    public static final String TAG_ALAMAT = "alamat";
    public static final String TAG_CITACITA = "citacita";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
