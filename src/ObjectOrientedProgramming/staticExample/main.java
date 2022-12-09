package ObjectOrientedProgramming.staticExample;

public class main {
    public static void main(String[] args) {
        Human anuj=new Human(21,"Anuj Vaghani",10000,false);
        Human Aashrut=new Human(40,"Aashrut Vaghani",10000,true);

        System.out.println(anuj.age);
        System.out.println(Human.population);
    }
}
