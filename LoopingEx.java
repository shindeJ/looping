package practice;

public class LoopingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
		int i=0;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<10);
		 i=0;
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		i=10;
		int[] arr=new int[5];
		arr[0]=10;
		for (int j : arr) {
			if(j==10) {
				System.out.println("hiiiii");
			}
			else {
				System.out.println(j);
			}
			
		}	
		}

}
