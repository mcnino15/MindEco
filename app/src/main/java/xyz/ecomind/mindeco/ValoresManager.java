package xyz.ecomind.mindeco;

public class ValoresManager {
    private static ValoresManager instance;
    private double pet;
    private double pebd;
    private double pead;
    private double bopp;
    private double carton;
    private double vidrio;
    private double lataAl;
    private double lataHj;
    private ValoresManager() {
        // Constructor privado para evitar instanciación directa
    }
    public static ValoresManager getInstance() {
        if (instance == null) {
            instance = new ValoresManager();
        }
        return instance;
    }

    public double getPet() {
        return pet;
    }

    public void setPet(double pet) {
        this.pet = pet;
    }

    public double getPebd() {
        return pebd;
    }

    public void setPebd(double pebd) {
        this.pebd = pebd;
    }

    public double getPead() {
        return pead;
    }

    public void setPead(double pead) {
        this.pead = pead;
    }

    public double getBopp() {
        return bopp;
    }

    public void setBopp(double bopp) {
        this.bopp = bopp;
    }

    public double getCarton() {
        return carton;
    }

    public void setCarton(double carton) {
        this.carton = carton;
    }

    public double getVidrio() {
        return vidrio;
    }

    public void setVidrio(double vidrio) {
        this.vidrio = vidrio;
    }

    public double getLataAl() {
        return lataAl;
    }

    public void setLataAl(double lataAl) {
        this.lataAl = lataAl;
    }

    public double getLataHJ() {
        return lataHj;
    }

    public void setLataHJ(double lataHj) {
        this.lataHj = lataHj;
    }
}
