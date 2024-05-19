import BasicSortingAndSearch.SearchingOrdered;
import BasicSortingAndSearch.Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] points = new int[][]{{8,7},{9,9},{7,4},{9,7}};

        System.out.println(Arrays.deepToString(points));

        for(int i=0; i<points.length-1; i++){

            int minorIndex = i;

            for(int j=i+1; j<points.length-1; j++){
                if(points[j][0] < points[minorIndex][0]){
                    minorIndex = j;
                }
            }

            int[] temp = points[minorIndex];
            points[minorIndex] = points[i];
            points[i] = temp;
        }

        System.out.println(Arrays.deepToString(points));

        int maxWidth = 0;

        for(int i=0; i<points.length-2; i++){
            if((points[i+1][0]-points[i][0])>maxWidth){
                maxWidth = points[i+1][0]-points[i][0];
            }
        }

        System.out.println(maxWidth);

    }
}
