package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",25,'M',25,"Developer",100000,true);
        employee2.setInfo("Anna",28,'F',2287,"QA",85000,true);
        employee3.setInfo("David",35,'M',2256,"QA",45000,false);
        employee4.setInfo("Lina",45,'F',2290,"Manager",80000,true);
        employee5.setInfo("Kevin", 35,'M', 2298, "Senior QA", 110000,true);
  
        
        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        
  int countFulltime = 0;
  int countPartTime =0;
  double max = employees[0].salary;
  double min = employees[0].salary;
  
  for(Employee employee : employees) {
      if (employee.isFullTime) {
          countFulltime++;
      }else {
          countPartTime++;
      }
      if (employee.salary >max) {
          max = employee.salary;
      }
      if (employee.salary < min){
          min = employee.salary;
      }
      
  }
        System.out.println("countFulltime = " + countFulltime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}