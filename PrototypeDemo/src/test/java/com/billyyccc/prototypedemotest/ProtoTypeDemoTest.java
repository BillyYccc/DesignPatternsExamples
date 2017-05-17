/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.prototypedemotest;

import com.billyyccc.prototypedemo.*;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ProtoTypeDemoTest {
    @Test
    public void prototypeDemoDocumentTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Document document1 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document1.getInfo());
        System.out.println(document1.toString());

        Document document2 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document2.getInfo());
        System.out.println(document2.toString());

        Document document3 = (Document) academicPrinter.printFileTemplate("document");
        System.out.println(document3.getInfo());
        System.out.println(document3.toString());
    }

    @Test
    public void prototypeDemoPaperTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Paper paper1 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper1.getInfo());
        System.out.println(paper1.toString());

        Paper paper2 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper2.getInfo());
        System.out.println(paper2.toString());

        Paper paper3 = (Paper) academicPrinter.printFileTemplate("paper");
        System.out.println(paper3.getInfo());
        System.out.println(paper3.toString());
    }

    @Test
    public void prototypeDemoReportTest() throws CloneNotSupportedException {
        Printer academicPrinter = ConcretePrinter.getInstance();

        Report report1 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report1.getInfo());
        System.out.println(report1.toString());

        Report report2 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report2.getInfo());
        System.out.println(report2.toString());

        Report report3 = (Report) academicPrinter.printFileTemplate("report");
        System.out.println(report3.getInfo());
        System.out.println(report3.toString());
    }

}
