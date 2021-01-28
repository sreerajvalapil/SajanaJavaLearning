package com.assignment;

import java.util.List;
import java.util.Map;

public class Students {
    private String name;
    private String division;
    private Integer mark;

    public Students(String name, String division, Integer mark) {
        this.name = name;
        this.division = division;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

}
