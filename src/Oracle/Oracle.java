package Oracle;

public class Oracle {
    private static Oracle instance = new Oracle();
    private Conseil conseil;
    private Miracle miracle;
    private Ecoute ecoute;
    private Ordre ordre;

    private Oracle() {
        conseil = new Conseil();
        miracle = new Miracle();
        ecoute = new Ecoute();
        ordre = new Ordre();
    }

    public static Oracle getInstance() {
        return instance;
    }

    public void printConsole(String m) {
        System.out.println(m);
    }

    public ConseilInterface getConseilInterface() {
        return (ConseilInterface)conseil;
    }

    public MiracleInterface getMiracleInterface() {
        return (MiracleInterface)miracle;
    }

    public EcouteInterface getEcouteInterface() {
        return (EcouteInterface)ecoute;
    }

    public OrdreInterface getOrdreInterface() {
        return (OrdreInterface) ordre;
    }
}