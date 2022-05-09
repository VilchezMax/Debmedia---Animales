package Modelos;

import Interfaces.Carnivoro;

public class Gato extends Animales implements Carnivoro {
    //Atributos
    private String sonido;
    private boolean hambre;

    //Constructores
    public Gato(){
        this.sonido = "miau miau";
        this.hambre = true;
    }

    public Gato(String sonido, boolean hambre) {
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
    public void comerCarne() {
        this.hambre = false;
    }
    @Override
    public String toString() {
        return "Gato: " + "\n" +
                "Hace " + sonido + "\n" +
                "Tiene hambre? " + hambre;
    }

}
