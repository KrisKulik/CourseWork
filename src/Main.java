public class Main {
    /* 7. Создать внутри класса с методом main поле типа Employee[10],
    которое будет выполнять роль «хранилища» для записей о сотрудниках.
       8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:

        a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).*/
    public static void printEmployeeList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    /* b. Посчитать сумму затрат на зарплаты в месяц. */
    public static int calculateSpendingPerMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    /* c. Найти сотрудника с минимальной зарплатой.*/
    public static Employee findMinSalary (Employee [] employees) {
        Employee output = employees [0];
        int minSalary = output.getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                output = employee;
            }
        }
        return output;
    }
    /* d. Найти сотрудника с максимальной зарплатой.*/
    public static Employee findMaxSalary (Employee [] employees) {
        Employee output = employees [0];
        int maxSalary = output.getSalary();
        for (Employee employee: employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                output = employee;
            }
        }
        return output;
    }
    /* e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).*/
    public static double calculateAverageSalary (Employee [] employees) {
        return calculateSpendingPerMonth(employees) / Employee.getCounter();
    }
    /* 6. Получить Ф. И. О. всех сотрудников (вывести в консоль). */
    public static void printNames (Employee [] employees) {
        for (Employee employee: employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }
    public static void printSpace() {
        System.out.println(" ");
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Лавров", "Сергей", "Викторович", 1, 20_000);
        employees[1] = new Employee("Песков", "Дмитрий", "Сергеевич", 1, 20_000);
        employees[2] = new Employee("Небензя", "Василий", "Алексеевич", 2, 25_000);
        employees[3] = new Employee("Медведев", "Дмитрий", "Анатольевич", 2, 25_000);
        employees[4] = new Employee("Рогозин", "Дмитрий", "Олегович", 3, 30_000);
        employees[5] = new Employee("Пригожин", "Евгений", "Викторович", 3, 30_000);
        employees[6] = new Employee("Шойгу", "Сергей", "Кужугетович", 4, 35_000);
        employees[7] = new Employee("Володин", "Вячеслав", "Викторович", 4, 35_000);
        employees[8] = new Employee("Мишустин", "Михаил", "Владимирович", 5, 40_000);
        employees[9] = new Employee("Собянин", "Сергей", "Семенович", 5, 40_000);

        printEmployeeList(employees);
        printSpace();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSpendingPerMonth(employees));
        printSpace();
        System.out.println("Сотрудник с минимальной зарплатой: " + findMinSalary(employees));
        printSpace();
        System.out.println("Сотрудник с максимальной зарплатой: " + findMaxSalary(employees));
        printSpace();
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary(employees));
        printSpace();
        printNames(employees);
        printSpace();
    }
}