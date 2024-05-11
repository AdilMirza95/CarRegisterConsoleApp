package Bean;

public class Car {

    private String marka;
    private String model;
    private String reng;
    private String suretqut;
    private int il;

    public Car(String marka, String model, String reng, String suretqut, int il) {
        this.marka = marka;
        this.model = model;
        this.reng = reng;
        this.suretqut = suretqut;
        this.il = il;
    }

    public Car() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReng() {
        return reng;
    }

    public void setReng(String reng) {
        this.reng = reng;
    }

    public String getSuretqut() {

        if ("1".equals(suretqut)) {
            return "avtomat";
        } else if ("2".equals(suretqut)) {
            return "mexanika";
        } else {
            return "Zehmet olmasa duzgun secim edin!";
        }

    }

    public void setSuretqut(String suretqut) {
        this.suretqut = suretqut;
    }

    public int getIl() {
        return il;
    }

    public void setIl(int il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return "marka=" + marka + ", model=" + model + ", reng=" + reng + ", suretqut=" + getSuretqut() + ", il=" + il;
    }

}
