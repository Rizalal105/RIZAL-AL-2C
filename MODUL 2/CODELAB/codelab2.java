
class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;


    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }


    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik  : " + namaPemilik);
        System.out.println("Saldo         : Rp" + saldo);
        System.out.println();
    }


    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor uang sebesar Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        System.out.println();
    }


    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan Rp" + jumlah);
        } else {
            saldo -= jumlah;
            System.out.println("Tarik uang sebesar Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        }
        System.out.println();
    }
}


class main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("201803713107", "Rizal al syahril", 750000);
        RekeningBank rekening2 = new RekeningBank("201803713119", "Rizal al syahril", 1250000);


        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();


        rekening1.setorUang(200000);
        rekening1.tarikUang(500000);

        rekening2.setorUang(500000);
        rekening2.tarikUang(750000);


        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
