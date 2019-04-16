package com.weder.java8.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.weder.java8.lambda.entity.Employee;

public class FunctionEmployeeAndThem {

	public static void main(String args[]){
		Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
		List<Employee> employeeList =
			Arrays.asList(new Employee("Sansa Stark", 15),
				        new Employee("Robb Stark", 25),
						new Employee("Margaery Tyrell", 28),
						new Employee("Ned Stark", 51),
						new Employee("Jon Snow", 24));

		System.out.println("Before List ");
		//initial function return 3 letters of words
		Function<String,String> initialFunction= (String s) -> s.substring(0,3);
		List<String> empNameListInitials=convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
		empNameListInitials.forEach(str->{System.out.print(" "+str);});
	}

	/*
	*@param List<Employee>
	*@param Function.identity()
	*@return List<Employee>
	**/
	public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
		List<String> empNameList=new ArrayList<String>();
		for(Employee emp:employeeList){
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
	}

}
