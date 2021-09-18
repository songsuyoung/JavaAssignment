package example;

public class two_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums= new int[4][4];
		int count=0;
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				nums[i][j]=(int)(Math.random()*10)+1;
		
		while(count<6){
			int row=(int)(Math.random()*4);
			int col=(int)(Math.random()*4);
			
			if(nums[row][col]!=0) {
				nums[row][col]=0;
				count++;
			}
			
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++)
				System.out.print(nums[i][j]+"  ");
			System.out.println();
		}
	}

}
