public class Enemy {
    private int xCor;
    private int yCor;
    private final Player player;

    public Enemy(int xCor, int yCor, Player player){
        this.xCor = xCor;
        this.yCor = yCor;
        this.player = player;
    }

    public boolean checkLose(){
        return player.xCor() == xCor && player.yCor() == yCor;
    }

    public void moveToPlayer(){

        if (player.xCor() > xCor){
            xCor += 1;
        }
        else if (player.xCor() < xCor){
            xCor -= 1;
        }

        if (player.yCor() > yCor){
            yCor += 1;
        }
        else if (player.yCor() < yCor){
            yCor -= 1;
        }
    }

    public int xCor(){
        return xCor;
    }

    public int yCor(){
        return yCor;
    }
}
