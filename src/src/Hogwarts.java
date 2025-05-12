public class Hogwarts {
    private String name;
    private String surname;

    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return name + " " + surname + ": magicPower=" + magicPower + ", transgressionDistance=" + transgressionDistance;
    }
}
