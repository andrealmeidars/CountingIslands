package main;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;


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
    public void isWaterSet(){

        countIslandsAlgorithm.setWater(0,1);
        assertFalse(countIslandsAlgorithm.islandWasFound(0, 1));
     }

    @Test
    public void isLandFound(){

        assertTrue(countIslandsAlgorithm.islandWasFound(0, 4));
    }
}