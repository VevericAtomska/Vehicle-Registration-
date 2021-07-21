package sample;

public abstract class  Vozilo {
    private int kubikaza;
    private int zapreminu;
    private int godisteProizvodnje;


    public Vozilo(int kubikaza, int zapreminu, int godisteProizvodnje) {
        this.kubikaza = kubikaza;
        this.zapreminu = zapreminu;
        this.godisteProizvodnje = godisteProizvodnje;
    }
    public abstract void Registracije();

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public int getZapreminu() {
        return zapreminu;
    }

    public void setZapreminu(int zapreminu) {
        this.zapreminu = zapreminu;
    }

    public int getGodisteProizvodnje() {
        return godisteProizvodnje;
    }

    public void setGodisteProizvodnje(int godisteProizvodnje) {
        this.godisteProizvodnje = godisteProizvodnje;
    }
    public  void  ispisVozilo(){
        System.out.println(kubikaza + " " + zapreminu + " " + godisteProizvodnje);
    }
}
