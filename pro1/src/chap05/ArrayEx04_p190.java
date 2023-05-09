package chap05;

//다차원배열(p190): 행과 열로 구성된 배열을 2차원 배열이라고 한다.
//행=row=줄
//열=column=칸
public class ArrayEx04_p190 {

	public static void main(String[] args) {
		int[][] scores={
						{10,20,30,40,50},
		                {20,30,40,50,60},
					    {30,40,50,60,70}
		               };
		System.out.println("scores="+scores);// [[I@15db9742
		System.out.println("scores.length="+scores.length);//3
		
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"]일때");//주소
			for(int j=0;j<scores[i].length;j++) {
				System.out.println("scores["+i+","+j+"]="+scores[i][j]);
			}
		}

/*
		int[][] scores={[0,0],[0,1],[0,2],[0,3],[0,4]},
				  scores[1,0],[1,1],[1,2],[1,3],[1,4]},
				  scores[2,0],[2,1],[2,2],[2,3],[2,4]};
	*/	
		/*
		int[] korScores= {20,30,40,50,60};
		System.out.println("korScores="+korScores);//[I@6d06d69c 
		System.out.println("korScores.length="+korScores.length);//5
		*/

	}
}






