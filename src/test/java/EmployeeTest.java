import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void employeeNameTest() {
        Employee employee = new Employee();
        employee.setName("Agnese");
        Assert.assertEquals(employee.getName(), "Agnese");
    }

    @Test
    public void employeeSurnameTest() {
        Employee employee = new Employee();
        employee.setSurname("Brudere");
        Assert.assertEquals(employee.getSurname(), "Brudere");
    }

    @Test
    public void employeeYearTest() {
        Employee employee = new Employee();
        employee.setYear(34);
        Assert.assertEquals(employee.getYear(), 34);
    }

    @Test
    public void employeeRoleTest() {
        Employee employee = new Employee();
        employee.setRole("QA");
        Assert.assertEquals(employee.getRole(), "QA");
    }

    @Test
    public void testAllArguments() {
        Employee employee = new Employee("Agnese", "Brudere", 34, "QA");
        Assert.assertEquals(employee.getName(), "Agnese");
        Assert.assertEquals(employee.getSurname(), "Brudere");
        Assert.assertEquals(employee.getYear(), 34);
        Assert.assertEquals(employee.getRole(), "QA");

    }
}
