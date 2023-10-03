package tasks.task3;

public class CustomerFeedbackDriver {


        public static void main(String[] args) {

            FeedbackService feedbackService = new FeedbackService();

            feedbackService.registerCustomer(new Customer(1,"Anjali"));
            feedbackService.registerCustomer(new Customer(2,"Prasun"));
            feedbackService.registerCustomer(new Customer(3,"Richa"));
            feedbackService.registerCustomer(new Customer(4,"Kanchan"));
            feedbackService.registerCustomer(new Customer(5,"Shivam"));

            //feedbackService.addFeedback(new Feedback(1,"Excellent",new Customer(1,"Anjali")));
            feedbackService.addFeedback(new Feedback(1,"Excellent",feedbackService.customers[0]));
            feedbackService.addFeedback(new Feedback(2,"Very Good",feedbackService.customers[1]));
            feedbackService.addFeedback(new Feedback(3,"Good",feedbackService.customers[2]));
            feedbackService.addFeedback(new Feedback(4,"Average",feedbackService.customers[3]));
            feedbackService.addFeedback(new Feedback(5,"Below Average",feedbackService.customers[4]));

            Feedback feedback = feedbackService.fetchFeedbackByCustomerId(3);
            System.out.println(feedback.getCustomer().getName());
            System.out.println(feedback.getDescription());
            feedbackService.displayCustomer(feedbackService.customers);
            feedbackService.displayFeedBack(feedbackService.feedbacks);









    }
}
