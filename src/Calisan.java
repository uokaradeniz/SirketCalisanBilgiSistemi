public class Calisan {
    public String isim;
    private int id;
    int getId() {return id;}
    private float prim;

    //Getter ve Setter kullanımı
    float getPrim() {return prim;}
    public void setPrim(float prim) {this.prim = prim;}
    Departman departman;
    float maasMiktari, isYuku;
    //Constructor metodu
    Calisan(String newIsim, int newId, Departman newDepartman, float newMaasMiktari,float newIsYuku) {
        isim = newIsim;
        id = newId;
        departman = newDepartman;
        maasMiktari = newMaasMiktari;
        isYuku = newIsYuku;
    }
}
