package sample;

public class Auto extends Vozilo {
    String model;
    int cena;
    int posto;
    int godina = 2021;
    public Auto(int kubikaza, int zapreminu, int godisteProizvodnje, String model) {
        super(kubikaza, zapreminu, godisteProizvodnje);
        this.model = model;

    }
    @Override
    public void Registracije(){

        posto = (godina - getGodisteProizvodnje()) *10;

     if (getKubikaza() > 2000) {
         cena = (getKubikaza() * posto * 2) / 15;

     }

      if (getKubikaza() < 2000){
         cena = (getKubikaza() * posto) /15;

     }
        ispisVozilo();
        System.out.println(model + " " + cena);
    }


}
