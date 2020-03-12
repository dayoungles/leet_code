package leet;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        if(s1.length() == s2.length() && s1.contains(s2)) return true;

        int[] map = new int[26];
        int sum = s1.length();

        for (int i = 0; i < sum; i++) {
            map[s1.charAt(i)-'a']++;
        }

        for (int r = 0, l = 0; r < s2.length(); r++) {
            char c = s2.charAt(r);
            if(map[c-'a'] > 0) { // 문자가 s2에 한번 이상 쓰였으면
                map[c -'a'] --; // 문자열에서 카운팅했던 횟수를 하나 뻄
                sum--;

                if(sum==0) return true; // 이제 s1 카운트를 다 했으면 맞는 답이라고 해

            } else { // 만약에 순열이 퍼뮤테이션이 아니면,sum도 복원해주고 다시 시작하는 위치도 바꿔줘야해
                // 한번도 쓰인적이 없으면 처음 c를 본데로 l을 옮길거야
                while (l<= r && s2.charAt(l) != s2.charAt(r)){
                    map[s2.charAt(l) -'a']++;
                    l++;
                    sum++;
                }
                l++;

            }
        }

        return false;
    }
}
