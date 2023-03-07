import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamahidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamahidangan("Susu Sapi");
        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamahidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamahidangan("Air Putih");
        lunch.setKonsumsi(nasi,air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
