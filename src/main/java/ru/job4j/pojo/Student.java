package ru.job4j.pojo;

import java.util.Date;
import java.util.SplittableRandom;

public class Student {
    private String name;
    private String group;
    private Date receipts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceipts() {
        return receipts;
    }

    public void setReceipts(Date receipts) {
        this.receipts = receipts;
    }
}
