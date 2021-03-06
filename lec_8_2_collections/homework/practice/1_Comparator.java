Есть список сотрудников в разных филиалах банка и с разными должностями.
class Employee implements Comparable<Employee> {
	String name;
	String position;//значения в порядке убывания важности: руководитель, зам. руководителя, начальник отдела, старший сотрудник, сотрудник, стажер.
	String department;//в порядке убывания важности: центральный офис, региональный офис, областной офис, городской офис, районный офис.

	//compareTo реализовать
} 

Задача отсортировать список сотрудников в следующем порядке: сначала идут сотрудники более крупного подразделения, потом более мелкого. Сотрудников одного подразделения распечатывать в порядке убывания должности: сначала руководитель, потом подченные. Для сотруднико одинаковой должности и в одном офисе отсортировать по алфавиту.

Пример:
List<Employee> l
l.add(new Employee("Саша","сотрудник", "региональный офис"));
l.add(new Employee("Оля","зам. руководителя", "городской офис"));
l.add(new Employee("Сергей","стажер", "городской офис"));
l.add(new Employee("Катя","сотрудник", "региональный офис"));
l.add(new Employee("Игорь","руководитель", "региональный офис"));

Collections.sort(l)

Игорь руководитель региональный офис
Катя сотрудник региональный офис
Саша сотрудник региональный офис
Оля зам. руководителя городской офис
Сергей стажер городской офис