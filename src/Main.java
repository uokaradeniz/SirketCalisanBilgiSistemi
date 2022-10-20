public class Main {
    public static void main(String[] args) {
        //final = constant
        final float primKatsayisi = 3.56f;
        //Constructor metot kullanarak obje oluşturma
        Calisan calisan1 = new Calisan("Oğuz", 13245356, Departman.Arge, 20500,90);
        Calisan calisan2 = new Calisan("Ahmet", 23165089, Departman.Yönetim, 31000, 100);
        Calisan calisan3 = new Calisan("Mehmet", 36929605, Departman.Finans, 15650, 55);
        //Array ve for döngüsü kullanarak otonom işlem yapma
        Calisan calisanListesi[] = {calisan1, calisan2, calisan3};
        for (var calisan:calisanListesi) {
            calisan.setPrim(calisan.isYuku*primKatsayisi);
            var toplamMaas = calisan.getPrim() + calisan.maasMiktari;
            System.out.println("Çalışan bilgileri\n" + "İsim: " + calisan.isim + "\nKimlik: " + calisan.getId() + "\nDepartman: " + calisan.departman + "\nMaaş: " + toplamMaas+" TL\n");
        }
    }
}