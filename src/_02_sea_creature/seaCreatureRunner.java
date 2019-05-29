package _02_sea_creature;

public class seaCreatureRunner {
public static void main(String[] args) {
SeaCreature SpongeBob = new SeaCreature("SpongeBob");
SpongeBob.eat();
SpongeBob.laugh();
SeaCreature Patrick = new SeaCreature("Patrick");
System.out.println(Patrick.getName());
Patrick.laugh();
SeaCreature Squidward = new SeaCreature("Squidward");
System.out.println(Squidward.getName());
Squidward.laugh();
}


}
