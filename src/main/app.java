package main;

public class app {


    public static void main(String[] args) {

//        int[][] map = {
//
//                {1, 1, 0, 1, 1, 1},
//                {1, 1, 0, 1, 1, 1},
//                {0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 1, 1, 1},
//                {0, 1, 0, 1, 1, 1},
//                {0, 0, 0, 1, 1, 1},
//         };



//        int[][] map = {
//
//                {0, 1, 0,},
//                {1, 0, 1,},
//                {0, 0, 0,}
//        };



        int[][] map = {

                {0, 1, 0, 0, 1, 0, 1, 1},
                {0, 0, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 1, 1},
                {0, 1, 0, 1, 1, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1, 1}

         };

        CountIslandsAlgorithm algorithm = new CountIslandsAlgorithm(map);

        System.out.println(algorithm.execute());







    }
}
