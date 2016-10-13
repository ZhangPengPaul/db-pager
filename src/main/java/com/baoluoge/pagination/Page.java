package com.baoluoge.pagination;

import java.util.List;

/**
 * Created by PaulZhang on 2016/10/13.
 */
public class Page<E> {
    private boolean previous;
    private boolean next;
    private List<E> items;
    private int index;
    private PageContext<E> pageContext;

    public boolean isPrevious() {
        return previous;
    }

    public void setPrevious(boolean previous) {
        this.previous = previous;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public List<E> getItems() {
        return items;
    }

    public void setItems(List<E> items) {
        this.items = items;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public PageContext<E> getPageContext() {
        return pageContext;
    }

    public void setPageContext(PageContext<E> pageContext) {
        this.pageContext = pageContext;
    }
}
