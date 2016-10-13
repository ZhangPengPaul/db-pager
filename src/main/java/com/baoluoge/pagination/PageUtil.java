package com.baoluoge.pagination;

import java.util.List;

/**
 * Created by PaulZhang on 2016/10/13.
 */
public class PageUtil {

    private PageUtil() {

    }

    public static int getPageStart(int pn, int size) {
        return (pn - 1) * size;
    }

    public static int getPageStart(int total, int pn, int size) {
        int start = (pn - 1) * size;
        if (start >= total) {
            start = 0;
        }

        return start;
    }

    public static <E> Page getPage(long total, int pn, List<E> items, int size) {
        PageContext pageContext = new QuickPageContext<>(items, total, size);
        return pageContext.getPage(pn);
    }
}
