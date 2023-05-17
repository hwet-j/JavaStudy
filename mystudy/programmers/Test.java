package programmers;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		
		Stack<Integer> sta = new Stack<>();
		
        for(int i=l;i<=r;i++){
            if(i%5==0){
                String Num = Integer.toString(i);
                String[] splitNum = Num.split("");
                for(int k =0 ;k<splitNum.length;k++){
                    if(splitNum[k].equals("0") | splitNum[k].equals("5")){}
                    else{break;}        
                    
                    if(k==splitNum.length-1){
//                        System.out.println();
                        sta.push(i);
//                        System.out.println(sta);
                        }
                    }
                }
            }
        int[] answer = new int[sta.size()];
        
//        System.out.println(sta);
//        System.out.println(sta.size());
        int ss = sta.size();
        for(int i=0; i<ss;i++){
            answer[ss-(i+1)]=sta.pop();		// pop() => index의 마지막값을 뽑아서 사용후 삭제
//            System.out.println(sta);
            System.out.println(sta.size());
            System.out.println("Answer :"+Arrays.toString(answer));
        }
        
//        System.out.println(Arrays.toString(answer));
        if(sta.size()==0){
            int[] ans = new int[]{-1};
//            return ans;
        }                   
//        return answer;
		
	}

}
