package programmers;

import java.util.Arrays;

public class Four {

	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		String answer = "";
		String temp = "";
        String[] strArr = my_string.split("");
        for (int i=0;i<queries.length;i++){
            if (queries[i][1]-queries[i][0] % 2 == 0) {
            	for (int j=0;j<(queries[i][1]-queries[i][0])/2;j++) {
            		temp = strArr[queries[i][0]+j];
            		strArr[queries[i][0]+j] = strArr[queries[i][1]-j];
            		strArr[queries[i][1]-j] = temp;
            	}
            } else {
            	for (int j=0;j<(queries[i][1]-queries[i][0])/2 + 1;j++) {
            		temp = strArr[queries[i][0]+j];
            		strArr[queries[i][0]+j] = strArr[queries[i][1]-j];
            		strArr[queries[i][1]-j] = temp;
            	}
            }
        }
	}

}
