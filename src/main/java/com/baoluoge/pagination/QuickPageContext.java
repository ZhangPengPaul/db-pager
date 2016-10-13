package com.baoluoge.pagination;

import java.util.List;
import java.util.Objects;

/**
 * Created by PaulZhang on 2016/10/13.
 */
public class QuickPageContext<E> implements PageContext {

    private List<E> items;
    private long totalCount;
    private int pageSize;

    public QuickPageContext(List<E> items, long totalCount, int pageSize) {
        if (Objects.nonNull(items)) {
            this.items = items;
        }
        this.totalCount = totalCount;
        this.pageSize = pageSize == 0 ? DEFAULT_PAGE_SIZE : pageSize;
    }

    public long getPageCount() {
        long div = totalCount / pageSize;
        return (totalCount % pageSize == 0) ? div : div + 1;
    }

    public Page getPage(int index) {
        Page<E> page = new Page<E>();
        page.setPageContext(this);
        int index2 = index > getPageCount() ? 1 : index;
        page.setNext(index2 < getPageCount());
        page.setPrevious(index2 > 1);
        page.setIndex(index2);
        page.setItems(items);
        return page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getTotal() {
        return totalCount;
    }
}
