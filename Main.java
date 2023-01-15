import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class Main {
    public static void main(String[] args) {
        int gRandX = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        int gRandY = ThreadLocalRandom.current().nextInt(-5, 5 + 1);

        int eRandX = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        int eRandY = ThreadLocalRandom.current().nextInt(-5, 5 + 1);

        boolean gameLoop = true;

        Scanner in = new Scanner(System.in);
        Player player = new Player(0,0);
        Goal goal = new Goal(gRandX,gRandY," W ",player);
        Enemy enemy = new Enemy(eRandX,eRandY,player);
        Map map = new Map(15,15,player,goal,enemy);
        System.out.println(map.generateMap());

        while(gameLoop){
            String input = in.nextLine();
            switch (input) {
                case "-1" -> gameLoop = false;
                case "w" -> player.moveUp();
                case "a" -> player.moveLeft();
                case "s" -> player.moveDown();
                case "d" -> player.moveRight();
                case "wa" ->{
                    player.moveUp();
                    player.moveLeft();
                }
                case "wd" ->{
                    player.moveUp();
                    player.moveRight();
                }
                case "sa" ->{
                    player.moveDown();
                    player.moveLeft();
                }
                case "sd" ->{
                    player.moveDown();
                    player.moveRight();
                }
            }
            enemy.moveToPlayer();
            if (enemy.checkLose()){
                System.out.println("You Lose!");
                gameLoop = false;
            }
            else if (goal.checkWin()){
                System.out.println("You win!");
                gameLoop = false;
            }
            System.out.println(map.generateMap());
        }
    }
}
