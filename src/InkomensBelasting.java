public class InkomensBelasting {
    double inkomensBelasting;
    double tarief1 = 0.3655D;
    double tarief2 = 0.408D;
    double tarief3 = 0.52D;
    double grenswaardeSchijf1 = 19922.0D;
    double grenswaardeSchijf2 = 67072.0D;

    public InkomensBelasting() {
    }

    public double berekenInkomensBelasting(double inkomen) {
        if (inkomen <= this.grenswaardeSchijf1) {
            this.inkomensBelasting = this.tarief1 * inkomen;
            return this.inkomensBelasting;
        } else {
            if (inkomen > this.grenswaardeSchijf1 && inkomen <= this.grenswaardeSchijf2) {
                this.inkomensBelasting = this.tarief1 * this.grenswaardeSchijf1 + (inkomen - this.grenswaardeSchijf1) * this.tarief2;
            }

            if (inkomen > this.grenswaardeSchijf2) {
                this.inkomensBelasting = this.tarief1 * this.grenswaardeSchijf1 + (this.grenswaardeSchijf2 - this.grenswaardeSchijf1) * this.tarief2 + (inkomen - this.grenswaardeSchijf2) * this.tarief3;
            }

            return this.inkomensBelasting;
        }
    }
}
