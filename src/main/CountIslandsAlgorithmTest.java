package main;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;


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
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0,3));

    }



    @Test
    public void  showTrueIfSendingRowAndColumnIsEqualsWater(){
        assertTrue(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0,0));
    }

    @Test
    public void  showFalseIfSendingRowAndColumnIsEqualsWater(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 1));
    }

    @Test
    public void showTrueIfNumberOfColumnIsGreaterOnMap(){
        assertFalse(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0,1));
    }




}