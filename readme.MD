# Starting from the provided template, implement a program that follows the specifications below:

![Sample image](docs/sample.jpg)

[//]: # (- Create the classes described in the diagram,elements inside and represent relationships between them. &#40;4p&#41;)

[//]: # ()

[//]: # (- Extend the program to not allow duplicate employees based on the employeeId. &#40;1p&#41;)

[//]: # ()

[//]: # (- Use the predefined Set from EmployeeManger to store and manage employees, add three employees with id and salary, and assign a name to each. &#40;1p&#41;)

[//]: # ()

[//]: # (- Display all the employees names and salary. &#40;1p&#41;)

[//]: # ()

[//]: # (- Implement a method to calculate the average salary of all employees and display the average. &#40;1p&#41;)

[//]: # ()

[//]: # (- Write unit tests to verify the correctness of the average salary calculation &#40;1p&#41;.)

- Create the classes described in the diagram,elements inside and represent relationships between them. (3p)

- Extend the program to not allow duplicate customers based on the customerId. (1p)

- Use the predefined Set from CustomerManager to store and manage customers, add five customers with id and
  totalSpending, and assign a name to each. (1p)

- Display all customer names sorted alphabetically with their totalSpending. (1p)

- Implement a method findByEmail(String email) in CustomerManager that returns the customer with the given email.
  The search must be case-insensitive and ignore leading/trailing spaces. (1p)

[//]: # (  )
[//]: # (- Implement getCustomersBySpendingAbove&#40;int amount&#41; that returns all customers with totalSpending greater than the given value,)

[//]: # (sorted descending by totalSpending.)

- Implement updateSpendingByEmail(String email, int amount) that increases the customer’s 
  total spending identified by email (case-insensitive). (1p)

- Write unit tests to verify: (1p)
  Customers with duplicate emails are not added.