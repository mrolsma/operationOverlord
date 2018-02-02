public class Arbeidskorting {
    double arbeidsKorting;
    double grenswaardeKlasse1 = 9303.0D;
    double grenswaardeKlasse2 = 20180.0D;
    double grenswaardeKlasse3 = 32444.0D;
    double grenswaardeKlasse4 = 121972.0D;

    public Arbeidskorting() {
    }

    public double berekenarbeidsKorting(double inkomen) {
        if (inkomen <= this.grenswaardeKlasse1) {
            this.arbeidsKorting = 0.1772D * inkomen;
        }

        if (inkomen > this.grenswaardeKlasse1 && inkomen <= this.grenswaardeKlasse2) {
            this.arbeidsKorting = 165.0D + 0.28317D * (inkomen - 9309.0D);
        }

        if (inkomen > this.grenswaardeKlasse2 && inkomen <= this.grenswaardeKlasse3) {
            this.arbeidsKorting = 3223.0D;
        }

        if (inkomen > this.grenswaardeKlasse3 && inkomen <= this.grenswaardeKlasse4) {
            this.arbeidsKorting = 3223.0D - 0.036D * (inkomen - 32444.0D);
        }

        if (inkomen > this.grenswaardeKlasse4) {
            this.arbeidsKorting = 0.0D;
        }

        return this.arbeidsKorting;
    }
}

