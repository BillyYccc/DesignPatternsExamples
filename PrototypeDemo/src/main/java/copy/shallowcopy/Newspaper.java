package copy.shallowcopy;

import copy.Book;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Newspaper extends Book implements Cloneable {
    private String name;
    private int page;

    public Newspaper(String name, int page) {
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
        return super.clone();
    }
}
