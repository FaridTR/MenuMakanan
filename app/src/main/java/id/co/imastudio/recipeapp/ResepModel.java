package id.co.imastudio.recipeapp;

/**
 * Created by idn on 3/23/2017.
 */
public class ResepModel {
    private String namaMasakan, tipeMasakan, porsiMasakan, waktuMasakan;
    private int gambarMasakan;

    public ResepModel() {
    }

    public ResepModel(String namaMasakan, String tipeMasakan, String porsiMasakan, String waktuMasakan, int gambarMasakan) {
        this.namaMasakan = namaMasakan;
        this.tipeMasakan = tipeMasakan;
        this.porsiMasakan = porsiMasakan;
        this.waktuMasakan = waktuMasakan;
        this.gambarMasakan = gambarMasakan;
    }

    public String getNamaMasakan() {
        return namaMasakan;
    }

    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }

    public String getTipeMasakan() {
        return tipeMasakan;
    }

    public void setTipeMasakan(String tipeMasakan) {
        this.tipeMasakan = tipeMasakan;
    }

    public String getPorsiMasakan() {
        return porsiMasakan;
    }

    public void setPorsiMasakan(String porsiMasakan) {
        this.porsiMasakan = porsiMasakan;
    }

    public String getWaktuMasakan() {
        return waktuMasakan;
    }

    public void setWaktuMasakan(String waktuMasakan) {
        this.waktuMasakan = waktuMasakan;
    }

    public int getGambarMasakan() {
        return gambarMasakan;
    }

    public void setGambarMasakan(int gambarMasakan) {
        this.gambarMasakan = gambarMasakan;
    }
}
