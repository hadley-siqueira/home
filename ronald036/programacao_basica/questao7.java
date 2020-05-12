import java.util.Scanner;

public class questao7{
	public static void main (String[] args) {
		Scanner s;
		int n;
		int v;
		int c;
		int x;
		int q;
		int t;
		int h;
		int l;
		int e;

		s = new Scanner(System.in);
		System.out.print("informe o numero: ");
		n = s.nextInt();
		v = n * n * n;
		c = n * n;
		x = 3 * c;
		t = x + v;
		h = 2 * n;
		l = t - h;
		e = l + 7;
		System.out.println(e);
	}
}


