package com.weder.java8.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.weder.java8.lambda.entity.Employee;

public class FunctionEmployee {

	public static void main(String args[]){
		Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
		List<Employee> employeeList =
			Arrays.asList(new Employee("Sansa Stark", 15),
				        new Employee("Robb Stark", 25),
						new Employee("Margaery Tyrell", 28),
						new Employee("Ned Stark", 51),
						new Employee("Jon Snow", 24));

		System.out.println("Before List ");
		employeeList.forEach(action ->{System.out.println(action.getName());});
		//call method: applyIdentityToEmpList
		System.out.println("After List ");
		List<Employee> empNameListInitials = applyIdentityToEmpList(employeeList, Function.identity());
		empNameListInitials.forEach(action2 ->{System.out.println("Employee Name: "+ action2.getName() +" Age: "+action2.getAge());});
	}

	/*
	*@param List<Employee>
	*@param Function.identity()
	*@return List<Employee>
	**/
	public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> funcEmpToEmp){
		List<Employee> empNameList = new ArrayList<Employee>();
		for(Employee emp:employeeList){
			empNameList.add(funcEmpToEmp.apply(emp));
		}
		return empNameList;
	}

}
