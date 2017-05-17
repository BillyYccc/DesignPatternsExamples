/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.prototypedemotest;

import com.billyyccc.prototypedemo.copy.Book;
import com.billyyccc.prototypedemo.copy.deepcopy.Bookshelf;
import com.billyyccc.prototypedemo.copy.deepcopy.Diary;
import com.billyyccc.prototypedemo.copy.deepcopy.Magazine;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class DeepCopyTest {
    public boolean isShallowCopy;

    @Test
    public void deepCopyStringTest() throws CloneNotSupportedException {
        System.out.print("执行Diary的拷贝...");

        Diary diary1 = new Diary("人民的名义", 500);
        Diary diary2 = (Diary) diary1.clone();

        Book.compareCopyMethod(diary1, diary2);
    }

    @Test
    public void deepCopyArrayListTest() throws CloneNotSupportedException {
        System.out.print("执行Bookshelf的拷贝...");

        ArrayList<Magazine> arrayList = new ArrayList<>();
        Bookshelf bookshelf1 = new Bookshelf(arrayList);
        Bookshelf bookshelf2 = (Bookshelf) bookshelf1.clone();

        for (int i = 0; i < bookshelf1.getBookList().size(); i++) {
            if (bookshelf1.getBookList().get(i).getName().equals(bookshelf2.getBookList().get(i).getName())) {
                isShallowCopy = bookshelf1.getBookList().get(i) == bookshelf2.getBookList().get(i);
            } else {
                System.out.println("拷贝方式出错...");
            }
        }

        if (isShallowCopy) {
            System.out.println("本次拷贝方式为浅拷贝...");
        } else {
            System.out.println("本次拷贝方式为深拷贝...");
        }
    }

    @Test
    public void deepCopyInSerializationTest() throws IOException, ClassNotFoundException {
        System.out.print("执行Magazine的拷贝...");
        Magazine magazine1 = new Magazine("Times", 50);
        Magazine magazine2 = magazine1.deepClone();

        Book.compareCopyMethod(magazine1, magazine2);
    }
}
