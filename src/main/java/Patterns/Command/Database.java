package Patterns.Command;

public class Database {
    public void insert(){
        System.out.println("Insert in record...");
    }
    public void update(){
        System.out.println("Updating");
    }
    public void select(){
        System.out.println("Reading record...");
    }
    public void delete(){
        System.out.println("Deleting record...");
    }
}
