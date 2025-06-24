package com.principios.solid.s.extra;

import java.util.ArrayList;
import java.util.HashMap;

public class Loans {
    HashMap<Integer, ArrayList<Book>> loans = new HashMap<>();

    public boolean loan_book(User user, Book book){
        ArrayList<Book> books = loans.getOrDefault(user.id, new ArrayList<>());
        if (book.copies > 0 && books.add(book)){
            book.copies--;
            loans.put(user.id, books);
            return true;
        }return false;
    }

    public boolean returnBook(User user,Book book){
        ArrayList<Book> books = loans.get(user.id);
        if (!books.isEmpty() && books.remove(book)){
            book.copies++;
            loans.put(user.id, books);
            return true;
        }return false;
    }
}
