
public class Person {
private String name;
private String superpower;

public Person(String name, String superpower) {
	this.name=name;
	this.superpower=superpower;
	System.out.println(getName()+" has mad "+getSuperpower()+" skills");
}
String getName() {
	return name;
}
String getSuperpower(){
	return superpower;
}
void setName(String name) {
	this.name = name;
}
void setSuperpower(String superpower) {
	this.superpower=superpower;
}

}
