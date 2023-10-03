package tasks.task3;

public class Customer {
    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void changeName(String newName){
        this.name= newName;

    }
}
