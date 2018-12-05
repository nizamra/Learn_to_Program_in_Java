import java.util.Scanner;
//import java.lang.Math;

public class TripAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Greeting();
        //TimeBudget();
        //TimeDifference();
        //CountryArea();
        //HackerProblem();
        //haversine(36.12, -86.67, 33.94, -118.40);
        /*int x = 10;
        int y = 5;
        int z = x + y;
        x = z - y;
        y = x + z;
        z = 2 * z;
        System.out.println("x " + x + "y " + y + "z " + z);*/
        /*String myStringVar = "Good Morning";
        String mySecondVar = "I love CS";
        myStringVar = mySecondVar;
        System.out.println(myStringVar);*/
        //Some String operations:
        //name.equals("John Doe")
        //name.equalsIgnoreCase("john doe")
        //name.startsWith("Joh")
        //name.endsWith("Doe")
        //name.contains(" ")
        System.out.print("What is the temperature? ");
        int temperature = input.nextInt();
        if (temperature > 70) {
            System.out.println("No coat required");
        } else if (temperature > 50) {
            System.out.println("Wear a jacket");
        } else if (temperature > 20) {
            System.out.println("Wear a warm coat");
        } else {
            System.out.println("Stay inside!");
        }
        for (int n = 2; n <= 6; n++) {
            System.out.println(n + " squared = " + (n * n));
        }
        for (int i=1; i<=3; i++) {
            System.out.println("+---+---+---+");
            System.out.println("|---|---|---|");
        }
        System.out.println("+---+---+---+");
        System.out.println();
        System.out.println(" ");
        for (int i=1; i<=4; i++) {
            System.out.println("+---+---+---+");
            if (i < 4) {
                System.out.println("|---|---|---|");
            }
        }

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == col) {
                    System.out.println("1 ");
                } else {
                    System.out.println("0 ");
                }
                System.out.println();
            }
        }

        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number or 0 to get the sum: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);

    }}
/*
    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Where would you like to go? ");
        String Dist = input.nextLine();
        System.out.println("Great! " + Dist + " sounds like a great trip");
    }

    public static void TimeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend in the destination? ");
        int days = input.nextInt();
        System.out.print("What is your total budget for the trip in USD? ");
        double budget = input.nextDouble();
        System.out.print("What is the currency symbol for the destination? ");
        String something = input.next();
        System.out.print("What is the conversion rate between 1 USD to the destination's currency? ");
        double convect = input.nextDouble();
        System.out.println("Time you are going to spend in the destination: " + days + " days");
        System.out.println("Your budget in USD for the whole trip is: "+ budget+" and you can spend around "+ budget/days+" in USD per day");
        System.out.println("Your budget in destination’s currency for the whole trip is: "+ budget * convect +" and you can spend around "+ (budget * convect) / days + something +" per day");
    }
    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hint If the destination time zone is “behind” your home time zone you should enter a negative number.");
        System.out.print("What is the time difference between your home and where you are going? ");
        double timed = input.nextDouble();
        System.out.println("The time will be "+(24.00+timed)% 24+" in the destination when it is midnight at home \n and when it is noon at home: "+(12.00+timed)% 24);
    }
    public static void CountryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of their travel destination country in km^2? ");
        double area = input.nextDouble();
        System.out.println("the area of the country in miles^2 is: " + area * 0.62137 );
    }
    public static void HackerProblem() {
        Scanner input = new Scanner(System.in);
        System.out.println("First I need your coordination's");
        System.out.print("Provide home's longitudes please");
        double lambda1 = input.nextDouble();
        System.out.print("Provide home's latitudes please");
        double phi1 = input.nextDouble();
        System.out.println("second I need your destination coordination's");
        System.out.print("Provide destination's longitudes please");
        double lambda2 = input.nextDouble();
        System.out.print("Provide destination's latitudes please");
        double phi2 = input.nextDouble();
        // the real math
        double lambda = Math.toRadians(lambda2 - lambda1);
        double phi = Math.toRadians(phi2 - phi1);
        phi1 = Math.toRadians(phi1);
        phi2 = Math.toRadians(phi2);
        double x = Math.pow(Math.sin(lambda / 2),2) + Math.pow(Math.sin(phi / 2),2) * Math.cos(phi1) * Math.cos(phi2);
        double c = 2 * Math.asin(Math.sqrt(x));
        double d = 6371.3 * c;
        System.out.println("the distance between home and destination is: " + d );
    }}*/

    //https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
    //public static final double R = 6372.8; // In kilometers
    //public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        //double dLat = Math.toRadians(lat2 - lat1);
        //double dLon = Math.toRadians(lon2 - lon1);
        //lat1 = Math.toRadians(lat1);
        //lat2 = Math.toRadians(lat2);
        //double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        //double c = 2 * Math.asin(Math.sqrt(a));
        //return R * c;}


        //Part 5 – Round
        //First * 100
        //(int) answerFromOne
        //answerFromTwo / 100.0