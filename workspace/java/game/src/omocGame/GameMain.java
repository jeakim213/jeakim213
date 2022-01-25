package omocGame;

import java.util.HashMap;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		HashMap<String, Stone> omoc = new HashMap<String, Stone>();
		Scanner sc = new Scanner(System.in);
		
		//라운드진행 카운트
		int round = 0;
		
		while(true) {
			if(round%2==0) {//짝수 = 흑돌
				System.out.println("흑돌 시작");
				System.out.print("X값을 입력해주세요. >>");
				int x = sc.nextInt();
				System.out.print("Y값을 입력해주세요. >>");
				int y = sc.nextInt();
				String pos = x + "," + y;
				Stone black = new Stone(x, y, "1");
				if(omoc.containsKey(pos)) { //pos값과 같은게 있으면 다시입력메세지
					System.out.println("다시 입력해주세요. 이미 있습니다.");
					continue;
				}else {//값이 없다면 저장 -> 정렬 -> 출력
					
				}
			}else {//홀수 = 백돌
				
			}
			
		}
	}

}
