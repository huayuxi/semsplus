package com.semsplus.web.model;

public class News {
    private Integer news_id;

    private String news_title;

    private String news_type;

    private String news_menu;

    private String create_time;

    private Integer create_user;

    private String update_time;

    private Integer update_user;

    private String news_content;

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title == null ? null : news_title.trim();
    }

    public String getNews_type() {
        return news_type;
    }

    public void setNews_type(String news_type) {
        this.news_type = news_type == null ? null : news_type.trim();
    }

    public String getNews_menu() {
        return news_menu;
    }

    public void setNews_menu(String news_menu) {
        this.news_menu = news_menu == null ? null : news_menu.trim();
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time == null ? null : create_time.trim();
    }

    public Integer getCreate_user() {
        return create_user;
    }

    public void setCreate_user(Integer create_user) {
        this.create_user = create_user;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time == null ? null : update_time.trim();
    }

    public Integer getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(Integer update_user) {
        this.update_user = update_user;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content == null ? null : news_content.trim();
    }
}