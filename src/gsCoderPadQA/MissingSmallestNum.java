package gsCoderPadQA;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingSmallestNum {

    public static void main(String[] args) {
    //    Sorted by length of String "Apple", "Banana", "cherry", "Kiwi"
        List<String> ls = List.of("Apple", "Banana", "cherry", "Kiwi");
        ls.stream().sorted((a,b)->b.length()-a.length()).forEach(System.out::println);

//         Employee e1 = new Employee("Ram", new BigDecimal(2));
//        Employee e2 = new Employee("Ram", new BigDecimal(2));
//        hashSet.add(e1,e2);

        //emp_id,emp_name,mang_id
        //select emp_name from emp where emp_id=(select ;


        List<Employee> ls1 = List.of(new Employee("ramesh",new BigDecimal(5000)),new Employee("ramesh",new BigDecimal(1000)),new Employee("ramesh",new BigDecimal(2000)),new Employee("ramesh",new BigDecimal(3000)));
        BigDecimal res = ls1.stream().map(x->x.getSalary()).reduce(new BigDecimal(0),(x,y)->x.add(y));
        System.out.println(res);

    }
    //


}

class Employee {
    private final String name;
    private final BigDecimal salary;

    public Employee(String name, BigDecimal salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }



}

