package copy.deepcopy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Bookshelf implements Cloneable {
    private ArrayList<Magazine> bookList;

    public ArrayList<Magazine> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Magazine> bookList) {
        this.bookList = bookList;
    }

    public Bookshelf(ArrayList<Magazine> bookList) {
        this.bookList = bookList;
        this.bookList.add(new Magazine("magazine1", 100));
        this.bookList.add(new Magazine("magazine2", 200));
        this.bookList.add(new Magazine("magazine3", 300));
        this.bookList.add(new Magazine("magazine4", 400));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bookshelf bookshelf = null;
        bookshelf = (Bookshelf) super.clone();

        ArrayList<Magazine> newBookList = new ArrayList<>();
        for (Magazine magazine : bookList) {
            try {
                newBookList.add(magazine.deepClone());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        bookshelf.setBookList(newBookList);
        return bookshelf;
    }
}
