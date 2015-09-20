package DAO;

import java.sql.SQLException;
import java.util.List;

import logic.Book;

public interface BookDAO {
    public void addBook (Book book) throws SQLException;   //�������� �����
    public void updateBook (Book book)  throws SQLException;//�������� �����
    public Book getBooktById(int id) throws SQLException;    //�������� ����� �� id
    public List getAllBooks() throws SQLException;              //�������� ��� �����
    public void deleteBook (Book book) throws SQLException;//������� �����
}