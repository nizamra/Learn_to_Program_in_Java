import java.util.*;
public class FridajauMazeRunner {

    //PART1
//let the user solve the maze

    //crete a new maze
    //create a new maze
    //have scanner and int
    static Maze myMap = new Maze();
    static Scanner input = new Scanner(System.in);
    static int moves = 0;

    public static void main(String[] args) {
        intro();
        while (!myMap.didIWin()) {
            @ @ -25, 7 + 25, 7 @@public static void main (String[]args){
            }
            //PART1
            public static void intro () {
                //welcome the user to the map
                System.out.println("Welcome to Maze Runner!");
                @ @ -58, 6 + 58, 7 @@ else if (myMap.canIMoveDown() == true && direction.equals("D")) {
                    myMap.moveDown();
                    myMap.printMap();
                }
                //hitting a wall
                else if (myMap.canIMoveDown() == false && direction.equals("D")) {
                    navigatePit("D");
                    @ @ -77, 15 + 78, 16 @@ else if (myMap.canIMoveLeft() == false && direction.equals("D")) {
                    }
                }
                //limit moves
                movesMessage(moves);
                if (moves == 100)
                    System.out.println("Sorry, but you didn't escape in time- you lose!");
                return direction;
            }
            //PART2
            public static void movesMessage ( int moves){
                //add limitation with limited steps
                public static void movesMessage ( int usermoves){
                    //messages of moves
                    if (moves == 50)
                        System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes.");
                    else if (moves == 75)
                        @ @ -105, 8 + 107, 6 @@public static void navigatePit (String direction){
                        if (choice.equals("y") || choice.equals("Y"))
                            myMap.jumpOverPit(direction);
                        myMap.printMap();
                        //myMap.isThereAPit("R") // Takes in the direction String the user entered in and returns if there is a pit ahead
                        //myMap.jumpOverPit("L") // Will jump over a pit in the direction given, skipping that space and landing 2 spaces over in the direction specified.
                    }
                }
            }
        }
    }
}