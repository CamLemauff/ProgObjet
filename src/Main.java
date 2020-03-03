import Oracle.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tribeScanner = new Scanner(System.in);
        System.out.println("Bienvenue dans l'oracle !");
        System.out.println("A quelle tribu appartenez vous ?");
        System.out.print("Tribu 1: (1) ");
        System.out.print("Tribu 2: (2) ");
        System.out.print("Tribu 3: (3) ");
        System.out.print("Tribu 4: (4) ");

        String myTribe = tribeScanner.nextLine();

        switch(myTribe) {
            case "1":
                tribe1();
                break;
            case "2":
                tribe2();
                break;
            case "3":
                tribe3();
                break;
            case "4":
                tribe4();
                break;
            default:
                System.out.println("L'oracle n'est pas présent pour le moment !");
        }

        tribeScanner.close();
    }

    public static void tribe1() {
        Scanner wishTribe1Scanner = new Scanner(System.in);
        System.out.println("L'esprit de la nuit est là pour vous aider ! Que voulez vous ?");
        System.out.println("(1) Que l'esprit de la nuit vous donne un conseil ?");
        System.out.println("(2) Que l'esprit de la nuit attende que vous lui posiez une question et vous répondra par un conseil ?");

        String wishTribe1 = wishTribe1Scanner.nextLine();

        switch(wishTribe1) {
            case "1":
                Oracle.getInstance().getConseilInterface().ConseilAuto();
                break;
            case "2":
                System.out.println("Votre demande était: Que devons nous faire cet hiver ?");
                Oracle.getInstance().getConseilInterface().ConseilApresDemande();
                break;
            default:
                System.out.println("L'esprit de la nuit ne peut pas répondre à votre question");
        }

        wishTribe1Scanner.close();

    }

    public static void tribe2() {
        Scanner wishTribe2Scanner = new Scanner(System.in);
        System.out.println("La pythie est là pour vous aider ! Que voulez vous ?");
        System.out.println("(1) Que la pythie vous écoute ?");
        System.out.println("(2) Que la pythie vous écoute et vous donne un conseil ?");
        System.out.println("(3) Que la pythie vous écoute et fasse un miracle ?");

        String wishTribe2 = wishTribe2Scanner.nextLine();

        switch(wishTribe2) {
            case "1":
                System.out.println("Vous avez dit: 'Je suis mauvais pour faire du feu'");
                Oracle.getInstance().getEcouteInterface().EcouterSansReponse();
                break;
            case "2":
                System.out.println("Voous avez dit: 'Je veux aller chasser le mammouth'");
                Oracle.getInstance().getEcouteInterface().EcouterEtConseil();
                break;
            case "3":
                System.out.println("Vous avez dit: 'Nous avons froid !'");
                Oracle.getInstance().getEcouteInterface().EcouterEtMiracle();
                break;
            default:
                System.out.println("La pythie ne peut pas répondre à votre question");
        }

        wishTribe2Scanner.close();

    }

    public static void tribe3() {
        System.out.println("Gandalf est là pour vous aider ! Un miracle va se produire !");

        Oracle.getInstance().getMiracleInterface().FaireMiracle();
        
    }

    public static void tribe4() {
        Scanner wishTribe4Scanner = new Scanner(System.in);
        System.out.println("Odin est là pour vous aider ! Que voulez vous ?");
        System.out.println("(1) Qu'Odin vous donne un ordre ?");
        System.out.println("(2) Qu'Odin vous demande d'arrêter de faire quelque chose ?");
        System.out.println("(3) Qu'Odin crée une catastrophe ?");

        String wishTribe4 = wishTribe4Scanner.nextLine();
        
        switch(wishTribe4) {
            case "1":
                Oracle.getInstance().getOrdreInterface().DonnerUnOrdre();
                break;
            case "2":
                Oracle.getInstance().getOrdreInterface().ArreterUnOrdre();
                break;
            case "3":
                Oracle.getInstance().getOrdreInterface().CreerUneCatastrophe();
                break;
            default:
                System.out.println("Odin ne peut pas répondre à votre question");
        }

        wishTribe4Scanner.close();
    }
}