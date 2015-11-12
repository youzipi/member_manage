package com.common;

public class PageBuilder {
    private int number = 1;
    private int size = 5;
    private int total;
    private Page page;

    public PageBuilder number(int number) {
        this.number = number;
        return this;
    }

    public PageBuilder size(int size) {
        this.size = size;
        return this;
    }

    public PageBuilder total(int count) {

        this.total = (count - 1) / size + 1;
        return this;
    }

    public Page page() {
        if (page == null) {
            return new Page(number, size, total);
        } else return page;
    }
}