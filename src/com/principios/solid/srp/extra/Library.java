package com.principios.solid.srp.extra;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Loans loans = new Loans();

    public void addBook(Book book){
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }

    public boolean loanBook(int userId,String bookTitle){
        User user = getUser(userId);
        Book book = getBook(bookTitle);
        return user != null && book != null ? loans.loan_book(user, book) : false;
    }

    public boolean returnBook(int userId,String bookTitle){
        User user = getUser(userId);
        Book book = getBook(bookTitle);
        return user != null && book != null ? loans.returnBook(user, book) : false;
    }

    private Book getBook(String bookTitle) {
        for (var book : books)
            if (book.title.equals(bookTitle))
                return book;
        return null;
    }

    private User getUser(int userId) {
        for (var user : users)
            if (user.id == userId)
                return user;
        return null;
    }
}
