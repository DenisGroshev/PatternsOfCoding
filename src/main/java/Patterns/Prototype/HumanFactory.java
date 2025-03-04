package Patterns.Prototype;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public void setPrototype(Human human){
        this.human=human;
    }

    public Human makeCopy(){
        return (Human) human.copy();
    }
}
