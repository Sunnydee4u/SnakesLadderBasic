import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;
import java.util.Random;

public class Board {

    String[][] board = new String [10][10];
    HashMap<Integer,Integer> ladder = new HashMap<Integer, Integer>();

    public void addVal(Integer n1,Integer n2){
        this.ladder.put(n1,n2);
    }

    public void play(Player p,Board b1){
        System.out.println( p.getName()+" will thros Dice now ");
        Integer score = ThrowDice();
        System.out.println( p.getName()+" Scored "+score);
        move(p,score);
        System.out.println( p.getName()+" new position is "+ p.getPosition());

    }

    public Integer ThrowDice(){
        Random rand = new Random();
        Integer score = rand.nextInt(12);
        return score;
    }

    public void move(Player p,Integer score){
        Integer pos = p.getPosition();
        if(pos < 100 &&  (pos+score)< 101){
            pos += score;
            Set set = ladder.entrySet();
            Iterator it = set.iterator();
            while(it.hasNext()){
                Map.Entry en = (Map.Entry)it.next();
                if(pos.equals(en.getKey())){
                    pos = (Integer)en.getValue();
                    System.out.println("********************** Value Changed by " + pos);
                }
            }
            p.setPosition(pos);
        }else if (pos == 100){
            System.out.println(p.getName()+ "Won");
        }else {
            System.out.println("need less then "+score+" to win "+" Current Position is "+p.getPosition());
        }
    }
}
