package day0601_test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	//foreach ѭ����������
	//for(�������� ������:��������)�������
		int [] i = {1,2,3,4,5,6,7};
		int [] k = new int[10];
		for(int j:k) {
			System.out.print(j+" ");
		}
		System.out.println();
	//Arrays.sort()��������Ĭ������
		String [] array = new String[]{"a","c","b","o"};
		Arrays.sort(array);
		for(String s:array) {
			System.out.print(s+" ");
		}
		//arrays.toStirng() toString ����
		//Arrays.toString(array) ֱ�Ӵ�ӡarray����
		System.out.println(Arrays.toString(array));
		//Arrays.copyof(����[] ����,.length)
		String[] arrays = Arrays.copyOf(array, array.length);
		//��������ݣ����������������ݣ��������ڴ��п���֮��Ͳ����ٱ䳤��
		//copyof֮�����������飬����array�����������
		array = Arrays.copyOf(array, 5);
		System.out.println(Arrays.toString(array)+" "+Arrays.toString(arrays));
		//System.arraycopy()ͬ�������������и������飬�Ҹ��ӷ���
		int [] a = {1,2,3,4,5};
		int [] b = {12,3,46,7,54,};
		System.arraycopy(a, 2, b, 2, 3);
		System.out.println(Arrays.toString(b));
	}
}
