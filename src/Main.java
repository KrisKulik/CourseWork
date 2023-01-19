import java.util.Arrays;
/* Создать внутри класса с методом main поле типа Employee[10],
    которое будет выполнять роль «хранилища» для записей о сотрудниках.*/
public class Main {
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

        System.out.println("Ф.И.О.: " + employees[0].getSurname() + " " + employees[0].getName() + " " + employees[0].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[0].getDepartment()) + " " + "Оклад: " + employees[0].getSalary() + " " + "id = " + employees[0].getId());
        System.out.println("Ф.И.О.: " + employees[1].getSurname() + " " + employees[1].getName() + " " + employees[1].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[1].getDepartment()) + " " + "Оклад: " + employees[1].getSalary() + " " + "id = " + employees[1].getId());
        System.out.println("Ф.И.О.: " + employees[2].getSurname() + " " + employees[2].getName() + " " + employees[2].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[2].getDepartment()) + " " + "Оклад: " + employees[2].getSalary() + " " + "id = " + employees[2].getId());
        System.out.println("Ф.И.О.: " + employees[3].getSurname() + " " + employees[3].getName() + " " + employees[3].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[3].getDepartment()) + " " + "Оклад: " + employees[3].getSalary() + " " + "id = " + employees[3].getId());
        System.out.println("Ф.И.О.: " + employees[4].getSurname() + " " + employees[4].getName() + " " + employees[4].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[4].getDepartment()) + " " + "Оклад: " + employees[4].getSalary() + " " + "id = " + employees[4].getId());
        System.out.println("Ф.И.О.: " + employees[5].getSurname() + " " + employees[5].getName() + " " + employees[5].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[5].getDepartment()) + " " + "Оклад: " + employees[5].getSalary() + " " + "id = " + employees[5].getId());
        System.out.println("Ф.И.О.: " + employees[6].getSurname() + " " + employees[6].getName() + " " + employees[6].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[6].getDepartment()) + " " + "Оклад: " + employees[6].getSalary() + " " + "id = " + employees[6].getId());
        System.out.println("Ф.И.О.: " + employees[7].getSurname() + " " + employees[7].getName() + " " + employees[7].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[7].getDepartment()) + " " + "Оклад: " + employees[7].getSalary() + " " + "id = " + employees[7].getId());
        System.out.println("Ф.И.О.: " + employees[8].getSurname() + " " + employees[8].getName() + " " + employees[8].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[8].getDepartment()) + " " + "Оклад: " + employees[8].getSalary() + " " + "id = " + employees[8].getId());
        System.out.println("Ф.И.О.: " + employees[9].getSurname() + " " + employees[9].getName() + " " + employees[9].getPatronymic() + " " + "Отдел: = " + Arrays.toString(employees[9].getDepartment()) + " " + "Оклад: " + employees[9].getSalary() + " " + "id = " + employees[9].getId());
    }
    public static int calculateSpendingPerMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        System.out.println(sum);
        return sum;

    }


}