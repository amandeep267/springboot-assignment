//package com.springbootProject.demo.entity;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name="student")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Column(name="id")
//    private int id;
//    @Column(name="first_name")
//    private String firstName;
//    @Column(name="last_name")
//    private String lastName;
//    @Column(name="email")
//    private String email;
//
//
//
//
//    @OneToMany(mappedBy = "student",  cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    private List<StudentBookList> books;
//
//    public Student()
//    {
//
//    }
//
//    public Student(String f, String l, String e) {
//        this.firstName=f;
//        this.lastName=l;
//        this.email=e;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public List<StudentBookList> getBooks() {
//        return books;
//    }
//
//    public void setBooks(List<StudentBookList> books) {
//        this.books = books;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
