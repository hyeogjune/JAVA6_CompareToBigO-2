
public class SortExample {

	public static void main(String[] args) {
		int [] arr = new int[100000];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;			
		}
		//���� �ð� ����
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
		
		
		//������ �ð� ����
		long end = System.currentTimeMillis();
		
		//���
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if(i%20 == 19)
				{System.out.println();}
		}
		
		//�ʴ��� ȯ��
		System.out.println("\n���� �ð� : " + (end-start)/1000.0);

	}

}
