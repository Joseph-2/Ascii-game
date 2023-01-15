class Player{
    private int xCor;
    private int yCor;

    public Player(int xCor,int yCor){
        this.xCor = xCor;
        this.yCor = yCor;
    }

    public int xCor(){
        return xCor;
    }

    public int yCor(){
        return yCor;
    }

    public void moveUp(){
        yCor += 1;
    }

    public void moveDown(){
        yCor -= 1;
    }

    public void moveLeft(){
        xCor -= 1;
    }

    public void moveRight(){
        xCor += 1;
    }
}