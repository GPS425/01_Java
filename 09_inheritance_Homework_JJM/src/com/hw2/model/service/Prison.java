package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	private Prisoner[] prisoners;
	
	private int prisonerCount;
	
	public Prison(int size) {
		this.prisoners = new Prisoner[size];
        this.prisonerCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner) {
			if(prisonerCount < prisoners.length) {
				prisoners[prisonerCount++] = (Prisoner) person;
				System.out.println("수감자가 추가되었습니다 - " + person.getInfo());
			} else {
				System.out.println("인원이 모두 충원되었습니다.");
			}
		}
	}

	@Override
	public void removePerson(String id) {
		int index = -1;
		
		for(int i = 0; i < prisonerCount; i++) {
			if(prisoners[i].getId().equals(id)) {
				index = i;
				break;
			}
				
		}
		
		if(index != -1) {
			System.out.println("수감자가 삭제되었습니다. " + prisoners[index].getInfo());
			
			for (int i = index; i < prisonerCount - 1; i++) {
				prisoners[i] = prisoners[i + 1];
			}
			prisoners[--prisonerCount] = null;
		} else {
			System.out.println("해당 id를 가진 수감자가 없습니다.");
		}
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 :");
        for (int i = 0; i < prisonerCount; i++) {
            System.out.println(prisoners[i].getInfo());
        }
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
}
