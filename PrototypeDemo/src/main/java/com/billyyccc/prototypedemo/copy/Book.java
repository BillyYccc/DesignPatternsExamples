package com.billyyccc.prototypedemo.copy;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Book {
    private String name;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public static void compareCopyMethod(Book book1, Book book2) {
        if (book1.getPage() == book2.getPage() && book1.getName().equals(book2.getName())) {
            System.out.println(book1.getName() == book2.getName() ? "本次拷贝是浅拷贝的..." : "本次拷贝是深拷贝的...");
        } else {
            System.out.println("拷贝内容出错...");
        }
    }
}
