import java.util.LinkedList; // Used to build the queue and history
import java.util.Queue;      // Queue is basically like a line or waiting in line
import java.util.Stack;      // Used for history last pancake on plate is the first one on top (like a stack of pancakes)

public class Ride {

 
    // Ride class variables
    String rideName; // Stores the name specific ride
    // Queue basically works like a "line" (person at front of line goes first)
    // Constructor (from sql.java)
    Queue<String> queue = new LinkedList<>();
    // Stacks basically pancakes last pancake (the one on top) is first one grabbed (used for history)
    Stack<String> history = new Stack<>();

    
    
    
    // Constructor
    // Constructor meant to run when I create new ride objectt
    // Sets ride name and saves it basically (since the rides are basically null at this point)
    public Ride(String rideName) {
        this.rideName = rideName; 
    }

  
    // Enqueue (ADDS PEOPLE TO Q)(back of line)
    // Method to join queue
    // Method that actually adds a person to back of line (joins the queue)
    public void joinQueue(String name) {
        queue.add(name); // Everytime person gets added(they are placed in back) and person in front leaves q and goes to history
        System.out.println("\n" + name + " has joined the queue for " + rideName + "!");
        System.out.println("Current queue position: " + queue.size()); // Tells you spot in line
    }


    // Dequeue (removes from queue/line/got on ride)(they go to history)
    // Method to start ride
    // process next person in line to go on ride (meaning person in front of line goes on ride, removed from queue, and gets added to history)
    public void startRide() {
        // checks if anyone is in "line" can't start if no one is in line
        if (queue.isEmpty()) {
            System.out.println("\nNo one is in the queue for " + rideName + "! The ride is empty.");
        } else {
            String rider = queue.poll(); // These 2 lines remove and return person at front of line (adds to top of history)
            history.push(rider);         // person gets added to top of history here
            System.out.println("\n" + rider + " is now riding " + rideName + "! Enjoy the ride!");
        }
    }

    
    
    
    // History method
    // Shown who has rode the ride (most recent/lastperson to ride shown first)
    public void viewHistory() {
        // Check if anyone has been on the ride
        if (history.isEmpty()) {
            System.out.println("\nNo one has ridden " + rideName + " yet!");
        } else {
            System.out.println("\n==== Ride History for " + rideName + " ====");
            // Temporary copy so actual one isn't destroyed from printing
            Stack<String> temp = new Stack<>();
            temp.addAll(history); // Gets copied into temporary stack

            int count = 1; // Counter for history
            while (!temp.isEmpty()) {
                if (count == 1) {
                    System.out.println("Most Recent: " + temp.pop()); // Gets most recent rider from stack (removes from top to get most recent)
                } else {
                    System.out.println(count + ". " + temp.pop());
                }
                count++;
            }
        }
    }

} 