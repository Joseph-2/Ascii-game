class Map{
    private final int length;
    private final int width;
    private final Player player;
    private final Goal goal;

    public Map(int length, int width, Player player, Goal goal){
        this.length = length;
        this.width = width;
        this.player = player;
        this.goal = goal;
    }
    public String generateMap(){
        StringBuilder map = new StringBuilder();
        int gridX = -1*width/2;
        int gridY = width/2;

        for(int l = 0; l < length; l++){
            for(int w = 0; w < width; w++){

                if (gridX == player.xCor() && gridY == player.yCor()){
                    map.append(" 0 ");
                }
                else if (gridX == goal.xCor() && gridY == goal.yCor()){
                    map.append(goal.symbol());
                }else{map.append(" . ");}

                gridX++;
            }
            gridX = -1*width/2;
            gridY--;
            map.append("\n");
        }

        return map.toString();
    }
}