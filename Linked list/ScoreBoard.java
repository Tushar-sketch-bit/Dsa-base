
import java.util.LinkedList;


interface inventory{
    void speak();
}

class healingItems implements inventory{
    String name;
    healingItems(String name){
        this.name=name;
    }
    public void speak(){
        System.out.println("this is a "+name+", healing item");
    }

}
class usableItems implements inventory{
    String name;
    usableItems(String name){
        this.name=name;
    }
    public void speak(){
        System.out.println("this is a "+name+" , usable item");
    }
}
class extraItems implements inventory{
    String name;
    extraItems(String name){
        this.name=name;

    }
    public void speak(){
        System.out.println("extra item is: "+name);
    }
}


class Score {
    int points;
    Score(int points){
        this.points=points;
    }
    void showScore(){
        System.out.println("Score: "+points);
    }
}
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void speak(){
        System.out.println("Name: "+name);
    }
}
class Player{
    Person person;
    Score score;
    
    Player(Person p,Score s){
        this.person=p;
        this.score=s;
    }

    void showPlayerData(){
        person.speak();
        score.showScore();
    }
}

public class ScoreBoard{
      
    public static void main(String[] args) {
     /* LinkedList<Object> mixedlist=new LinkedList<>();
        Score s1=new Score(10);
        Person p1=new Person("Ravi");
        String message="custom message";
        Integer number=42;
        mixedlist.add(p1);
        mixedlist.add(s1);
        mixedlist.add(message);
        mixedlist.add(number);

        for (Object obj :mixedlist){
            if(obj instanceof Person){
                ((Person) obj).speak();
            }
            else if(obj instanceof Score){
                ((Score) obj).showScore();
            }
            else{
                System.out.println("object: "+obj);
            }
        }
        */

        Person p1=new Person("Ravi");
        Score s1=new Score(10);

        Player firstPlayer=new Player(p1, s1);
        //firstPlayer.showPlayerData();
        LinkedList<Player> playerlist= new LinkedList<>();
        playerlist.add(firstPlayer);
        playerlist.add(new Player(new Person("tushar"),new Score(51)));
        playerlist.add(new Player(new Person("rohit"),new Score(61)));
        playerlist.add(new Player(new Person("sorav"),new Score(15)));
        playerlist.add(new Player(new Person("new player"),new Score(48)));
        
        for(Player obj : playerlist){
            obj.showPlayerData();
        }

        LinkedList<inventory> firstInventory=new LinkedList<>();
        firstInventory.add(new usableItems("ammo"));
        firstInventory.add(new usableItems("guns"));
        firstInventory.add(new healingItems("medkit"));
        firstInventory.add(new healingItems("bandage"));
        for(inventory item: firstInventory){
            item.speak();
            
        }






    }
        

    
}
