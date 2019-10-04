package JavaAssessment;

public class Dog extends Animal implements Pets {



    public Dog(String name) {
        super( name );

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet(){
        return "wooof youngin";


    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
