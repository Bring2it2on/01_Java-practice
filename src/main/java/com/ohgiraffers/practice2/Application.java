package com.ohgiraffers.practice2;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        // Q5. 문자열 바꾸기
        String a = "a:b:c:d";
        String b = a.replaceAll(":","#");
        System.out.println(b);

        // Q6. 리스트를 역순으로 정렬하기
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        myList.sort(Comparator.reverseOrder()); // Comparator 사용
        System.out.println(myList);

        // Q7. 리스트를 문자열로 만들기 (String.join)
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String result = String.join(" ",list2);
        System.out.println(result);

        // Q8. 맵에서 값 삭제하기
        HashMap<String,Integer> grade = new HashMap<>();
        grade.put("A",90);
        grade.put("B",80);
        grade.put("C",70);
        int result2 = grade.remove("B"); // "B" 키에 해당하는 자료를 제거한 후 값을 출력 -> 원본에도 영향
        System.out.println(result2);
        System.out.println(grade);

        // Q9. 중복 숫자 제거하기
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
        HashSet<Integer> temp = new HashSet<>(numbers);
        ArrayList<Integer> result3 = new ArrayList<>(temp);
        System.out.println(result3);

        // Q10. 매직 넘버 제거하기

    }
}
