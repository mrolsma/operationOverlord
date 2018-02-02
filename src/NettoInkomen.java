import java.util.Scanner;

public class NettoInkomen {

    public NettoInkomen() {
    }
//bla die bla bla 

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("maandelijks bruto loon uit loondienst");
        double inkomen = keyboard.nextDouble() * 12.0D;
        InkomensBelasting nieuweInstance = new InkomensBelasting();
        double inkomensBelasting = nieuweInstance.berekenInkomensBelasting(inkomen);
        Arbeidskorting nieuweInstance2 = new Arbeidskorting();
        double arbeidsKorting = nieuweInstance2.berekenarbeidsKorting(inkomen);
        AlgemeneHeffingskorting nieuweInstance3 = new AlgemeneHeffingskorting();
        double heffingsKorting = nieuweInstance3.berekenAlgemeneHeffingskorting(inkomen);
        double nettoInkomen = inkomen - inkomensBelasting + arbeidsKorting + heffingsKorting;
        System.out.println("Je inkomensbelasting is " + inkomensBelasting);
        System.out.println("Je arbeidskorting is " + arbeidsKorting);
        System.out.println("Je heffingskorting is " + heffingsKorting);
        System.out.println("Je netto inkomen is " + nettoInkomen);
        System.out.println("Overige jaarlijkse netto inkomsten");
        double jaarlijkseNettoInkomsten = keyboard.nextDouble();
        System.out.println("Overige maandelijkse netto inkomsten");
        double maandelijkseNettoInkomsten = keyboard.nextDouble();
        System.out.println("Maandelijkse huisvestingskosten (hypotheek/huur incl g/w/l/)");
        double huisVestingskosten = keyboard.nextDouble();
        System.out.println("Gemeentelijke belasting(jaarlijks)");
        double gemeentelijkeBelasting = keyboard.nextDouble();
        System.out.println("Zorgverzekeringspremie");
        double zorgVerzekeringsPremie = keyboard.nextDouble();
        System.out.println("Autoverzekering");
        double autoVerzekering = keyboard.nextDouble();
        System.out.println("Overige verzekeringskosten");
        double overigeVerzekeringsKosten = keyboard.nextDouble();
        System.out.println("Telefoonrekening");
        double TelefoonRekening = keyboard.nextDouble();
        System.out.println("Internet / TV");
        double internetTV = keyboard.nextDouble();
        System.out.println("Abonnementen / goede doelen");
        double abonnementen = keyboard.nextDouble();
        System.out.println("overige maandelijkse vaste kosten");
        double overig = keyboard.nextDouble();
        double besteedbaarInkomen = nettoInkomen / 12.0D + jaarlijkseNettoInkomsten / 12.0D + maandelijkseNettoInkomsten - huisVestingskosten - gemeentelijkeBelasting / 12.0D - zorgVerzekeringsPremie - autoVerzekering - overigeVerzekeringsKosten - TelefoonRekening - internetTV - abonnementen - overig;
        System.out.println("Je maandelijkse vrij besteedbare inkomen is " + besteedbaarInkomen);
        keyboard.close();
    }
}
