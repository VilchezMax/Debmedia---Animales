package Modelos;

import Interfaces.Herbivoro;

public class Vaca extends Animales implements Herbivoro {
    //Atributos
    private String sonido;
    private boolean hambre;

    //Constructores
    public Vaca() {
        this.sonido = "Ruido_de_vaca.mp3";
        this.hambre = true;
    }

    public Vaca(String sonido, boolean hambre) {
        this.sonido = sonido;
        this.hambre = hambre;
    }

    //Setters & Getters

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public boolean isHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }
//Metodos


    @Override
    public void hablar() {
       System.out.println(this.sonido);
    }

    @Override
    public void comerHierba() {
        this.hambre = false;
    }

    @Override
    public String toString() {
        return "Vaca: " + "\n" +
                "Hace " + sonido + "\n" +
                "Tiene hambre? " + hambre;
    }
}
