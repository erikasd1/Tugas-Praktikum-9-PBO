package AplikasiPenentuJumlahHari;

public class hitungHari {
    public int hitung(int tahun, String bulan){
        int jumlahHari = 0;
        
        switch(bulan){
            case "Januari":
            case "Maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                jumlahHari = 31;
                break;
            case "Februari":
                if(((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0))
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                jumlahHari = 30;
                break;
            default:
                jumlahHari = 0;
                break;
        }
        return jumlahHari;
    }
}
