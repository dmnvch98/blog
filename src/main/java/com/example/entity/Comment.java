package com.example.entity;

import java.sql.Timestamp;

public class Comment extends AbstractEntityPK<Long>{
    private static final long serialVersionUID = 2531338175311798232L;
    private Long idArticle;
    private Account account;
    private String content;
    private Timestamp created;

    public Comment(Long idArticle, Account account, String content, Timestamp created) {
        this.idArticle = idArticle;
        this.account = account;
        this.content = content;
        this.created = created;
    }

    public Comment() {
        super();
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
