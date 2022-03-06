package coddingTest.structure;
/*
 * 기능개발(프로그래머스) - 스택
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 * 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 
 * 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 
 * 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 * 
 * ex) progresses = {93, 30, 55}, speeds = {1, 30, 5} => answer = {2, 1}
 */
public class ProcessDev {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		int[] result = solution(progresses, speeds);
		//결과확인
		for(int i : result) {
			System.out.print(i + ", ");
		}
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        //순서대로 되어있음. 진도, 개발속도
        //뒷 순서가 먼저 배포될 수 없음. 완성되면 같이 나옴
        int[] days = new int[progresses.length];
        //반복문 100 - 프로그래스 - 스피드 if <= 0 탈출로 날짜계산
        int j = 0;
        for(int i = 0; i < progresses.length; i++){
            int get = 100;
            get -= progresses[i];
            while(true){
                if(get <= 0){
                    days[i] = j;
                    j = 0;
                    break;
                }
                get -= speeds[i];
                j++;
            }
        }//days에 일수가 담김.
        int max = days[0];
        int count = 1;
        j = 0;
        for(int i = 1; i < days.length; i++){
            if(max < days[i]){
                days[j] = count;
                max = days[i];
                count = 1;
                j++;
                continue;
            }
            count++;
        }
        days[j] = --count;//마지막 값 까지 넣어주기
        int[] answer = new int[j+1]; //동적배열할당
        //값 복사
        for(int i = 0; i <= j; i++){
            answer[i] = days[i];
        }
        return answer;
    }
}