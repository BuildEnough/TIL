
public class RandomWalk {

	public static void main(String[] args) {
		int row= 10, col = 10;
		
		int x = 5, y = 5;
		boolean tile[][] = new boolean[row][col];

		int steps;
		tile[4][4] = true; // 현재 위치 (5,5)

		for (steps = 0; steps < 10; steps++) {
			int dir = (int)(Math.random() * 4);
			
			if (dir == 0 && x > 0) {
				x--;				
			} else if (dir == 1 && x < 9) {
				x++;				
			} else if (dir == 2 && y > 0) {
				y--;				
			} else if (y < 9) {
				y++;				
			}
			
			tile[y][x] = true;

			System.out.println("--------------------------");
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (tile[i][j] == true) {
						System.out.print("# ");						
					} else {
						System.out.print(". ");						
					}
				}
				System.out.println(); // 개행
			}
			System.out.println("--------------------------");
		}
		System.out.println("전체 이동 수는 = " + steps);
	}

}
