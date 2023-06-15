# TesteTecnicoTokenServiceSql
Desafio para fazer uma aplicação spring usando apenas Sql



Assume a system with two tables, PARENT and CHILD, with the following content
PARENT:
Id Name
1 John
2 Paul
3 Mary
4 Lucy
5 Mark
CHILD:
Id Name FATHER_ID MOTHER_ID
1 John 1 3
2 Paul 1 3
3 Lucy 2 4
4 Claire 1 4
5 Simon NULL 4


Write SpringBoot WebMVC REST Service that returns:
1. A list of all FATHER names
2. All FATHER names that have mor than one child
3. For every CHILD, the name of his/her father and mother, if defined
4. How many children John has
5. How many children Mary has
