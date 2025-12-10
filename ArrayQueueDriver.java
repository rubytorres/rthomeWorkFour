// ArrayQueueDriver.java
// Starter file for the Queue portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runQ2_CallCenterQueue).

public class ArrayQueueDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        runQ1_PrintQueue();
        runQ2_CallCenterQueue();
        runQ3_ThemeParkRideLine();
        runQ4_CustomerServiceTickets();
        runQ5_TaskSchedulingQueue();
        runQ6_CheckoutLine();
        runQ7_MessageQueueChatApp();
        runQ8_PrintSpoolingBurst();
        runQ9_RoundRobinService();
    }

    // Q1 – Print Queue
    private static void runQ1_PrintQueue() {
        // TODO: Implement task Q1 here.
        System.out.println("----------Q1----------");
        ArrayQueue<String> documents =  new ArrayQueue<>();
        //Adding documents to queue
        documents.offer("progam.txt"); //First document added
        documents.offer("exam.pdf");
        documents.offer("review.pdf");
        documents.offer("quiz.pdf"); //Last document added

        System.out.println("Documents printed (FIFO):");
        //Polling until there are no more documents in the queue
        while (!documents.isEmpty()) {
            String doc =  documents.poll();
            System.out.println(doc);
        }


    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        System.out.println("----------Q2----------");
        //Adding caller names
        ArrayQueue<String> calls =  new ArrayQueue<>();
        calls.offer("Ruby"); //First call answered
        calls.offer("Kevin");
        calls.offer("Jose");
        calls.offer("Olivia"); //Last call answered

        System.out.println("Calls answered (FIFO):");
        //Polling calls from queue in the order they are answered
        while (!calls.isEmpty()) {
            String answered = calls.poll();
            System.out.println(answered);
        }

    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement
        System.out.println("----------Q3----------");
        ArrayQueue<String> riders =  new ArrayQueue<>();
        //Adding riders to the queue
        riders.offer("rider 1");
        riders.offer("rider 2");
        riders.offer("rider 3");
        riders.offer("rider 4");
        riders.offer("rider 5");

        System.out.println("riders boarding (FIFO):");
        //Emptying queue staring from the first rider to last rider in line
        while (!riders.isEmpty()) {
            String rider = riders.poll();
            System.out.println(rider);
        }
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        System.out.println("----------Q4----------");
        ArrayQueue<Integer> ticketNum =  new ArrayQueue<>();
        //All tickets
        ticketNum.offer(469572); //First ticket
        ticketNum.offer(928451);
        ticketNum.offer(935285);
        ticketNum.offer(108274); //Last ticket

        System.out.println("tickets handled (FIFO):");
        //Handling tickets in order (Front to rear in queue)
        while (!ticketNum.isEmpty()) {
            int ticket = ticketNum.poll();
            System.out.println(ticket);
        }
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        System.out.println("----------Q5----------");
        ArrayQueue<String> tasks = new ArrayQueue<>();
        tasks.offer("run stack");
        tasks.offer("run all lists");
        tasks.offer("run queue");
        tasks.offer("check network");

        //Processingg tasks in order
        System.out.println("Processing all tasks(FIFO):");
        while (!tasks.isEmpty()) {
            String task = tasks.poll();
            System.out.println(task);
        }
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        ArrayQueue<String> customers = new ArrayQueue<>();
        //Adding customers to queue as the line up to pay
        System.out.println("----------Q6----------");
        customers.offer("Tiana");
        customers.offer("Blake");
        customers.offer("Ray");
        customers.offer("Chris");

        System.out.println("Customers that checked out (FIFO):");
        //Polling until there are no more customers "checking out"
        while (!customers.isEmpty()) {
            String customer = customers.poll();
            System.out.println(customer);
        }
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here
        System.out.println("----------Q7----------");
        ArrayQueue<String> messagesSent = new ArrayQueue<>();
        messagesSent.offer("Hey where are you?");
        messagesSent.offer("Are you at the library?");
        messagesSent.offer("Im going to be at the dorms.");

        System.out.println("Messages sent in order:");
        //Messages will appear in the order they are sent
        while (!messagesSent.isEmpty()) {
            String message = messagesSent.poll();
            System.out.println(message);
        }
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        System.out.println("----------Q8----------");
        ArrayQueue<String> printJobs = new ArrayQueue<>();
        //Enqueueing a bunch of print jobs at once
        printJobs.offer("Quiz 1");
        printJobs.offer("Review");
        printJobs.offer("Quiz 2");
        printJobs.offer("Quiz 3");
        printJobs.offer("Reflection Essay");

        //Polling them to simulate printing (FIFO)
        System.out.println("All print jobs: ");
        while (!printJobs.isEmpty()) {
            String job = printJobs.poll();
            System.out.println(job);
        }
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        System.out.println("----------Q9----------");
        ArrayQueue<String> people = new ArrayQueue<>();
        String[] list = {"Ruby", "Kevin", "Jose", "Olivia", "Mason"};

        //Adding people to queue
        for (String s : list) {
            people.offer(s);
        }

        int rounds = 7; //We will be serving 7 times
        for(int i = 1; i <= rounds; i++){
            //Person is in need of service so we poll them from queue
            String served = people.poll();
            //After serving them, add them to queue again
            System.out.println(served + " was served.");
            //We put them at the rear of stack
            people.offer(served);
        }
    }
}
