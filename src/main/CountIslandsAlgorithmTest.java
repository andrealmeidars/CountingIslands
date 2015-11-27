package main;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
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
    public void shouldReturnTrueWhenWaterWasSet(){
        countIslandsAlgorithm.setWater(0,1);
        assertThat(countIslandsAlgorithm.islandWasFound(0, 1), is(false));
     }

    @Test
    public void shouldReturnTrueWhenLandWasFound(){
        assertThat(countIslandsAlgorithm.islandWasFound(0, 4), is(true));
    }

    @Test
    public void shouldReturnFalseWhenLandWasNotFound(){
        assertThat(countIslandsAlgorithm.islandWasFound(0, 5), is(false));
    }

    @Test
    public void shouldReturnTrueWhenColumnIsGreaterThanZero(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(-1, -1), is(true));
   }

    @Test
    public void shouldReturnFalseWhenColumnIsBiggerThanZero(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(1, 3), is(false));
    }

    @Test
    public void shouldReturnTrueWhenRowIsGreaterThanZero(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, -1), is(true));
    }

    @Test
    public void shouldReturnTrueWhenRowIsBiggerThanZero(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 3), is(true));
    }

    @Test
    public void  shouldReturnTrueWhenSendingRowAndColumnIsEqualsWater(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 0), is(true));
    }

    @Test
    public void  shouldReturnFalseWhenSendingRowAndColumnIsEqualsWater(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 1), is(false));
    }

    @Test
    public void shouldReturnTrueWhenNumberOfColumnIsBiggerThanOnMap(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 100), is(true));
    }

    @Test
    public void shouldReturnFalseWhenNumberOfColumnIsGreaterThanOnMap(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(0, 1), is(false));
    }

    @Test
    public void shouldReturnTrueWhenNumberOfRowIsBiggerThanTotalRows(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(100, 0), is(true));

    }

    @Test
    public void shouldReturnFalseWhenNumberOfRowIsGreaterThanTotalRows(){
        assertThat(countIslandsAlgorithm.isOutOfBoundsOrIsWater(3, 4), is(false));

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenMapIsNull(){
        int[][] nullMap = null;
        this.countIslandsAlgorithm = new CountIslandsAlgorithm(nullMap);
    }

    @Test
    public void shouldReturnNumberOfIslandOnMapValue5(){
        assertThat(countIslandsAlgorithm.execute(), is(5));
    }

    @Test
    public void shouldReturnNumberOfIslands(){

        int[][] map1Island = {

                {0, 1, 0,},
                {1, 0, 1,},
                {0, 0, 0,}
        };

        this.countIslandsAlgorithm = new CountIslandsAlgorithm(map1Island);
        assertThat(countIslandsAlgorithm.execute(), is(1));
    }

}