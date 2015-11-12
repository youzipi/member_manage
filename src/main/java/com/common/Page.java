package com.common;

/**
 * project_name:member_manage
 * package_name:com.common
 * user: youzipi
 * date: 15-11-11 下午2:42
 */
public class Page {
    private int number;
    private int size;
    private int total;

    public Page(int number, int size, int total) {
        this.number = number;
        this.size = size;
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Page{" +
                "number=" + number +
                ", size=" + size +
                ", total=" + total +
                '}';
    }
}
