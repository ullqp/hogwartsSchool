public class Griffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

    public Griffindor(String name, String surname, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", nobility=" + getNobility() + ", honor=" + getHonor() + ", bravery=" + getBravery();
    }


}
