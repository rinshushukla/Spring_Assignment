package com.example.demo.Controller;

import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/addemp")
    public String addEmployee(@RequestBody String requestBody) {
        String responseMessage = "Request is Not Check";
        try {
            // Parse the JSON request body
            JSONObject object = new JSONObject(requestBody);
            String firstName = object.optString("name");
            String lastName = object.optString("lname"); // Corrected the key from 'lanme' to 'lname'
            String position = object.optString("position");

            // Debugging: Print parsed values
            System.out.println("Parsed JSON - FirstName: " + firstName + ", LastName: " + lastName + ", Position: " + position);

            // Create the Employee object
            Employee employee = new Employee();
            employee.setEfirstname(firstName);
            employee.setElastname(lastName);
            employee.setPosition(position);

            // Save the employee using the service
            employeeService.addEmployee(employee);

            // If saving is successful, update the response message
            responseMessage = "Data Added";
        } catch (Exception e) {
            e.printStackTrace();
            // Debugging: Print exception message
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return responseMessage;
    }

	@GetMapping("/Employee")
	public List<Employee> getAllEmployee() {
		System.out.println("Employe Added Succesfully ");
		return employeeService.getAllEmployee();

	}
	@GetMapping("/Employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findEmployeeById(id);
		
	}

}
