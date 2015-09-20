package DAO;

import DAO.Impl.BookDAOImpl;
import DAO.Impl.StudentDAOImpl;

public class Factory {

    private static StudentDAO studentDAO = null;
    private static BookDAO bookDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public StudentDAO getStudentDAO() {
        if (studentDAO == null) {
            studentDAO = new StudentDAOImpl();
        }
        return studentDAO;
    }

    public BookDAO getBookDAO() {
        if (bookDAO == null) {
            bookDAO = new BookDAOImpl();
        }
        return bookDAO;
    }
}