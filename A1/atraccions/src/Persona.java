public class Persona {
    public String nom;
    public String cognom1;
    public String cognom2;
    public int edat;
    public String discapacitat;
    public String entaradaVIP;
    public String targetaC;
    public String id;
    public float preu;
    public String tipus;
    public int atraccions;
    public int espectacles;
    public int serveisVIP;

    public Persona(String id, String nom, String cognom1, String cognom2, int edat, String discapacitat, String entaradaVIP, String targetaC, String tipus, float preu, int atraccions, int espectacles, int serveisVIP) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.edat = edat;
        this.discapacitat = discapacitat;
        this.entaradaVIP = entaradaVIP;
        this.targetaC = targetaC;
        this.id = id;
        this.preu = preu;
        this.tipus = tipus;
        this.atraccions = atraccions;
        this.espectacles = espectacles;
        this.serveisVIP = serveisVIP;
    }

    public void setServeisVIP() {
        this.serveisVIP++;
    }
    public void setEspectacles() {
        this.espectacles++;
    }
    public void setAtraccions() {
        this.atraccions++;
    }

    public String getId() {
        return id;
    }
    public float getPreu() {
        return preu;
    }

    public String getTipus() {return tipus;}
    public int getServeisVIP() {
        return serveisVIP;
    }
    public int getEspectacles() {
        return espectacles;
    }
    public int getAtraccions() {
        return atraccions;
    }

    @Override
    public String toString() {
        String separat[] = targetaC.split(" ");
        char c1 = cognom1.charAt(0), c2 = cognom2.charAt(0);
        return " -------------------------------- " + '\n' +
                "PARC D'ATRACCIONS DAMW " + '\n' +
                "nº entrada: " + "DAMW-" + id + '\n' +
                "data i hora: " + '\n' +
                "nom del visitant: " + nom + " " + c1 + ". " + c2 + ". " + '\n' +
                "edat: " + edat + " anys " + '\n' +
                "Tipus d'entrada: " + tipus + '\n' +
                "Targeta: " + "**** **** **** " + separat[3] + '\n' +
                "Preu final: " + preu + "€"+ '\n' + '\n' +
                "nº atraccions: " + atraccions + '\n' +
                "nº espectacles: " + espectacles +'\n' +
                "nº serveis VIP: " + serveisVIP +'\n' +
                "---------------------------------";
    }
}


