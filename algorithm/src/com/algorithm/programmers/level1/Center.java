package com.algorithm.programmers.level1;

public class Center {
    public static void main(String[] args) {
//        문제 설명
//        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//                재한사항
//        s는 길이가 1 이상, 100이하인 스트링입니다.
//        입출력 예
//        s	return
//        "abcde"	"c"
//        "qwer"

        String result = solution("abcde");
        System.out.println(result);
    }

    public static String solution(String s){
        int len = 0;
        len = s.length();
        System.out.println(len);

        char[] a = s.toCharArray();
        char[] b;
        int centerIdx = 0;

        String result = "";
        if(len % 2 == 0){
            //짝수글자
            centerIdx = len/2;
            b = new char[2];
            b[0] = a[centerIdx-1];
            b[1] = a[centerIdx];
            //result = b.toString();
            //System.out.println(a[(len/2)]);
        }else{
            b = new char[1];
            centerIdx = len/2;
            System.out.println( centerIdx );

            b[0] = a[centerIdx];
            //홀수글자
        }

        result = String.valueOf(b);

        return result;

    }
}
