public class Hufflepuff extends Hogwarts {

    int hardworking;
    int loyal;
    int honest;

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyal,  int honest) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    @Override
    public String toString() {
        return super.toString() + ", hardworking=" + getHardworking() + ", loyal=" + getLoyal() + ", honest=" + getHonest();
    }
}