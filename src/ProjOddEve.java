public class ProjOddEve {
    public static void main(String[] args) {
        /*String a = "";
        a += "0";
        if (a == "0") {
            System.out.println("a is 0!");
        } else if (a == "1") {
            System.out.println("a is 1!");
        } else if (a == "a") {
            System.out.println("a is a!");
        } else {
            System.out.println("a is something else!");
        }
        int a = 3;
        int b = -2;
        if((a>0)&&(b>0)){
            if (a>b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if ((b<0)||(a<0)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        int a = 10;
        int b = 30;
        if (a * 2 < b) {
            a = a * 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
        }
        System.out.println(a + " " + b);
        int num = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(num + " ");
            num += num;
        }
        int c = 5;
        for (int i = 2; i <= c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Tricky!");
            }
        }*/
        int x;
        for (x = 0;  x <= 7; x += 7) {
            System.out.println("Here");
        }
        System.out.println(x);
        /*Scanner input = new Scanner(System.in);
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Hi " + name + " which do you choose? (O)dds or (E)vens? ");
        String choice = input.next();
        //string1.equals(string2)
        if (choice.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("---------------------------------------------------------------");
        System.out.print("How many \"fingers\" do you put out? ");
        int human = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " fingers");
        System.out.println("---------------------------------------------------------------");
        int sum = computer+human;
        System.out.println("userNumber + computerNumber = " + sum );
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven) {
            System.out.println("The sum of the two numbers is odd: " + sum);
            if (choice.equals("O")) {
                System.out.println("the user wins!");
            } else {
                System.out.println("the computer wins!");
            }
        } else {
            System.out.println("The sum of the two numbers is even: " + sum);
            if (choice.equals("E")) {
                System.out.println("the user wins!");
            } else {
                System.out.println("the computer wins!");
            }
        }
        System.out.println("---------------------------------------------------------------");*/
    }}
