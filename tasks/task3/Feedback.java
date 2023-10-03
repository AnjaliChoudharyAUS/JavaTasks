package tasks.task3;

import tasks.task3.Customer;

public class Feedback {

        int id;
        String description;
        Customer customer;

    public Feedback(int id, String description, Customer customer) {
        this.id = id;
        this.description = description;
        this.customer = customer;
    }
}
