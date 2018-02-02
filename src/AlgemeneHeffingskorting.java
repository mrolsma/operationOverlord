public class AlgemeneHeffingskorting {
    double heffingsKorting;
    double grenswaardeSchijf1 = 19922.0D;
    double grenswaardeSchijf2 = 67072.0D;

    public AlgemeneHeffingskorting() {
    }

    public double berekenAlgemeneHeffingskorting(double inkomen) {
        if (inkomen <= this.grenswaardeSchijf1) {
            this.heffingsKorting = 2254.0D;
        }

        if (inkomen > this.grenswaardeSchijf1 && inkomen <= this.grenswaardeSchijf2) {
            this.heffingsKorting = 2254.0D - 0.04787D * (inkomen - 19.982D);
        }

        if (inkomen > this.grenswaardeSchijf2) {
            this.heffingsKorting = 0.0D;
        }

        return this.heffingsKorting;
    }
}