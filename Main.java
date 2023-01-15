import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randX = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        int randY = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        boolean gameLoop = true;
        Player player = new Player(0,0);
        Goal goal = new Goal(randX,randY," W ",player);
        Map map = new Map(15,15,player,goal);
        System.out.println(map.generateMap());
        while(gameLoop){
            String input = in.nextLine();
            switch (input) {
                case "-1" -> gameLoop = false;
                case "w" -> player.moveUp();
                case "a" -> player.moveLeft();
                case "s" -> player.moveDown();
                case "d" -> player.moveRight();
            }
            if (goal.checkWin()){
                System.out.println("You win!");
                gameLoop = false;
            }
            System.out.println(map.generateMap());
        }
    }
}
