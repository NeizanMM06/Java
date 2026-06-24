package Drons;

public class DroneMilitar extends Drone{
    private Arma[] armas;

    public DroneMilitar(int autonomia, double preuBase, TipusPropulsio tipusPropulsio, String model) {
        super(autonomia, preuBase, tipusPropulsio, model);
    }


    public static double calcularPreuTotal (double preu) {
        return 0;
    }

}
