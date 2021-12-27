package controlExam;

public class quiz {
	public static void main(String[] args) {
				//10 1 2  5   8  6
	int[] num= {32,34,68,27,8,17};
	int[] array=new int[11];
	for(int i=0;i<num.length;i++) {
		int k=(num[i]%11);
		if(array[k]==0) {
			array[k]=num[i];
		}
	}
	System.out.println(num);
	
	}
}
