package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private Employee[] employees;
	
	private int employeeCount;
	
	public Company(int size) {
        this.employees = new Employee[size];
        this.employeeCount = 0;
    }
	
	@Override
	public void addPerson(Person person) {
		if(person instanceof Employee) {
			if(employeeCount < employees.length) {
				employees[employeeCount++] = (Employee) person;
				System.out.println("직원이 추가되었습니다 - " + person.getInfo());
			} else {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
		
	}

	@Override
	public void removePerson(String id) {
		int index = -1;
		
		for(int i = 0; i < employeeCount; i++) {
			if(employees[i].getId().equals(id)) {
				index = i;
				break;
			}
				
		}
		
		if(index != -1) {
			System.out.println("직원이 삭제되었습니다. " + employees[index].getInfo());
			
			for (int i = index; i < employeeCount - 1; i++) {
				employees[i] = employees[i + 1];
			}
			employees[--employeeCount] = null;
		} else {
			System.out.println("해당 id를 가진 직원이 없습니다.");
		}
		
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 :");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].getInfo());
        }
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
}
