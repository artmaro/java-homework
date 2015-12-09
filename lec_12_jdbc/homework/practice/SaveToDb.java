Модифицированное задание из практики 3.
Программе на вход подаются файл в формате csv (https://ru.wikipedia.org/wiki/CSV) следующего содержания:
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

Задача считать(распарсить/разобрать) эти данные и сохранить их в базу данных(Postgres, my sql, h2 или любую другую).
Примерный вид таблиц:
create table Departments (
	id int, name varchar(100)
	)

create table Employees (
	id int, name varchar(100), department_id int
	)

Ошибки разбора можно поместить в таблицу 
create table ParseError(
	msg varchar(1000)
	)

Ваша задача учесть ошибки которые могут возникать при неправиль переданных данных.