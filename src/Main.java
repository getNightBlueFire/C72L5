import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        int[] ints1 = new int[]{1,2,3};
        int[] ints21 = new int[]{3,4,5,6,7};

        //{2, 3}
        int[][] arr = new int[][]{ints,ints21};

        arr[0]= ints21;


        int[][] test1 = {{1, 6, 7}, {8}};
        int[][] test3 = {{10, 5, 4, 5, 5, 7, 8}};
        int[][] test4 = {{10, 45}, {0}, {10, 1}};


        int[][][] test = {test1, test3, test4};


        Random random1 = new Random();

        for (int i = 0; i < test.length; i++) {
            for (int i1 = 0; i1 < test[i].length; i1++) {
                for (int j = 0; j < test[i][i1].length; j++) {
                    //test[][][]
                    //safsrgffgfggfg


                    //test[i][i1][j]  = random1.nextInt(10);
                }
            }
        }

        int c1 = 0;
        for (int i = 0; i < test.length; i++) {

            for (int i1 = 0; i1 < test[i].length; i1++) {

                for (int j = 0; j < test[i][i1].length; j++) {
                    c1++;
                }
            }
        }

        System.out.println(c1);





        System.out.println(Arrays.deepToString(test));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }






        for (int i : ints) {
            //System.out.println(i);
        }


        int k = 2;
        int c = 3;
        int[][] ints4 = new int[k][c];
        int[][] ints2 = new int[][]{{1, 2, 3}, {3, 4, 5}};


        Random random = new Random();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < c; j++) {
                //ints2[i][j] = random.nextInt(80)+10;
            }
        }

        for (int i = 0; i < ints2.length; i++) {
            //System.out.println(ints2.length);

            for (int j = 0; j < ints2[i].length; j++) {
                //System.out.println(ints2[i].length);
                System.out.print(ints2[i][j] + "   ");
            }
            System.out.println();
        }

        String[] strings = new String[3];

        strings[0] = "1";
        strings[1] = "1";
        strings[2] = "1";




        String[] strings1 = new String[]{"one", "two", "other"};
        int[][] ints9 = new int[][]{{1, 2, 3}, {3, 4, 5}};


        for (int i = 0; i < strings.length; i++) {
            //System.out.println(strings[i]);
        }



        System.out.println(ints1 == ints);
        System.out.println(Arrays.equals(ints, ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.deepToString(ints2));
////
        int[][] testArr = new int[6][6];
        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
                testArr[i][j] = random.nextInt(10,20);
            }
        }

        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
                System.out.print(testArr[i][j] + "   ");
            }
            System.out.println();
        }

        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i][i]);
        }

        System.out.println();

        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
                if (i == j){
                    System.out.println(testArr[i][i]);
                } else
                    continue;

            }
        }

        for (int i = 0, j= 0; i < testArr.length; i++, j++) {
            System.out.println(testArr[i][j]);
        }

    }
}