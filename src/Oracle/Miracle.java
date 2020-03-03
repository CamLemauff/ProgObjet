package Oracle;

public class Miracle extends Service implements MiracleInterface {
    public Miracle() {

    }

    public void FaireMiracle() {
        Oracle.getInstance().printConsole("Un miracle est arrivé ! Un feu apparaîtra automatiquement à chaque fois que vous allez hurler FEU !");
    }
}