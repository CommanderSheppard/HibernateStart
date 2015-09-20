package logic;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Book")
public class Book {


    private String name;
    private String author;
    private int year;
    private int id;

    public Book() {

    }


    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column (name = "id")
    public int getId() {
        return id;
    }

    @Column (name = "year")
    public int getYear() {
        return year;
    }

    @Column (name = "name")
    public String getName() {
        return name;
    }

    @Column (name = "author")
    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAuthor(String author) {
        this.author = author;
    }
}
