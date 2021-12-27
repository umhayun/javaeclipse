package controlExam;

import java.util.Scanner;

public class quiz2 {
	static int[] arr= {15,16,17,18,19};
	
	static int quiz2(int key, int head, int tail) {
		int center;
		while(head<=tail) {
			 center=(head+tail)/2;
			if(arr[center]==key) {
				return center;
				
			}
			else if(arr[center]!=key){
				if(arr[center]<key) {
					head=center+1;
				}
				else if(arr[center]>key) {
					tail=center-1;
				}
			
				
			}	
		} 
		return -1;
		
	}
public static void main(String[] args) {
	

	int a=quiz2(17, 0, arr.length-1);
	if(a==-1) {
		System.out.println("찾지못했습니다.");
	}
	else {
		System.out.println((a+1)+"번째값이랑 일치합니다.");
	}
	
}


//double base=sc.nextDouble();
//double height=sc.nextDouble();
//double area=(base*height)/2;
//System.out.println(area);
//System.out.print("a : ");
//int a=sc.nextInt();
//System.out.print("b : ");
//int b=sc.nextInt();
//if(a>b) {
//	System.out.println("a가 b보다 크다.");
//}
//else {
//	if(a==b) {
//		System.out.println("a와 b가 같다.");
//	}
//	else {
//		System.out.println("a가 b보다 작다");
//	}
//}
//
//int a=11, b=55, change=0;
//change=b;
//b=a;
//a=change;
//System.out.println("a : "+a);
//System.out.println("b : "+b);
//int sum=0;
//int[] arr= {5,6,4,9,1,23,8};
//for(int i=0;i<arr.length;i++) {
//	sum+=arr[i];
//}
//System.out.println("배열의 합 : "+sum);
//int[] arr= {9,6,3,4,8,1,2};
//int max=0;
//for(int i=0; i<arr.length;i++) {
//	if(arr[i]>max) {
//		max=arr[i];
//	}
//	
//}
//System.out.println(max);
//
//
//	for(int i=0; i<arr.length;i++){
//	if(arr[i]==5) {
//		System.out.println(i+"번째 요소가 일치합니다.");
//		break;}	
//	else if(i==arr.length-1){
//		System.out.println("찾지 못했습니다.");
//	}
//	}

}
