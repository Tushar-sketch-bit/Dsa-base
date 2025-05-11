import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

interface flyable{
    void fly();
   
}

interface walkable{
   abstract void walk();
}

interface soundable{
   void makeSound(String sound);
}

interface crawlable{
    void crawl();
}

abstract class Animal<T> implements soundable{
    String name;
    T otherFeature;
    Animal(String name, T feature){
        this.name=name;
        this.otherFeature=feature;
    }
    abstract void specificFeatures();
    abstract void describe();
@Override
    public void makeSound(String sound){
        System.out.println(name+" : "+sound);
    }
}

abstract class birds<T> extends Animal<T> implements flyable{
    birds(String name,T otherFeature){
        super(name, otherFeature);
    }
@Override
    public void fly(){
        System.out.println(name+" is flying");
    }
@Override
   public void specificFeatures(){
    System.out.println(name+" has "+otherFeature+" as extra feature");
   }
@Override
   public void describe(){
    System.out.println("this is :"+name+ " with "+otherFeature);
   }
}

class sparrow extends birds<Object>{
    sparrow(String name, Object otherFeature){
        super(name,otherFeature);
    }
    public void describe(){
        System.out.println("this sparrow name is: "+name+" has "+otherFeature);
    }
}

class pegion extends birds<Object>{
    pegion(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this pegion name is: "+name+" has "+otherFeature);
    }
}

class parrot extends birds<Object>{
    parrot(String name, Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this parrot is: "+name+" has "+otherFeature);
    }
}

class penguin extends birds<Object>{
    penguin(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this penguin is: "+name+" has "+otherFeature);
    }
}

class Eagle extends birds<Object>{
Eagle(String name,Object otherFeature){
    super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this Eagle is: "+name+" has "+otherFeature);
    }
}

class Toucan extends birds<Object>{
    Toucan(String name,Object otherFeature){
        super(name, otherFeature);
    }
}

abstract class Mammals<T> extends Animal<T> implements walkable{
 Mammals(String name,T otherFeature){
    super(name,otherFeature);
 }
@Override
 public void specificFeatures(){
    System.out.println("your "+name+" has "+otherFeature);
}
@Override
 public void walk(){
    System.out.println("your "+name+" is walking");
}
@Override
 public void describe(){
    System.out.println("this is "+name+" has "+otherFeature);
}
}

class Tiger extends Mammals<Object>{
Tiger(String name, Object otherFeature){
    super(name,otherFeature);
    }
    public void describe(){
        System.out.println("this Tiger is: "+name+" has "+otherFeature);
    }
}

class Lion extends Mammals<Object>{
    Lion(String name, Object otherFeature){
        super(name,otherFeature);
    }
    public void describe(){
        System.out.println("this Lion is: "+ name+ " has "+otherFeature);
    }
}

class cheetah extends Mammals<Object>{
    cheetah(String name,Object otherFeature){
        super(name,otherFeature);
    }
    public void describe(){
        System.out.println("this cheetah is: "+name+" has "+otherFeature);
    }
}

class elephant extends Mammals<Object>{
    elephant(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this elephant is: "+name+" has "+otherFeature);
    }

}

abstract class Reptiles<T> extends Animal<T> implements crawlable{
    Reptiles(String name,T otherFeature){
        super(name, otherFeature);
    }
    @Override
    public void crawl(){
        System.out.println("your "+name+" is crawling on wall");
    }
    @Override
    public void specificFeatures(){
        System.out.println("your "+name+" has "+otherFeature);
    }
    @Override
    public void describe(){
        System.out.println("this is "+name+" has "+otherFeature);
    }
}

class Lizard extends Reptiles<Object>{
    Lizard(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this Lizard is: "+name+" has "+otherFeature);
    }
}

class Snake extends Reptiles<Object>{
    Snake(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this Snake is: "+name+" has "+otherFeature);
    }
}

class Crocodile extends Reptiles<Object>{
    Crocodile(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this Crocodile is: "+name+" has "+otherFeature);
    }
}

class Alligator extends Reptiles<Object>{
    Alligator(String name,Object otherFeature){
        super(name, otherFeature);
    }
    public void describe(){
        System.out.println("this Alligator is: "+ name+ " has "+otherFeature);
    }
}

enum AnimalType{
    BIRD,MAMMAL,REPTILE
}

class ZooManager{
Map<AnimalType, LinkedList<Animal<?>>> zooMap;
ZooManager(){
    zooMap=new HashMap<>();
    for(AnimalType type : AnimalType.values()){
        zooMap.put(type, new LinkedList<>());
    }
  }
  void addAnimal(AnimalType type,Animal<?> animal){
    zooMap.get(type).add(animal);
  }
  void removeAnimal(AnimalType type, Animal<?> animal){
    zooMap.get(type).remove(animal);
  }
  int countAnimals(AnimalType type){
    return zooMap.get(type).size();
  }
  void describeZoo(){
    for(AnimalType type : zooMap.keySet()){
        System.out.println("["+type+"]");
        for(Animal<?> a : zooMap.get(type)){
            a.describe();
        }
    }
  }

}


public class Zoo {
    public static void main(String[] args) {

        ZooManager chowkidar=new ZooManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("what you want to do ?");
        System.out.println("1.ADD an animal : press '1' ");
        System.out.println("2.Remove animal : press '2' ");
        System.out.println("3.Get the knowledge of zoo : press '3' ");
        int switcher=sc.nextInt();

        switch (switcher) {
            case 1:
                System.out.println("Enter the animal type that you want to -> (BIRD,MAMMAL,REPTILES): ");
        String typeInput=sc.nextLine().toUpperCase();
        AnimalType type= AnimalType.valueOf(typeInput);

        if(type.equals(AnimalType.BIRD)){
            System.out.println("which bird? -> sparrow,penguin,pegion,eagle,toucan,parrot: ");
            String birdType=sc.nextLine();
            System.out.println("Name for your bird: ");
            String name=sc.nextLine();
            System.out.println("One feature of your "+birdType+" named "+name+": ");
            String feature=sc.nextLine();
            
            Animal<?> bird=switch(birdType.toLowerCase()){
                case "sparrow" -> new sparrow(name, feature);
                case "penguin" -> new penguin(name, feature);
                case "pegion"  -> new pegion(name, feature);
                case "eagle"   -> new Eagle(name, feature);
                case "toucan"  -> new Toucan(name, feature);
                case "parrot"  -> new parrot(name, feature);
                default -> null;
            };
         if(bird!=null)chowkidar.addAnimal(AnimalType.BIRD, bird);
        }
        else if(type.equals(AnimalType.MAMMAL)){
            System.out.println("which mammal? -> lion,tiger,cheetah,elephant: ");
            String mammalType=sc.nextLine();
            System.out.println("name for your "+mammalType+": ");
            String name=sc.nextLine();
            System.out.println("feature for your "+mammalType+" named "+name+": ");
            String feature=sc.nextLine();

            Animal<?> mammal=switch(mammalType.toLowerCase()){
                case "lion" -> new Lion(name, feature);
                case "tiger" -> new Tiger(name, feature);
                case "cheetah" -> new cheetah(name,feature);
                case "elephant" -> new elephant(name, feature);
                default -> null;
            };
            if(mammal!=null)chowkidar.addAnimal(type, mammal);
        }
        else if(type.equals(AnimalType.REPTILE)){
            System.out.println("which Reptile? -> Lizard,Snake,Crocodile,Alligator");
            String reptileType=sc.nextLine();
            System.out.println("Name for your "+reptileType+": ");
            String name=sc.nextLine();
            System.out.println("feature for your "+reptileType+" named "+name+": ");
            String feature=sc.nextLine();

            Animal<?> reptile=switch(reptileType.toLowerCase()){
                case "Lizard" -> new Lizard(name, feature);
                case "Snake" -> new Snake(name, feature);
                case "Crocodile" -> new Crocodile(name, feature);
                case "Alligator" -> new Alligator(name, feature);
                default -> null;
            };
           if(reptile!=null)chowkidar.addAnimal(type, reptile);
        }
        else{
            System.out.println("type you entered does not match");
        }
      break;
            case 3:
             chowkidar.describeZoo();
             break;
            default:
              break;
        }
        
        sc.close();
        





    }
}
