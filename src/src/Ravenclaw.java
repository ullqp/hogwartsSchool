public class Ravenclaw extends Hogwarts {
    int smart;
    int wise;
    int witty;
    int creativity;

    public Ravenclaw(String name, String surname, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, surname, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", smart=" + getSmart() + ", wise=" + getWise() + ", witty=" + getWitty() + ", creativity=" + getCreativity();
    }

}
