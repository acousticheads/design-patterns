package creational.e_prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeRegistry {

    List<Object> objectList = new ArrayList<>();

    public void createRegistry() {

        Employee employee = new Employee(1, "Sam");
        Student student = new Student(1, "Sama");

        objectList.add(employee);
        objectList.add(student);

    }

    public Object getObject(String objName) throws CloneNotSupportedException {

        if (objName.equals("employee")) {
            Employee employee = (Employee) objectList.get(0);
            return employee.clone();
        } else if (objName.equals("student")) {
            Student employee = (Student) objectList.get(1);
            return employee.clone();
        }
        return null;
    }


}
