public class Goal {
    private final int xCor;
    private final int yCor;

    private final String symbol;
    private final Player player;

    public Goal(int xCor, int yCor, String symbol,Player player){
        this.xCor = xCor;
        this.yCor = yCor;
        this.symbol = symbol;
        this.player = player;
    }

    public boolean checkWin(){
        return player.xCor() == xCor && player.yCor() == yCor;
    }

    public int xCor(){
        return xCor;
    }

    public int yCor(){
        return yCor;
    }

    public String symbol(){
        return symbol;
    }
}
