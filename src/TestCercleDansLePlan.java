public class TestCercleDansLePlan {
    public static void main(String[] args) {
        Point point = new Point(4,2.5);
        CercleDansLePlan cercle1 = new CercleDansLePlan(4,point);
        CercleDansLePlan cercle2 = new CercleDansLePlan(12.5,point);
        System.out.println(cercle1.toString());
        System.out.println(cercle2.toString());

        // modif coordonnée x de l'attribut centre de "cercle2" de 4 à 8
        Point point2 = new Point(8,2.5);
        cercle2.setCentre(point2);
        System.out.println(cercle2.toString());
    }
}
