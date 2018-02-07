package newpackage;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INT105
 */
public class MyArray {

    public static int[] findMinMax(int[] scoreOutRange) {
        int min = scoreOutRange[0];
        int max = scoreOutRange[0];

        for (int i = 0; i < scoreOutRange.length; i++) {

            if (scoreOutRange[i] < 0) {
                return null;
            } else {
                if (min > scoreOutRange[i]) {
                    min = scoreOutRange[i];
                }
                if (max < scoreOutRange[i]) {
                    max = scoreOutRange[i];
                }
            }

        }
        return new int[]{min, max};

    }

}
