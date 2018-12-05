import java.util.List;
import java.util.Scanner;

public class MazeRunner {
    static Maze myMap = new Maze();
    public static void main(String[] args){
        Maze myMap = intro();
        int movescount = 0;
        while (!myMap.didIWin()){
        myMap = userMove(myMap);
        myMap.printMap();
        movescount++;
        movesMessage(movescount);
        if (movescount==100){
            System.out.println("Sorry, but you didn't escape in time- you lose!");
            break; }
        }
        myMap = navigatePit(myMap , namey);
        myMap.printMap();
        System.out.println("Congratulations, you made it out alive!");
        System.out.println("and you did it in " + movescount + " moves");

    }

    public static Maze intro() {

        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position: ");
        myMap.printMap();
        return myMap;
    }
    public static Maze userMove(Maze myMap){
        Scanner reader = new Scanner(System.in);
        System.out.print("Where would you like to move? (R, L, U, D): ");
        char namey = reader.next(".").charAt(0);
        while (! List.of('R' , 'L' , 'U' , 'D').contains(namey)){
            System.out.println("Please inter a valid direction!");
            System.out.print("Where would you like to move? (R, L, U, D): ");
            namey = reader.next(".").charAt(0);
        }
        if (namey == 'R' && myMap.canIMoveRight()){
            myMap.moveRight();
            return myMap;
        } else {
            System.out.println("Sorry, you’ve hit a wall");
            System.out.print("pick a new direction to move, Please! ");
            while (! List.of('L' , 'U' , 'D').contains(namey)){
                System.out.println("Please inter a valid direction!");
                System.out.print("Where would you like to move? (L, U, D): ");
                namey = reader.next(".").charAt(0);
            }
        }
            if (namey == 'L' && myMap.canIMoveLeft()){
                myMap.moveLeft();
                return myMap;
            }else {
                System.out.println("Sorry, you’ve hit a wall");
                System.out.print("pick a new direction to move, Please! ");
                while (! List.of('R' , 'U' , 'D').contains(namey)){
                    System.out.println("Please inter a valid direction!");
                    System.out.print("Where would you like to move? (R, U, D): ");
                    namey = reader.next(".").charAt(0);
                }
            }
                if (namey == 'U' && myMap.canIMoveUp()){
                    myMap.moveUp();
                    return myMap;
                }else{
                    System.out.println("Sorry, you’ve hit a wall");
                    System.out.print("pick a new direction to move, Please! ");
                    while (! List.of('L' , 'R' , 'D').contains(namey)){
                        System.out.println("Please inter a valid direction!");
                        System.out.print("Where would you like to move? (R, L, D): ");
                        namey = reader.next(".").charAt(0);
                    }
                }
                if (namey == 'D' && myMap.canIMoveDown()){
                    myMap.moveDown();
                    return myMap;
                } else {
                    System.out.println("Sorry, you’ve hit a wall");
                    System.out.print("pick a new direction to move, Please! ");
                    while (! List.of('L' , 'U' , 'R').contains(namey)){
                        System.out.println("Please inter a valid direction!");
                        System.out.print("Where would you like to move? (R, L, U): ");
                        namey = reader.next(".").charAt(0);
                    }
                }
        return myMap;
    }
    public static void movesMessage(int moves){
        if (moves==50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }
        if (moves==75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }
        if (moves==90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }
        if (moves==100){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
    }
    public static Maze navigatePit(Maze myMap , char namey){
        Scanner reader = new Scanner(System.in);
        char yeah = 'F';
        if (namey == 'R' && myMap.isThereAPit("R")){
            System.out.print("Watch out! There's a pit ahead, jump it? ");
            yeah = reader.next(".").charAt(0);
            if (yeah == 'Y'){ myMap.jumpOverPit("R");}}

        if (namey == 'L' && myMap.isThereAPit("L")){
        System.out.print("Watch out! There's a pit ahead, jump it? ");
            yeah = reader.next(".").charAt(0);
            if (yeah == 'Y'){ myMap.jumpOverPit("L");}}

        if (namey == 'U' && myMap.isThereAPit("U")){
            System.out.print("Watch out! There's a pit ahead, jump it? ");
            yeah = reader.next(".").charAt(0);
            if (yeah == 'Y'){ myMap.jumpOverPit("U");}}

        if (namey == 'D' && myMap.isThereAPit("D")){
            System.out.print("Watch out! There's a pit ahead, jump it? ");
            yeah = reader.next(".").charAt(0);
            if (yeah == 'Y'){ myMap.jumpOverPit("D");}}
        return myMap;
    }
}