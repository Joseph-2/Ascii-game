import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean gameLoop = true;
        Player player = new Player(0,0);
        Map map = new Map(15,15,player);
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
            System.out.println(map.generateMap());
        }
    }
}
