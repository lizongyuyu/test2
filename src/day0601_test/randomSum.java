package day0601_test;

public class randomSum {
	public static void main(String[] args) {
		//һ������һ���������0-9�����������ÿ�������ֵĴ���
		int[] a = {1,2,4,5,6,7,2,1,3,3};
		//���������洢����
		int[] count = new int[10];
		//����forecah���ӷ���
		for(int i:a) {
			count[i]++;
		}
		for(int i=0;i<count.length;i++) {
			System.out.println("����"+i+"���ֵĴ���Ϊ"+count[i]);
		}
	}

}
