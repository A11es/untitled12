public class InfoEmployee{
        public static void main(String[] args) {
                Employee[] employees = new Employee[5];
                employees[0] = new Employee("HHH", "1", "1", "89997654321", 30000, 35);
                employees[1] = new Employee("AAA", "2", "2", "89991234567", 25000, 44);
                employees[2] = new Employee("DDD", "3", "3", "89993456765", 27000, 34);
                employees[3] = new Employee("KKK", "4", "4", "87771234567", 40000, 49);
                employees[4] = new Employee("LLL", "5", "5", "89996544567", 20000, 27);

                for (Employee employee : employees) {
                        if (employee.getAge() > 40){
                                employee.printInfo();
                        }
                }

        }
}
