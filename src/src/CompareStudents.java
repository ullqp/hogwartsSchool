public class CompareStudents {

    public static void compareGriffindors(Griffindor student1, Griffindor student2) {
        int res1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int res2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (res1 > res2) {
            System.out.println(student1.getName() + " is a better Gryffindor than " + student2.getName());
        } else {System.out.println(student2.getName() + " is a better Gryffindor than " + student1.getName());}

    }

    public static void compareSlytherins(Slytherin student1, Slytherin student2) {
        int res1 = student1.getAmbition() + student1.getPower() + student1.getCunning() + student1.getResourcefulness() + student1.getDetermination();
        int res2 = student2.getAmbition() + student2.getPower() + student2.getCunning() + student2.getResourcefulness() + student2.getDetermination();

        if (res1 > res2) {
            System.out.println(student1.getName() + " is a better Slytherin than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is a better Slytherin than " + student1.getName());
        }
    }

    public static void compareHufflepuffs(Hufflepuff student1, Hufflepuff student2) {
        int res1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int res2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();

        if (res1 > res2) {
            System.out.println(student1.getName() + " is a better Hufflepuff than " + student2.getName());
        } else {System.out.println(student2.getName() + " is a better Hufflepuff than " + student1.getName());}

    }
    public static void compareRavenclaws(Ravenclaw student1, Ravenclaw student2) {
        int res1 = student1.getCreativity() + student1.getWitty() + student1.getWise() + student1.getSmart();
        int res2 = student2.getCreativity() + student2.getWitty() + student2.getWise() + student1.getSmart();

        if (res1 > res2) {
            System.out.println(student1.getName() + " is a better Ravenclaw than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " is a better Ravenclaw than " + student1.getName());
        }
    }
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int res1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int res2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (res1 > res2) {
            System.out.println(student1.getName() + " " + student1.getSurname()+ " has more magic power than " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname()+  " has more magic power than " + student1.getName() + " " + student1.getSurname());
        }
    }

    }
