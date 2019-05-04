import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Please, write dimensions!");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
		double p = sc.nextDouble();

		Table t = new Table(n, m, p);
		System.out.println(t);
    }
}

