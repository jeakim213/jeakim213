package level1

public class lottos{
    public static void main(String[] args) {
        int[] lottos = {1, 0, 43, 0, 0, 23};
        int[] winNum = {3, 5, 23, 17, 37, 43}
        int[] result = solution(lottos, winNum);
        System.out.printf("최고순위 : %d, 최저순위 : %d", result[0], result[1]);

    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {1,2};
        int count = 7, zero = 0;
        for(int i = 0; i < lottos.length; i++){
            for (int j = 0; j < win_nums.length; j++){
                if (lottos[i] == win_nums[j])
                    count--;
            }
            if(lottos[i] == 0)
                zero++;
        }
        if (count == 7)
            answer[1] = 6;
        else
            answer[1] = count;
        answer[0] =  count - zero;
        return answer;
    }
}