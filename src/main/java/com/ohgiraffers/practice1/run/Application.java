package com.ohgiraffers.practice1.run;

import com.ohgiraffers.practice1.EmployeeDTO;
import com.ohgiraffers.practice1.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] students = new StudentDTO[3];


        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        students[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        students[1] = new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        students[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");

        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        for (StudentDTO student : students) {
            System.out.println(student.toString());
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeeDTO[] employees = new EmployeeDTO[10];

        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        int count = 0;
        Loop : while(true) {

            System.out.println("사원 정보를 입력해주세요~");
            System.out.print("1. 사원 이름 : ");
            String name = sc.next();

            System.out.print("2. 나이 : ");
            int age = sc.nextInt();

            System.out.print("3. 키 : ");
            double height = sc.nextDouble();

            System.out.print("4. 몸무게 : ");
            double weight = sc.nextDouble();

            System.out.print("5. 급여 : ");
            int salary = sc.nextInt();

            System.out.print("6. 부서 : ");
            String dept = sc.next();

            employees[count++] = new EmployeeDTO(name,age,height,weight,salary,dept);

            System.out.println("계속 추가 하시겠습니까? : ");
            char option = sc.next().charAt(0);

            switch (option) {
                case 'y' :
                case 'Y' :
                    if(employees[9] == null ) {
                        System.out.println("새로운 사원 정보를 입력합니다.");
                        break;
                    } else {
                        System.out.println("입력 가능한 총 사원수를 초과하였습니다!!");
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                default :
                    // 현재 기록된 사원들의 정보를 모두 출력
                    System.out.println("===============현재까지 기록된 사원들의 정보를 모두 출력합니다 ===============");
                    for (EmployeeDTO employee : employees) {
                        if(employee != null) System.out.println(employee.toString());
                    }
                    break Loop;
            }
        }

    }
}
