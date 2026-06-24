import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Persona> usuaris = new ArrayList<>();
    static int comptador = 1;

    //inici ------------------------------
    static void main(String[] args) {
        Main program = new Main();
        program.inici();
    }
    public static void inici() {
        int opcio = -1;
        do {
            System.out.println("""
                    ---PARC D'ATRACCIONS---
                    0. SORTIR
                    1. COMPRA DE ENTRADES
                    2. US DE LA ENTRADA
                    3. ESTADISTIQUES DEL DIA
                    4. LLISTA D'USUARIS
                    -----------------------
                    Indica la opcio amb els numeros indicats
                    """);

            try {
                opcio = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException n) {
                System.err.println(n + "no pots introduir text");
            }
            menu(opcio);
        } while (opcio != 0);
    }
    public static void menu(int opcio) {
        switch (opcio) {
            case 0 -> {
                System.out.println("Has sortit del programa");
            }

            case 1 -> {
                System.out.println("---COMPRA DE ENTRADES---");
                compra();
            }

            case 2 -> {
                System.out.println("---US DE LA ENTRADA---");
                comprovar();
            }

            case 3 -> {
                System.out.println("---Estadistiques del dia---");
                recompte();
            }
            case 4 -> {
                System.out.println("---LLista d'usuaris---");
                llista();
            }

            default -> {
                System.out.println("Dada incorrecta, torna a intentar");
            }
        }
    }

    //part 1----------------------------------------------
        public static void compra () {
        String nom, c1, c2, eVIP, discapacitat, targetaC, id, tipus = "Base";
        int edad = 0;
        int espectacles = 0, atraccions = 0, serveisVIP = 0;
        float preu = 12f;
        boolean correcte = true;
            System.out.println("Indica la seguent informacio: ");

        do {
            System.out.println("nom: ");
            nom = sc.nextLine();
            correcte = tractar(nom);
        } while (!correcte);
        do {
            System.out.println("Primer cognom:");
            c1 = sc.nextLine();
            correcte = tractar(c1);
        } while (!correcte);
        do {
            System.out.println("Segon cognom: ");
            c2 = sc.nextLine();
            correcte = tractar(c2);
        } while (!correcte);
        do {
            System.out.println("edad");
            try {
                edad = Integer.parseInt(sc.nextLine());
                correcte = tractarnum(edad);
            } catch (NumberFormatException e) {
                System.err.println(e + " no pots introduir text");
                correcte = false;
            }
        } while (!correcte);
        do {
            System.out.println("DISCAPACITAT (si/no)");
            discapacitat = sc.nextLine().toLowerCase();
            correcte = tractarSN(discapacitat);
        } while (!correcte);
        do {
            System.out.println("VIP (si/no)");
            eVIP = sc.nextLine().toLowerCase();
            correcte = tractarSN(eVIP);
        } while (!correcte);

        do {
            System.out.println("TARGETA (indica els numeros sense espais)");
            targetaC = sc.nextLine();
            targetaC = tractarT(targetaC);
        } while (targetaC.length() != 19);
        id = crearid(nom, c1, c2);

        if (discapacitat.contains("s")) {
            preu = 0f;
            tipus = "gratuita";
        } else if (edad <= 12) {
            preu = 0f;
            tipus = "gratuita";
        } else if (eVIP.contains("s")) {
            preu = preu + 4f;
            tipus = "VIP";
        }
        Persona p = new Persona(id, nom, c1, c2, edad, discapacitat, eVIP, targetaC, tipus, preu, espectacles, atraccions, serveisVIP);
        usuaris.add(p);

            System.out.println("S'ha registrat la nova entrada amb el id: " + "--- " +id +" ---");
            System.out.println("Introdueix cualsevol tecla per continuar");
            sc.nextLine();
            System.out.println(p.toString());
            System.out.println("Introdueix cualsevol tecla per continuar");
            sc.nextLine();
    }
            public static boolean tractar (String text){
        boolean prova = true;
        char cursor;
        if (text.isEmpty()) prova = false;
        for (int i = 0; i < text.length(); i++) {
            cursor = text.charAt(i);
            if (Character.isDigit(cursor)) prova = false;
        }
        return prova;
    }
            public static boolean tractarnum (int num){
        boolean prova = true;
        if (num < 0 || num > 100) prova = false;
        return prova;
    }
            public static boolean tractarSN (String text){
        boolean prova = true, correcte = false;
        char cursor;
        String textAcceptat = "s,si,n,no";
        String[] separat;
        separat = textAcceptat.split(",");

        if (text.isEmpty()) prova = false;
        for (int i = 0; i < text.length(); i++) {
            cursor = text.charAt(i);
            if (Character.isDigit(cursor)) prova = false;
            for (String s : separat) {
                if (!text.equals(s)) prova = false;
                else prova = true;

                if (prova) correcte = true;
            }
        }
        return correcte;
    }
            public static String tractarT (String text) {
            String targeta = "";

            if (text.length() != 16) ;

            else for (int i = 0; i < text.length(); i++) {
                targeta += text.charAt(i);
                if (i == 3 || i == 7 || i == 11) targeta += " ";

            }
            return targeta;
        }
            public static String crearid (String n, String c1, String c2){
        String id = "";
        char cursor;
        cursor = n.charAt(0);
        id += cursor;
        cursor = c1.charAt(0);
        id += cursor;
        cursor = c2.charAt(0);
        id += cursor;
        if (comptador < 10) {
            id += "00" + comptador;
            comptador++;
        } else if (comptador >= 10 || comptador < 100) {
            id += "0" + comptador;
            comptador++;
        } else {
            id += comptador;
            comptador++;
        }

        return id;
    }
            public static void llista () {
        for (Persona persona : usuaris) {
            System.out.println(persona.toString());
        }
    }

    //part 2----------------------------------------------
    public static void comprovar() {
        String clau;
        boolean trovat = false;
        System.out.println("Introdueix el codi de la entrada: ");
        clau = sc.nextLine();

        for (int i = 0; i < usuaris.size(); i++) {
            if (usuaris.get(i).getId().equals(clau)) {
                trovat = true;
                System.out.println("entrada trovada");
                menuUS(usuaris.get(i));
            }
        }
        if (!trovat) System.out.println("entrada no trovada");

    }
        public static void menuUS(Persona persona) {
        int opcio = -1;
        do {
            System.out.println("que vols fer?");
            System.out.println("""
                    US DE LA ENTRADA
                    -------------------------
                    0. SORTIR
                    1. PUJAR A UNA ATRACCIO
                    2. VEURE UN ESPECTACLE
                    3. SERVEI VIP""");
            try {
                opcio = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException n) {
                System.err.println(n + " no pots introduir text");
            }
        switch (opcio) {
            case 0 -> {
                System.out.println("Has sortit del programa");
            }
            case 1 -> {
                System.out.println("Has pujat a una atraccio");
                persona.setAtraccions();
            }
            case 2 -> {
                System.out.println("Has vist un espectacle");
                persona.setEspectacles();
            }
            case 3 -> {
                if(persona.tipus.equals("VIP")) {
                    System.out.println("Has utilitzat un servei VIP");
                    persona.setServeisVIP();
                }
                System.out.println("amb la teva entrada no pots utilitzar quest servei");

            }
        }
        }while (opcio != 0);
    }

    //part 2----------------------------------------------
    public static void recompte(){
        int comptador = 0, recAtraccions = 0, recEspectacles = 0, recServeis = 0,
                entradesVIP = 0, entradesGr = 0, entradesNormals = 0;
        float suma = 0;
        for(Persona persona : usuaris) {
            if (persona.getTipus().equals("VIP")) entradesVIP++;
            else if (persona.getTipus().equals("gratuita")) entradesGr++;
            else entradesNormals++;

            suma += persona.getPreu();

            recAtraccions += persona.getAtraccions();
            recEspectacles += persona.getEspectacles();
            recServeis += persona.getServeisVIP();
            comptador++;
        }

        String estadistiques = (" ESTADISTIQUES PARC D'ATRACCIONS" + '\n' +
                    "--------------------------------" + '\n' +
                    "DATA Y HORA DE EXTRACCIO: " + "VARIABLE HORA" + '\n' + '\n' +
                    "ENTRADES VENUDES: " + comptador + '\n' +
                    "ENTRADES NORMALS: " + entradesNormals + '\n' +
                    "ENTRADES GRATÜITES: " + entradesGr + '\n' +
                    "ENTRADES VIP: " + entradesVIP + '\n' + '\n' +
                    "NOMBRE D'ACCESOS A ATRACCIONS: " + recAtraccions + '\n' +
                    "NOMBRE D'ACCESOS A ESPECTACLES: " + recEspectacles + '\n' +
                    "NOMBRE D'ACCESOS A SERVEIS VIP: " + recServeis + '\n' +
                    "RECAPTACIO TOTAL: " + suma + '\n' +
                    "--------------------------------");
        System.out.println(estadistiques);
    }
}
