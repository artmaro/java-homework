Программе на вход подаются данные в формате csv (https://ru.wikipedia.org/wiki/CSV) следующего содержания:
String departments = "id_dep,dep_name\n" +
					 "1,IT\n" +
					 "2,Accounts\n"+
					 "3,Sales";
String employess = "id_emp,emp_name,id_dep\n"+
				   "1,Jack,1\n"+
				   "2,Anna,1\n"+
				   "3,Bob,2\n"+
				   "4,Kathy,3\n"+
				   "5,Nick,2";

ПРИМЕЧАНИЕ в csv текст экранируется кавычками. Это можно не учитывать в вашей программе.

Данные представляют из себя два списка: сотрудников и подразделения предприятия.

Задача расчитать(распарсить/разобрать) эти данные в следующую структуру в java:(заголов id_dep,dep_name и id_emp,emp_name,id_dep надо отбросить )
class Employee{
	int id;
	String name;
}

class Department{
	int id;
	int name;
	List<Employee> employes;
}

После разбора вы должны получить объект List<Department> departments и список ошибок разбора.
Список ошибок разбора можно представить структурой:
List<ParseError> errors

class ParseError{
	String line;
	String errorText;
}

Ваша задача учесть ошибки которые могут возникать при неправиль переданных данных.
Примеры ошибок:
1. Забыли указать заголовок
String departments = 
					 "1,IT\n" + //error  первая строка должна быть заголовком id_dep,dep_name
					 "2,Accounts\n"+
					 "3,Sales";
String employess = 
				   "1,Jack,1\n"+ //error первая строка должна быть заголовком id_emp,emp_name,id_dep 
				   "2,Anna,1\n"+
				   "3,Bob,2\n"+
				   "4,Kathy,3\n"+
				   "5,Nick,2";

2. Число полей в строке не совпадает с заданной структурой:

String departments = "id_dep,dep_name\n" +
					 "1,IT,str. 123, 125200\n" + //error
					 "2,Accounts\n"+
					 "3,Sales";
String employess = "id_emp,emp_name,id_dep\n"+
				   "1,Jack,1\n"+
				   "2,Anna,1\n"+
				   "3,Bob,2\n"+
				   "4,Kathy\n"+ //error
				   "5,Nick,2";
3. В поле id содержится текст

String departments = "id_dep,dep_name\n" +
					 "1,IT\n" +
					 "asd,Accounts\n"+ //error
					 "3,Sales";
String employess = "id_emp,emp_name,id_dep\n"+
				   "1,Jack,1\n"+
				   "asdasd,Anna,1\n"+ //error
				   "3,Bob,2\n"+
				   "4,Kathy,3\n"+
				   "5,Nick,2";

4. Сотрудник ссылается на несуществующее продразделение
String departments = "id_dep,dep_name\n" +
					 "1,IT\n" +
					 "2,Accounts\n"+
					 "3,Sales";
String employess = "id_emp,emp_name,id_dep\n"+
				   "1,Jack,1\n"+
				   "2,Anna,1\n"+
				   "3,Bob,2\n"+
				   "4,Kathy,5\n"+ //error
				   "5,Nick,5";		//error