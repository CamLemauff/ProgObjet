package Oracle;

public class Ordre extends Service implements OrdreInterface {
    public Ordre() {

    }

    public void DonnerUnOrdre() {
        Oracle.getInstance().printConsole("L'oracle vous oblige à nettoyer sa maison !");
    }

    public void ArreterUnOrdre() {
        Oracle.getInstance().printConsole("L'oracle vous oblige à arrêter de travailler et vous oblige à partir en vacances !");
    }

    public void CreerUneCatastrophe() {
        Oracle.getInstance().printConsole("Une catastrophe est arrivée ! Une invasion de wapiti se prépare !");
    }
}