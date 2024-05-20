public class TestClasses {
    public static void main(String[] args) {
        Person person = new Person("sahrul", "cilimus", "34534634", "sahrul@gmail.com");
        Student student = new Student("tio", "gerlong", "34634131", "tio@gmail.com", Student.MahasiswaTahunKedua);
        MyDate dateHired = new MyDate(2020, 5, 15);
        Employee employee = new Employee("opal", "setiabudi", "1351354", "opal@gmail.com", "Office boy", 50000, dateHired);
        Faculty faculty = new Faculty("irpan", "cempaka", "436242", "irpan@gmail.com", "Office girl", 60000, dateHired, 10, "Professor");
        Staff staff = new Staff("fatih", "gerlong", "234523", "fatih@gmail.com", "Office bay", 40000, dateHired, "Manager");

        System.out.println("Person Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhoneNumber());
        System.out.println("Email: " + person.getEmailAddress());
        System.out.println();

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Email: " + student.getEmailAddress());
        System.out.println("Status: " + student.getStatus());
        System.out.println();

        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Phone: " + employee.getPhoneNumber());
        System.out.println("Email: " + employee.getEmailAddress());
        System.out.println("Office: " + employee.getOffice());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Date Hired: " + employee.getDateHired());
        System.out.println();

        System.out.println("Faculty Information:");
        System.out.println("Name: " + faculty.getName());
        System.out.println("Address: " + faculty.getAddress());
        System.out.println("Phone: " + faculty.getPhoneNumber());
        System.out.println("Email: " + faculty.getEmailAddress());
        System.out.println("Office: " + faculty.getOffice());
        System.out.println("Salary: " + faculty.getSalary());
        System.out.println("Date Hired: " + faculty.getDateHired());
        System.out.println("Office Hours: " + faculty.getOfficeHours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();

        System.out.println("Staff Information:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("Phone: " + staff.getPhoneNumber());
        System.out.println("Email: " + staff.getEmailAddress());
        System.out.println("Office: " + staff.getOffice());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println("Date Hired: " + staff.getDateHired());
        System.out.println("Title: " + staff.getTitle());
    }
}
