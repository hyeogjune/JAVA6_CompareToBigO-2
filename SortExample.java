
public class SortExample {

	public static void main(String[] args) {
		int [] arr = new int[100000];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;			
		}
		//시작 시간 저장
		long start = System.currentTimeMillis();
		
		
		
		//Quick sor
		int temp1, temp2;
		for(int i = 1; i<arr.length; i++) {
			temp2=arr[i];
			temp1 = i;
			while(temp1 >0 && arr[temp1-1]>temp2) {
				arr[temp1] = arr[temp1-1];
				temp1--;
			}
			arr[temp1] = temp2;
		}
		
		
		//끝나는 시간 저장
		long end = System.currentTimeMillis();
		
		//출력
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if(i%20 == 19)
				{System.out.println();}
		}
		
		//초단위 환산
		System.out.println("\n실행 시간 : " + (end-start)/1000.0);

	}

}
