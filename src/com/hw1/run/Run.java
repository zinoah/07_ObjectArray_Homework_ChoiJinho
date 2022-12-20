package com.hw1.run;

import com.hw1.medel.vo.Employee;



public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		//객체배열을 크기 3 으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		
	    emp[0] = new Employee();
	    
	    emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
	    
	    emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
	    for(int i = 0; i < emp.length; i++) {
		System.out.printf("emp[%d] : %s\n" , i , emp[i].information());
		
	    }
		
	    System.out.println("=================================================================");
		//3개의 객체 중 값이 없는 필드에 각각 넣은 뒤 출력
		
	    emp[0].setEmpNo(0);
	    emp[0].setEmpName("김말똥");
	    
	
	
		//직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		//연봉 = (급여 + 보너스포인트)) *12
		

	
	
		//3명의 직원의 연봉 평균을 구하여 출력
	}

}
