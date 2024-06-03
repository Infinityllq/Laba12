package ru.rsue.fomenkov.laba12.driodquest12;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookLab {
    private static BookLab sBookLab;
    private List<ru.rsue.fomenkov.laba12.driodquest12.Book> mBooks;
    public static BookLab get(Context context){
        if (sBookLab == null){
            sBookLab = new BookLab(context);
        }
        return sBookLab;
    }
    private BookLab(Context context){
        mBooks = new ArrayList<>();
//        for (int i = 0; i < 100; i++){
//            Book book = new Book();
//            book.setTitle("Book #"+ i);
//            book.setReaded(i % 2 ==0);// Для каждого второго объекта
//            mBooks.add(book);
//        }
    }
    public void addBook (ru.rsue.fomenkov.laba12.driodquest12.Book b){
        mBooks.add(b);
    }
    public List<ru.rsue.fomenkov.laba12.driodquest12.Book> getBooks(){
        return mBooks;
    }
    public ru.rsue.fomenkov.laba12.driodquest12.Book getBook(UUID id){
        for (ru.rsue.fomenkov.laba12.driodquest12.Book book : mBooks){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
}
