package main;

import java.sql.SQLException;
import java.util.List;

import logic.Book;
import logic.Student;

import DAO.Factory;

public class Main {

    public static void main(String[] args) throws SQLException {
        //Создадим двух студентов
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Book someBook = new Book();
        someBook.setAuthor("King");
        someBook.setName("White power");
        someBook.setYear(1488);

        //Проинициализируем их
        s1.setName("Ivanov Ivan");
        s1.setAge(21L);
        s2.setName("Petrova Alisa");
        s2.setAge(23L);
        s3.setName("Papusha Andrew");
        s3.setAge(25L);
        s4.setName("Marchuk Sanya");
        s4.setAge(32L);
        s5.setName("Mozgoviy Igor");
        s5.setAge(19L);

        //Сохраним их в бд, id будут сгенерированы автоматически
        Factory.getInstance().getStudentDAO().addStudent(s1);
        Factory.getInstance().getStudentDAO().addStudent(s2);
        Factory.getInstance().getStudentDAO().addStudent(s3);
        Factory.getInstance().getStudentDAO().addStudent(s4);
        Factory.getInstance().getStudentDAO().addStudent(s5);
        Factory.getInstance().getBookDAO().addBook(someBook);

        s5.setName("BANNED");
        s5.setAge(11L);
        Factory.getInstance().getStudentDAO().updateStudent(s5);

        List<Book> books = Factory.getInstance().getBookDAO().getAllBooks();
        for (int i = 0; i <books.size() ; i++) {
            System.out.println(books.get(i).getAuthor() +" " +  books.get(i).getName()  + " " + books.get(i).getYear() + "\\o" );
        }


        //Выведем всех студентов из бд
        List<Student> studs = Factory.getInstance().getStudentDAO().getAllStudents();
       /* for (int i = 0; i <studs.size() ; i++) {
            Factory.getInstance().getStudentDAO().deleteStudent(studs.get(i));
        }
        for (int i = 0; i <studs.size() ; i++) {
            Factory.getInstance().getStudentDAO().deleteStudent(studs.get(i));
        }*/


        System.out.println("========Все студенты=========");
        for (int i = 0; i < studs.size(); ++i) {
            System.out.println("Имя студента : " + studs.get(i).getName() + ", Возраст : " + studs.get(i).getAge() + ",  id : " + studs.get(i).getId());
            System.out.println("=============================");
        }
    }
}