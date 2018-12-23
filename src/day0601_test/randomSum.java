package day0601_test;

public class randomSum {
	public static void main(String[] args) {
		//一、给出一个数组包含0-9随机的数，求每个数出现的次数
		int[] a = {1,2,4,5,6,7,2,1,3,3};
		//新数组来存储次数
		int[] count = new int[10];
		//利用forecah更加方便
		for(int i:a) {
			count[i]++;
		}
		for(int i=0;i<count.length;i++) {
			System.out.println("数字"+i+"出现的次数为"+count[i]);
		}
	}

}
