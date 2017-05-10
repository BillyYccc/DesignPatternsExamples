import copy.Book;
import copy.deepcopy.Bookshelf;
import copy.deepcopy.Diary;
import copy.deepcopy.Magazine;
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
