package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//System.out.println("==== TEST 1: Department insert ====");
		Department dep = new Department(null, "Foods");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New id = " + newDepartment.getId());
		
		//System.out.println("==== TEST 2: Department update ====");
		//dep = departmentDao.findById(5);
		//dep.setName("Foods");
		//departmentDao.update(dep);
		//System.out.println("Update completed");
		
		//System.out.println("\n ==== TEST 3: Department findById ====");
		//dep = departmentDao.findById(1);
		//System.out.println(dep);
		
		//System.out.println("\n ==== TEST 4: Department delete ====");
		//System.out.println("Enter id for delete test: ");
		//int id = sc.nextInt();
		//departmentDao.deleteById(id);
		//System.out.println("Delete completed");
		
		System.out.println("\n ==== Test 5 findAll ====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
				
		sc.close();
	}

}
