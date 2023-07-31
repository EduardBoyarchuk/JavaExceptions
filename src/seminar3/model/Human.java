package seminar3.model;

public class Human {
    private String familiya;
    private String imya;
    private String otchestvo;
    private  String dataRogdeniya;
    private String nomerTelefona;
    private String pol;

    public Human(String familiya, String imya, String otchestvo, String dataRogdeniya, String nomerTelefona, String pol) {
        this.familiya = familiya;
        this.imya = imya;
        this.otchestvo = otchestvo;
        this.dataRogdeniya = dataRogdeniya;
        this.nomerTelefona = nomerTelefona;
        this.pol = pol;
    }
    public Human(){
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getImya() {
        return imya;
    }

    public void setImya(String imya) {
        this.imya = imya;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getDataRogdeniya() {
        return dataRogdeniya;
    }

    public void setDataRogdeniya(String dataRogdeniya) {
        this.dataRogdeniya = dataRogdeniya;
    }

    public String getNomerTelefona() {
        return nomerTelefona;
    }

    public void setNomerTelefona(String nomerTelefona) {
        this.nomerTelefona = nomerTelefona;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }
}

