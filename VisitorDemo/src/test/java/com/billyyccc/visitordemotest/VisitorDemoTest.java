package com.billyyccc.visitordemotest;

import com.billyyccc.visitordemo.element.Hamlet;
import com.billyyccc.visitordemo.element.TragedyOfShakespeare;
import com.billyyccc.visitordemo.visitor.StudentA;
import com.billyyccc.visitordemo.visitor.StudentB;
import com.billyyccc.visitordemo.visitor.TeacherA;
import com.billyyccc.visitordemo.visitor.TeacherB;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

public class VisitorDemoTest {
    @Test
    public void differentPeopleReadHamletTest() {
        TragedyOfShakespeare hamlet = new Hamlet();

        //开始阅读
        System.out.println("-----学生A开始读《哈姆雷特》-----");
        hamlet.accept(new StudentA());
        System.out.println("-----学生B开始读《哈姆雷特》-----");
        hamlet.accept(new StudentB());
        System.out.println("-----老师A开始读《哈姆雷特》-----");
        hamlet.accept(new TeacherA());
        System.out.println("-----老师B开始读《哈姆雷特》-----");
        hamlet.accept(new TeacherB());
    }
}
