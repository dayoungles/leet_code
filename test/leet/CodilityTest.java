package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodilityTest {

    Codility c = new Codility();
    @Test
    public void question1() {
//        int[] a = {2,1,1,0,1};
//        int u = 3;
//        int l = 2;
//        int[] a = {2,1,1,0,1};
        int u = 2;
        int l = 2;
//        int[] a = {2,0,2,1,0,2,1,1};
        int[] a = {2,2,1,0};
        System.out.println(c.question1(u,l,a));

    }
    @Test
    public void testq1_1() {
        c.testq1();
    }


    @Test
    public void question2() {
//        S는 최대 500줄
//        빈 줄 없음
//        각 줄은 항상 스페이스를 한칸만 가지고 있고, 스페이스가 사이즈랑 이름을 분리함
//
//        각 줄의 파일은 빈 파일 네임없음. 최대 30charracter.
//                확장자는 마지막 . 이후의 몇개의 글자. 확장자는 비어있을 수 없음. 소문자/숫자로 구성됨
//        파일 이름 없이 확장자만 있을 수는 없음
//        파일 이름은 소문자 대문자 숫자, 스페셜 캐릭터 쿼트 빼고 가능
//        파일 사이즈는 항상 양의 정수, 1000000바이트보다 작거나 같음
        String a = "my.song.mp3123123123123123123123.ext 1000000b\ngreatSong.flac 1000000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        System.out.println(c.question2(a));
//        String a = "my.song.mp3123123123123123123123.ext 1000000b\ngreatSong.flac 1000000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

    }

    @Test
    public void question3() {
        int[] a = {};
        System.out.println(c.question3(a));
    }

    @Test
    public void question4() {
//        int[] a = {1,3,2,1};
//        int[] b = {4, 2, 5, 3, 2};
        int[] a = {2,3,4};
        int[] b = {1,1,1,2,3,4};
        System.out.println(c.question4(a, b));
    }
}