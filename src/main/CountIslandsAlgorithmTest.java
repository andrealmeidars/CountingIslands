package main;



import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CountIslandsAlgorithmTest {

    CountIslandsAlgorithm countIslandsAlgorithm;

    @Before
    public void setUp() {
        int[][] map = {

                {0, 1, 0, 0, 1, 0, 1, 1},
                {0, 0, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 1, 1},
                {0, 1, 0, 1, 1, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1, 1}
        };

        this.countIslandsAlgorithm = new CountIslandsAlgorithm(map);
    }


    @Test
    public void showTrueIfWaterIsSetReturnWater(){

        countIslandsAlgorithm.setWater(0,1);
        assertTrue(!countIslandsAlgorithm.islandWasFound(0, 1));
     }

    @Test
    public void showTrueIfLandWasFound(){
        assertTrue(countIslandsAlgorithm.islandWasFound(0, 4));
    }

    @Test
    public void showFalseIfLandWasNotFound(){
        assertFalse(countIslandsAlgorithm.islandWasFound(0, 5));
    }




    @Test
    public void showTrueIfColumnIsGreaterThanZero(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(-1, -1));

    }

    @Test
    public void showFalseIfColumnIsBiggerThanZero(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(1, 3));

    }

    @Test
    public void showTrueIfRowIsGreaterThanZero(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, -1));

    }

    @Test
    public void showTrueIfRowIsBiggerThanZero(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 3));

    }



    @Test
    public void  showTrueIfSendingRowAndColumnIsEqualsWater(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0,0));
    }

    @Test
    public void  showFalseIfSendingRowAndCapolumnIsEqualsWater(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 1));
    }

    @Test
    public void showTrueIfNumberOfColumnIsBiggerThanOnMap(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 100));
    }

    @Test
    public void showFalseIfNumberOfColumnIsGreaterThanOnMap(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 1));
    }

    @Test
    public void showTrueIfNumberOfRowIsBiggerThanTotalRows(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(100, 0));
    }

    @Test
    public void showFalseIfNumberOfRowIsGreaterThanTotalRows(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(3, 4));

    }

    @Test(expected = IllegalArgumentException.class)
    public void showIllegalArgumentExceptionMapNull(){
        int[][] nullMap = null;
        this.countIslandsAlgorithm = new CountIslandsAlgorithm(nullMap);


    }




}