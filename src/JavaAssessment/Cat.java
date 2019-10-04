package JavaAssessment;

public class Cat extends Feline implements Pets {



    public Cat(String name) {
        super( name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String greet(){
        return "moew youngin";

    }



}
