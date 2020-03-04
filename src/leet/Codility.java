package leet;

import java.util.*;

public class Codility {

    public void testq1() {
        String a = "";
        StringBuilder sb = new StringBuilder();

        long current1 = System.nanoTime();
        for (int i = 0; i< 100; i++) {
            sb.append("1");
        }
        System.out.println((System.nanoTime() - current1));

        long current = System.nanoTime();
        for (int i = 0; i< 100; i++) {
            a += "1";

        }
        System.out.println((System.nanoTime() - current));


    }

    public String question1 (int U, int L, int[] C){
        if(C.length == 0) return "IMPOSSIBLE";

        String first = "";
        String second = "";

        for(int num: C) {
            if(U < 0 || L <0) return "IMPOSSIBLE";

            if(num == 2) {
                first += "1";
                second += "1";
                U -= 1;
                L -= 1;
            } else if(num ==0) {
                first += "0";
                second += "0";
            } else {
                if(U>=L) {
                    first += "1";
                    second += "0";
                    U -= 1;
                } else {
                    first += "0";
                    second += "1";
                    L -= 1;
                }
            }
        }

        if(U != 0 || L != 0) return "IMPOSSIBLE";

        return first + "," + second;

    }



    public String question2 (String S){
        Set<String> music = new HashSet<>();
        Set<String> images = new HashSet<>();
        Set<String> movies = new HashSet<>();

        music.add("mp3");
        music.add("aac");
        music.add("flac");

        images.add("jpg");
        images.add("bmp");
        images.add("gif");

        movies.add("mp4");
        movies.add("avi");
        movies.add("mkv");

        String[] lines = S.split("\n");
        Map<String, Integer> map = new HashMap<>();

        for (String line: lines){
            String filename = line.split(" ")[0];
            String filesize = line.split(" ")[1];

            int size= Integer.parseInt(filesize.split("b")[0]);

            String[] splitedName= filename.split("\\.");
            String ext = splitedName[splitedName.length-1];

            if(music.contains(ext)) {
                map.put("music", map.getOrDefault("music", 0)+size);
            } else if(images.contains(ext)) {
                map.put("images", map.getOrDefault("images", 0)+size);
            } else if(movies.contains(ext)) {
                map.put("movies", map.getOrDefault("movies", 0)+size);
            } else {
                map.put("other", map.getOrDefault("other", 0)+size);
            }
        }

        String answer = "";
        for(Map.Entry<String, Integer> kv: map.entrySet()){
            String key = kv.getKey();
            int size = kv.getValue();

            answer += (key + " " + size + "b\n");
        }

        return answer;

    }

    private void lineAppend(StringBuilder sb, String type, int size) {
        sb.append(type);
        sb.append(" ");
        sb.append(size);
        sb.append("b");
        sb.append("\n");
    }

    public int question3 (int[] A){
        Set<Integer> s = new HashSet<>();
        int max = 0;
        for(int num: A) {
            if(s.contains(-num)) {
                if(max < Math.abs(num)) {
                    max = Math.abs(num);
                }
            }
            s.add(num);
        }

        return max;
    }

    public int question4 (int[] A, int[] B){
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k]){
//            while (i< m -1 && B[i] < A[k]) {
                i+=1;
            }

            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }
}
