

public class CountIslandsAlgorithm {
    private final int LAND = 1;
    private final int WATER = 0;
    private int[][] islandMap ;


    public CountIslandsAlgorithm(int[][] islandMap) {
        if (islandMap == null)
            throw new IllegalArgumentException("islandMap");

        this.islandMap = islandMap;
    }

    public int execute(){
        int numberOfIsland = 0;

        for (int row = 0; row < islandMap.length; row++){
            for(int column = 0; column < islandMap[0].length; column++){
                if (islandWasFound(row, column)){
                    numberOfIsland++;
                    setNeighborhoodToWater(row, column);
                }
            }
        }

      return numberOfIsland;
    }

    private boolean islandWasFound(int row, int column) {
        return islandMap[row][column] == LAND;
    }

    private void setNeighborhoodToWater(int row, int column){
        if( isOutOfBoundsOrIsWater(row, column)) return;

        setWater(row, column);

        // Expand top, bottom, left and right 
        setNeighborhoodToWater(row - 1, column);
        setNeighborhoodToWater(row + 1, column);
        setNeighborhoodToWater(row, column - 1);
        setNeighborhoodToWater(row, column + 1);

        // Expand all diagonals
        setNeighborhoodToWater(row - 1, column + 1);
        setNeighborhoodToWater(row + 1, column + 1);
        setNeighborhoodToWater(row - 1, column - 1);
        setNeighborhoodToWater(row + 1, column - 1);
    }

    private void setWater( int row, int column){
        islandMap[row][column] = WATER;
    }

    private boolean isOutOfBoundsOrIsWater( int row, int column) {
        return  row > islandMap.length-1
                || column > islandMap[0].length -1
                || row < 0
                || column < 0
                || islandMap[row][column] == 0;
    }
}