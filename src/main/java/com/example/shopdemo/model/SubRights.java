package com.example.shopdemo.model;

public class SubRights {
    private Integer id;

    private String name;

    private String path;

    private Short level;

    private Short parentLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Short getParentLevel() {
        return parentLevel;
    }

    public void setParentLevel(Short parentLevel) {
        this.parentLevel = parentLevel;
    }
}