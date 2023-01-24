/* 1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
        Отделы для простоты должны быть названы от 1 до 5.
           2.Добавить статическую переменную-счетчик, которая будет отвечать за id.*/
        public class Employee {
            String surname;
            String name;
            String patronymic;
            int department;
            private int salary;
            public static int counter = 0;
            private final int id;

        /* 3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
           6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).*/
        public Employee (String surname, String name, String patronymic, int department, int salary) {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.department = department;
            this.salary = salary;
            id = counter++;
        }
        /* 4.Добавить возможность получать значения полей из Employee (геттеры) для всех полей.*/
        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPatronymic() {
            return patronymic;
        }
        public int getDepartment() {
             return department;
        }

        public int getSalary() {
            return salary;
        }

        public int getId() {
            return id;
        }

        public static int getCounter() {
            return counter;
        }
        /* 5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).*/

        public void setDepartment(int department) {
        this.department = department;
    }

        public void setSalary(int salary) {
                this.salary = salary;
            }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

}

