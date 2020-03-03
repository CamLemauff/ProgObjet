package Oracle;

public class Ecoute extends Service implements EcouteInterface {
    public Ecoute() {

    }

    public void EcouterSansReponse() {
        Oracle.getInstance().printConsole("La pythie reste silencieuse...");
    }

    public void EcouterEtConseil() {
        Oracle.getInstance().printConsole("Allez sur les grandes plaines au-delà des collines !");
    }

    public void EcouterEtMiracle() {
        Oracle.getInstance().printConsole("L'oracle vous a entendu ! Le printemps arrive avec deux mois d'avance !");
    }
}