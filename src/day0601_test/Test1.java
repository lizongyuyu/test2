package day0601_test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	//foreach 循环遍历数组
	//for(数据类型 数据名:遍历数组)正序遍历
		int [] i = {1,2,3,4,5,6,7};
		int [] k = new int[10];
		for(int j:k) {
			System.out.print(j+" ");
		}
		System.out.println();
	//Arrays.sort()数组排序默认升序
		String [] array = new String[]{"a","c","b","o"};
		Arrays.sort(array);
		for(String s:array) {
			System.out.print(s+" ");
		}
		//arrays.toStirng() toString 方法
		//Arrays.toString(array) 直接打印array数组
		System.out.println(Arrays.toString(array));
		//Arrays.copyof(类型[] 名字,.length)
		String[] arrays = Arrays.copyOf(array, array.length);
		//数组的扩容，并不是真正的扩容，数组在内存中开辟之后就不会再变长度
		//copyof之后会产生新数组，所以array会产生新数组
		array = Arrays.copyOf(array, 5);
		System.out.println(Arrays.toString(array)+" "+Arrays.toString(arrays));
		//System.arraycopy()同样可以用来进行复制数组，且更加方便
		int [] a = {1,2,3,4,5};
		int [] b = {12,3,46,7,54,};
		System.arraycopy(a, 2, b, 2, 3);
		System.out.println(Arrays.toString(b));
		
	/*二.多维数组*/
		//二维
		int [][] aa = {{1,1,1},
		               {2,2,2},
		               {3,3,3},
		               {4,4,4}};
		for(int l=0;l<aa.length;l++) {
			for(int n=0;n<aa[l].length;n++) {
				System.out.print(aa[l][n]+" ");
			}
			System.out.println();
		}
		//多维
		int [][][] bb= new int[2][3][4];
		for(int l=0;l<bb.length;l++) {
			for(int n=0;n<bb[l].length;n++) {
				for(int m=0;m<bb[l][n].length;m++) {
					bb[l][n][m]=(int)(Math.random()*100);
					System.out.print(bb[l][n][m]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
