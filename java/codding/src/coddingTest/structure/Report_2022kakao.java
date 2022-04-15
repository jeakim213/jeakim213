package coddingTest.structure;

import java.util.ArrayList;
import java.util.HashSet;

public class Report_2022kakao {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo" };
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
		int k = 2;
		
		int[] result = solution(id_list, report, k);
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

/*
 * 1트
 * 24개의 테스트조건중 15개 실패. 그중 5개 시간초과...
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //신고한 아이디를 담을 유저
        ArrayList<HashSet<String>> users = new ArrayList<HashSet<String>>();
        //k번 이상 신고된 아이디
        ArrayList<String> restriction = new ArrayList<String>();
        //report분해 A, B 나누기
        for(String id : id_list){
            //신고한 아이디
            HashSet<String> rep_id = new HashSet<String>();
        	for(String rep : report) {
        		String[] tmp = rep.split(" ");//tmp[0] : 신고자, tmp[1] : 대상자
        		if(id.equals(tmp[0]))
        			rep_id.add(tmp[1]);
        	}
        	//어찌하던 id_list순서대로 담김. set이 비어있어도.
        	users.add(rep_id);
        }
        //users 신고에 담긴거 꺼내서 k번 넘는 아이디 체크하기.
        for(String id : id_list) {
        	int count = 0;
        	for(HashSet<String> rep_id : users) {
        		if(count >= k) {
        			restriction.add(id);//k번이상 제재대상
        			break;//나와서 더 안돌아가게 하기.
        		}
        		if(rep_id.contains(id))
        			count++;
        	}
        }
        for(int i = 0; i < answer.length; i++) {
        	int count = 0;
        	for(String id : users.get(i)) {
        		if(restriction.contains(id))//신고한id가 제재대상에 있다면. 카운트
        			count++;
        	}
        	answer[i] = count;
        }
        return answer;
    }
*/
/*
 * 2트
 */
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        return answer;
	}
}