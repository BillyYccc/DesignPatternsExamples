import org.junit.Test;
import shallowcopy.Book;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class ShallowCopyTest {
    @Test
    public void shallowCopyTest() throws CloneNotSupportedException {
        Book book1 = new Book("Think In Java", 800);
        Book book2 = (Book) book1.clone();

        compareCopyMethod(book1, book2);
    }

    public static void compareCopyMethod(Book book1, Book book2) {
        if ((book1.getPage() == book2.getPage())
                && (book1.getName().equals(book2.getName()))
                && (book1.getName() == book2.getName())) {
            System.out.println("本次拷贝是浅拷贝的...");
        } else {
            System.out.println("本次拷贝是深拷贝的...");
        }
    }
}
