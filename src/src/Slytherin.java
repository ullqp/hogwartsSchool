public class Slytherin extends Hogwarts {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int power;

    public Slytherin(String name, String surname, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + ", cunning=" + getCunning() + ", determination=" + getDetermination()
                + ", ambition=" + getAmbition() + ", resourcefulness=" + getResourcefulness() + ", power=" + getPower() ;
    }


}
