package day0601_test;

public class recorsion {
	public static void main(String[] args) {		
	int n = 5;
	int x =foo(n);
	System.out.println(x);
}
	//�ݹ鷽��
	//�����ڴ棬���Կռ����ĺܴ󣬵��ݹ���Ⱥܴ�ʱ����Ҫע��
	//�ݹ鲢������ת��Ϊ��������
	public static int foo(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*foo(n-1);
		}
	}
}