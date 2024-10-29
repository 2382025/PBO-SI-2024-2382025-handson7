public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    void tampilkanInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("kecepatanMaks : " + kecepatanMaks);
    }

    public String getWarna(){
        return warna;
    }

    public String getMerek(){
        return merek;
    }
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    public void setWarna(){
        this.warna = warna;
    }
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
}
