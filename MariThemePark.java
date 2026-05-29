import java.util.Scanner;
public class MariThemePark {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // line reads what you type (my input)

        // Creates ride objects
        Ride bumperCars = new Ride("Bumper Cars");
        Ride ferrisWheel = new Ride("Ferris Wheel");
        Ride rollerCoaster = new Ride("Roller Coaster");
        Ride carousel = new Ride("Carousel");

        int choice = 0; 

        // Main Menu Below (Choosing the rides)
        while (choice != 5) { // Keeps looping until you choose to leave the park (option 5)
        
            
            System.out.println("\n==== MariThemePark ===="); 
            // 1-4 are ride options below (option 5 is to leave which closes program)
            System.out.println("1. I want to ride the bumper cars!");
            System.out.println("2. I want to ride the ferris wheel!");
            System.out.println("3. I want to ride the roller coaster!");
            System.out.println("4. I want to ride the carousel!");
            System.out.println("5. I want to leave!");
            System.out.print("Choose a ride: ");
            choice = scan.nextInt(); // Stores what you choose
            scan.nextLine(); // Clear leftover input buffer from nextInt so next input in the ride menu actually works

            // if you enter something outside of the given options
            if (choice > 5 || choice < 1) {
                System.out.println("Not an option! Try again!");
                continue;
            }




            // 1st Ride, Bumper Cars (Below)
            if (choice == 1) {
                int rideChoice = 0; // Stores what option you pick for the respective ride you chose
                while (rideChoice != 4) { // Will loop until you choose to go walk away (meaning leave the ride)

                    System.out.println("\n==== You towards the bumper cars ====");        // Title telling you what you did/chose
                    System.out.println("1. Join Queue");
                    System.out.println("2. Start Ride");
                    System.out.println("3. View Ride History");
                    System.out.println("4. Walk away");
                    System.out.print("Enter your choice: ");
                    rideChoice = scan.nextInt();
                    scan.nextLine(); 

                    if (rideChoice == 1) {
                        System.out.print("Tell them your name to wait in line: ");
                        String name = scan.nextLine(); // Reads name you enter
                        
                        bumperCars.joinQueue(name); // Calls the join queue method in the ride class
                    }
                    else if (rideChoice == 2) {
                        bumperCars.startRide(); // Person at front of line leaves and gets on ride
                    }
                    else if (rideChoice == 3) {
                        bumperCars.viewHistory(); // Shows who has rode so far
                    }
                    else if (rideChoice == 4) {
                        System.out.println("Walking around the park!");
                    }
                    else {
                        System.out.println("Not an option! Try again!");
                    }
                }
            }


            

            // 2nd ride, Ferris Wheel (Below)
            else if (choice == 2) {
                int rideChoice = 0;
                while (rideChoice != 4) {

                    System.out.println("\n==== You walk towards the ferris wheel ====");
                    System.out.println("1. Join Queue");
                    System.out.println("2. Start Ride");
                    System.out.println("3. View Ride History");
                    System.out.println("4. Walk away");
                    System.out.print("Enter your choice: ");
                    rideChoice = scan.nextInt();
                    scan.nextLine(); 

                    if (rideChoice == 1) {
                        System.out.print("Tell me your name to wait in line: ");
                        String name = scan.nextLine();
                        
                        ferrisWheel.joinQueue(name); // Calls join queue on the ferrisWheel object specifically
                    }
                    else if (rideChoice == 2) {
                        ferrisWheel.startRide();
                    }
                    else if (rideChoice == 3) {
                        ferrisWheel.viewHistory();
                    }
                    else if (rideChoice == 4) {
                        System.out.println("Walking around the park!");
                    }
                    else {
                        System.out.println("Not an option! Try again!");
                    }
                }
            }


           
            // 3rd ride, Roller Coaster (Below)
            else if (choice == 3) {
                int rideChoice = 0;
                while (rideChoice != 4) {

                    System.out.println("\n==== You walk towards the roller coaster ====");
                    System.out.println("1. Join Queue");
                    System.out.println("2. Start Ride");
                    System.out.println("3. View Ride History");
                    System.out.println("4. Walk away");
                    System.out.print("Enter your choice: ");
                    rideChoice = scan.nextInt();
                    scan.nextLine(); 

                    if (rideChoice == 1) {
                        System.out.print("Tell me your name to wait in line: ");
                        String name = scan.nextLine();
                        
                        rollerCoaster.joinQueue(name); 
                    }
                    else if (rideChoice == 2) {
                        rollerCoaster.startRide();
                    }
                    else if (rideChoice == 3) {
                        rollerCoaster.viewHistory();
                    }
                    else if (rideChoice == 4) {
                        System.out.println("Walking around the park!");
                    }
                    else {
                        System.out.println("Not an option! Try again!");
                    }
                }
            }


          
            // 4th ride, Carousel (Below)
            else if (choice == 4) {
                int rideChoice = 0;
                while (rideChoice != 4) {

                    System.out.println("\n==== You walk towards the carousel ====");
                    System.out.println("1. Join Queue");
                    System.out.println("2. Start Ride");
                    System.out.println("3. View Ride History");
                    System.out.println("4. Walk away");
                    System.out.print("Enter your choice: ");
                    rideChoice = scan.nextInt();
                    scan.nextLine(); 

                    if (rideChoice == 1) {
                        System.out.print("Tell me your name to wait in line: ");
                        String name = scan.nextLine();
                        
                        carousel.joinQueue(name); 
                    }
                    else if (rideChoice == 2) {
                        carousel.startRide();
                    }
                    else if (rideChoice == 3) {
                        carousel.viewHistory();
                    }
                    else if (rideChoice == 4) {
                        System.out.println("Walking around the park!");
                    }
                    else {
                        System.out.println("Not an option! Try again!");
                    }
                }
            }

            else if (choice == 5) {
                System.out.println("Thank you for visiting the MariThemePark! Have a great day!");
            }
            else {
                System.out.println("Not an option! Try again!");
            }
        }
        scan.close();
    }
}