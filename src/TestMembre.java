public class TestMembre {
    public static void main(String[] args) {
        Membre membre2 = new Membre("Leconte","Emeline","0475641287");
        Membre membre1 = new Membre("Cambron","Isabelle","0485693541");

        System.out.println(membre1.initialiserParrain(membre1));
        System.out.println(membre1.getParrain());
        System.out.println(membre2.initialiserParrain(membre1));
        System.out.println(membre2);
        Membre membre3 = new Membre("Baroni","Raphael","0476358456");
        System.out.println(membre2.initialiserParrain(membre3));
        System.out.println(membre2);


    }
}