package day0601_test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortone {
	public static void main(String[] args) {
		//����ֻ��0,1�����鲻ʹ�����򷽷�����������
		int[] arr = {1,0,1,0,1,1,1,0};
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
				arr[index++]=0;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
/*���
[1, 0, 1, 0, 1, 1, 1, 0]
[0, 1, 1, 0, 1, 1, 1, 0]
[0, 1, 1, 0, 1, 1, 1, 0]
[0, 0, 1, 1, 1, 1, 1, 0]
[0, 0, 1, 1, 1, 1, 1, 0]
[0, 0, 1, 1, 1, 1, 1, 0]
[0, 0, 1, 1, 1, 1, 1, 0]
[0, 0, 0, 1, 1, 1, 1, 1]*/