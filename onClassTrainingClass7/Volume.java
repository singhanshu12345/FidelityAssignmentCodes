package onClassTrainingClass7;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2, 3, 2}, {6, 6, 7}, {1, 2, 1}};
		int sum=0;
		int volume=1;
		for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					volume=volume*arr[i][j];
				}
		sum=sum+volume;
		volume=1;
		}
		System.out.println(sum);
	}
	

}
