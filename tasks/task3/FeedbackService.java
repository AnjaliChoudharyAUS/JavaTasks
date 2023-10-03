package tasks.task3;

import tasks.task3.Customer;
import tasks.task3.Feedback;

public class FeedbackService {
    Feedback feedbackStore[] ={new Feedback(1, "My services were not fullfilled.", new Customer(101, "Anjali")),
            new Feedback(2, "Store is great.", new Customer(102, "Prasun")),
            new Feedback(3, "Cashier is rude.", new Customer(103, "Richa"))};;
    int feedbackIndex;
            Customer customerStore[]={new Customer(101, "Anjali"),
                    new Customer(102, "Prasun"),
                    new Customer(103, "Richa")};
            int customerIndex;
            void register(Customer customer){
                customerStore[customerIndex]=customer;
                customerIndex++;
            }
            void addFeedback(Feedback feedback){
                feedbackStore[feedbackIndex]=feedback;
                feedbackIndex++;
            }

}
