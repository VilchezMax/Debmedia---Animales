import Interfaces.Carnivoro;
import Modelos.*;





import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        elegirAnimal();

    }

    private static void elegirAnimal(){
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija animal: 1-Perro 2-Gato 3-Vaca");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                Perro p1 = new Perro();
                hablarAnimal(p1);
                comerAnimal(p1);
                System.out.println(p1.toString());
                break;

            case 2:
                Gato g1 = new Gato();
                hablarAnimal(g1);
                comerAnimal(g1);
                System.out.println(g1.toString());
                break;

            case 3:
                Vaca v1 = new Vaca();
                hablarAnimal(v1);
                comerAnimal(v1);
                System.out.println(v1.toString());
                break;
        }
    }

    private static void hablarAnimal(Animales a){
        a.hablar();
    }

    private static void comerAnimal(Animales a){
        if (a.getClass() == Perro.class || a.getClass() == Gato.class){
            ((Carnivoro) a).comerCarne();
        } else if (a.getClass() == Vaca.class){
            ((Vaca) a).comerHierba();
        }
    }
}
