import java.util.*;

public class Main {
	public static void main(String[] args) {
		int king, queen, rook, bishop, knight, pawn;
		
		Scanner sc = new Scanner(System.in);
		
		king = sc.nextInt();
		queen = sc.nextInt();
		rook = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		pawn = sc.nextInt();
		
		System.out.println(1 - king);
		System.out.println(1 - queen);
		System.out.println(2 - rook);
		System.out.println(2 - bishop);
		System.out.println(2 - knight);
		System.out.println(8 - pawn);
	}
}