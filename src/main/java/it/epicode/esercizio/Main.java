package it.epicode.esercizio;

public class Main {

    public static void main(String[] args) {
        Automobile automobile = new Automobile();
        automobile.setMarca("Fiat");
        automobile.setMarca("500");
        automobile.setAnno(2021);
        automobile.setPrezzo(12000.0);

        Allestimento[] allestimenti = new Allestimento[5];

        Allestimento allestimento = new Allestimento();
        allestimento.setNome("Sport");
        allestimento.setDescrizione("Allestimento sportivo");
        allestimento.setPrezzo(1500.0);

        allestimenti[0] = allestimento;

        Allestimento allestimento1 = new Allestimento();
        allestimento1.setNome("Lusso");
        allestimento1.setDescrizione("Allestimento lusso");
        allestimento1.setPrezzo(2000.0);

        allestimenti[1] = allestimento;

    }
}
