package programmers;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int[] stk = {};
		int[] arr = {1,4,2,5,3};
        List<Integer> list = new ArrayList<>(); 
        int n = 0;
        while (n < arr.length){
            if (list.size() == 0){
                list.add(arr[n]);
                n += 1;
            } else {
            	System.out.println(list.get(list.size()-1) + "  "+ arr[n]);
                if (list.get(list.size()-1) < arr[n]){
                    list.add(arr[n]);
                    System.out.println("추가" + list);
                    n += 1;
                } else {
                    list.remove(list.size()-1);
                    System.out.println("제거"+ list);
                }
            }
            
        }   
        System.out.println(list);
        stk = new int[list.size()];
        for (int i = 0; i< list.size(); i++){
            stk[i] = list.get(i).intValue();
        }
		
		
	}

}
