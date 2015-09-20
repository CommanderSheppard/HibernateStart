package DAO;

import java.sql.SQLException;
import java.util.List;

import logic.Book;

public interface BookDAO {
    public void addBook (Book book) throws SQLException;   //добавить книгу
    public void updateBook (Book book)  throws SQLException;//обновить книгу
    public Book getBooktById(int id) throws SQLException;    //получить книгу по id
    public List getAllBooks() throws SQLException;              //получить все книги
    public void deleteBook (Book book) throws SQLException;//удалить книгу
}