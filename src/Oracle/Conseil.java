package Oracle;

public class Conseil extends Service implements ConseilInterface {
    public Conseil() {

    }

    public void ConseilAuto() {
        Oracle.getInstance().printConsole("La meilleure défense est l'attaque !");
    }

    public void ConseilApresDemande() {
        Oracle.getInstance().printConsole("Ramasser et entreposer du bois !");
    }
}