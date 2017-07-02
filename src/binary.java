import java.util.Scanner;

public class binary {
	public static int[] trans(int n){
		int[] a = new int[100];
		int i=0;
		while(n != 1){
			a[i] = n % 2;
			n = n/2;
			i++;
		}
		a[i] = 1;
		int[] b = new int[i+1];
		for(int k = 0;k <= i;k++){
			b[k] = a[i-k];
		}
		return b;
	}
	
	public static void main(String[] args) {
		int n;
		//int ok = 1;
		while(1 == 1){
			System.out.print("输入要转换的十进制数：");
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();	
			int x = trans(n).length;
			for(int i = 0;i < x;i++){
				System.out.print(trans(n)[i]);
			}
			System.out.println();
			//System.out.println("\n继续转换请输入‘0’");
			//ok = scanner.nextInt();
		}
	}
}