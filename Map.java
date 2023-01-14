class Map{
    private final int length;
    private final int width;
    private final Player player;

    public Map(int length, int width, Player player){
        this.length = length;
        this.width = width;
        this.player = player;
    }

    public String generateMap(){
        StringBuilder map = new StringBuilder();
        int gridX = -1*width/2;
        int gridY = width/2;

        for(int l = 0; l < length; l++){
            for(int w = 0; w < width; w++){
                if (gridX == player.XCor() && gridY == player.YCor()){
                    map.append(" 0 ");
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