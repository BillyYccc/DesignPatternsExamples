package com.billyyccc.prototypedemotest;

import com.billyyccc.prototypedemo.copy.Book;
import com.billyyccc.prototypedemo.copy.shallowcopy.Newspaper;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ShallowCopyTest {
    @Test
    public void shallowCopyTest() throws CloneNotSupportedException {
        System.out.print("执行Newspaper的拷贝...");

        Newspaper newspaper1 = new Newspaper("Think In Java", 800);
        Newspaper newspaper2 = (Newspaper) newspaper1.clone();

        Book.compareCopyMethod(newspaper1, newspaper2);
    }
}
