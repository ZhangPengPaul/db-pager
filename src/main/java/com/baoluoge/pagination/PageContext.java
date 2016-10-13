package com.baoluoge.pagination;

/**
 * Created by PaulZhang on 2016/10/13.
 */
public interface PageContext<E> {
    public static final int DEFAULT_PAGE_SIZE = 20;

    long getPageCount();

    Page<E> getPage(int index);

    int getPageSize();

    long getTotal();

}
