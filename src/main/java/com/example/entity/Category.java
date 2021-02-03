package com.example.entity;

public class Category extends AbstractEntityPK<Integer>{
    private static final long serialVersionUID = 1056433673093505518L;
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(String articles) {
        this.articles = articles;
    }

    private String articles;
}
