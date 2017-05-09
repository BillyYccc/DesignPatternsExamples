package copy.deepcopy;

import copy.Book;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Diary extends Book implements Cloneable {
    private String name;
    private int page;

    public Diary(String name, int page) {
        this.name = name;
        this.page = page;
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Diary diary = null;
        diary = (Diary) super.clone();
        diary.name = new String(name);
        return diary;
    }
}
