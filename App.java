public class App {

    public static void main( String [] args){

        Board b1 = new Board();

        //ladder
        b1.addVal(2,10);
        b1.addVal(11,99);
        b1.addVal(5,41);
        b1.addVal(70,91);
        b1.addVal(21,77);

        //Snakes
        b1.addVal(87,34);
        b1.addVal(97,69);
        b1.addVal(79,9);
        b1.addVal(61,12);
        b1.addVal(45,5);

        //Players
        Player p1 = new Player();
        Player p2 = new Player();
        p1.setName("John");
        p2.setName("Shawn");

        while(p1.getPosition() < 100 && p2.getPosition() < 100) {
            b1.play(p1,b1);
            b1.play(p2,b1);
        }
    }
}
