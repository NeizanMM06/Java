package Drons;
import java.util.Scanner;

public class Main {
    private static EmpresaDrons gestora = new EmpresaDrons();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcio = -1;
        while (opcio != 0) {
            System.out.print(mostrarMenu());
            try {
                opcio = Integer.parseInt(sc.nextLine());
                switch (opcio) {
                    case 1:
                        carregarDades(gestora);
                        System.out.println(">> Dades carregades.");
                        break;
//                    case 2:
//                        Drone top = gestora.dronMesCar();
//                        if (top != null) top.mostrarInformacio();
//                        else System.out.println("No hi ha dades.");
//                        break;
//                    case 3:
//                        gestora.mostrarResumGeneral();
//                        break;
                    case 0:
                        System.out.println("Sortint...");
                        break;
                    default:
                        System.out.println("Opció no vàlida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introdueix un número.");
            }
        }
    }

    public static String mostrarMenu() {
        return "\n========== MENÚ SKYNET SOLUTIONS ==========\n" +
                "1. Carregar dades del sistema\n" +
                "2. Mostrar el dron més car\n" +
                "3. Llistar empreses i flota\n" +
                "0. Sortir del programa\n" +
                "Selecciona una opció: ";
    }

    public static void carregarDades(EmpresaDrons empresa) {
        Arma a1 = new Arma(TipusArma.BOMBA, 12000.0, 8.0);
        Arma a2 = new Arma(TipusArma.ANTIDRONE, 4500.0, 12.0);
        Arma a3 = new Arma(TipusArma.AMETRALLADORA, 3000.0, 2.0);
        Sensor s1 = new Sensor(TipusSensor.RADAR, 5000.0);
        Sensor s2 = new Sensor(TipusSensor.TERMIC, 2500.0);
        Sensor s3 = new Sensor(TipusSensor.OPTIC, 1500.0);
//        Comprador c1 = new Comprador("Global Defense Corp", "USA");
//        Comprador c2 = new Comprador("AeroMaps Solutions", "Alemanya");
//        c1.afegirDrone(new DroneMilitar("Titan-X", 50000.0, 2000,
//                TipusPropulsio.TURBOREACTOR, new Arma[]{a1, a2}));
//        c1.afegirDrone(new DroneMilitar("Titan-XIII", 50000.0, 3000,
//                TipusPropulsio.TURBOREACTOR, new Arma[]{a1, a2}));
//        c1.afegirDrone(new DroneMilitar("Hunter-S", 35000.0, 1500,
//                TipusPropulsio.TURBOFAN, new Arma[]{a3, a2}));
//        c1.afegirDrone(new DroneObservacio("SkyScan-PRO", 25000.0, 3000,
//                TipusPropulsio.TURBOPROP, new Sensor[]{s1, s1, s2}));
//        c2.afegirDrone(new DroneObservacio("Cloud-9", 15000.0, 1000,
//                TipusPropulsio.TURBOPROP, new Sensor[]{s3, s2, s3}));
//        c2.afegirDrone(new DroneObservacio("Horizon-X", 18000.0, 1200,
//                TipusPropulsio.TURBOFAN, new Sensor[]{s1, s2, s3}));
//        c2.afegirDrone(new DroneObservacio("Infinity-X", 18000.0, 2000,
//                TipusPropulsio.TURBOFAN, new Sensor[]{s1, s2, s3}));
//        c2.afegirDrone(new DroneMilitar("Patrol-M", 22000.0, 900,
//                TipusPropulsio.TURBOREACTOR, new Arma[]{a3, a3}));
//        empresa.afegirComprador(c1);
//        empresa.afegirComprador(c2);
    }
}

