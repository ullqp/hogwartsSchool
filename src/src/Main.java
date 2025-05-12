public class Main {
    public static void main(String[] args) {

        Griffindor hermioneGranger = new Griffindor("Hermione","Granger", 54, 75, 76, 34,
                87);
        Griffindor harryPotter = new Griffindor("Harry", "Potter", 87, 65, 45, 65,
                75);
        Griffindor ronWeasley = new Griffindor("Ron",  "Weasley", 87, 24,
                65, 39, 40);


        Slytherin dracoMalfoy = new Slytherin(
                "Draco",  "Malfoy",
                85, 70, 90, 80, 95, 85, 75
        );
        Slytherin grahamMontague = new Slytherin(
                "Graham", "Montague", 75, 60, 80, 75, 85,
                70,
                80
        );
        Slytherin gregoryGoyle = new Slytherin(
                "Gregory", "Goyle",
                70, 50, 60, 85, 70, 60, 90
        );


        Hufflepuff zachariasSmith = new Hufflepuff(
                "Zacharias", "Smith", 78, 62, 85, 70, 75
        );
        Hufflepuff cedricDiggory = new Hufflepuff(
                "Cedric", "Diggory", 92, 88, 90, 95, 93
        );
        Hufflepuff justinFinchFletchley = new Hufflepuff(
                "Justin", "Finch-Fletchley", 75, 65, 80, 85, 88
        );


        Ravenclaw choChang = new Ravenclaw(
                "Cho", "Chang", 82, 75, 88, 85, 80, 83
        );
        Ravenclaw padmaPatil = new Ravenclaw(
                "Padma", "Patil", 85, 70, 90, 87, 82, 85
        );
        Ravenclaw marcusBelby = new Ravenclaw(
                "Marcus", "Belby", 78, 65, 85, 80, 75, 78
        );

        System.out.println("choChang = " + choChang);
        System.out.println("cedricDiggory = " + cedricDiggory);
        System.out.println("dracoMalfoy = " + dracoMalfoy);
        System.out.println("hermioneGranger = " + hermioneGranger);

        CompareStudents.compareGriffindors(harryPotter, hermioneGranger);
        CompareStudents.compareSlytherins(grahamMontague, dracoMalfoy);

        CompareStudents.compareStudents(harryPotter, dracoMalfoy);

    }

}