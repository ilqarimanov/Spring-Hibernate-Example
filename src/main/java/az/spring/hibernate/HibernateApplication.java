package az.spring.hibernate;

import az.spring.hibernate.config.SpringHibernateConfig;
import az.spring.hibernate.dao.EmployeeDao;
import az.spring.hibernate.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HibernateApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);

        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);

        Employee employee = new Employee();
        employee.setName("Ilqar");
        employee.setSurname("Imanov");
        employee.setAge(23);
        employee.setSalary(1500);



        employeeDao.insert(employee);

    }
}
