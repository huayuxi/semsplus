package com.semsplus.web.model;

public class Auth {
    private Integer auth_id;

    private String auth_name;

    private String auth_url;

    private String auth_description;

    private String create_time;

    private Integer create_user;

    private String update_time;

    private Integer update_user;

    public Integer getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(Integer auth_id) {
        this.auth_id = auth_id;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name == null ? null : auth_name.trim();
    }

    public String getAuth_url() {
        return auth_url;
    }

    public void setAuth_url(String auth_url) {
        this.auth_url = auth_url == null ? null : auth_url.trim();
    }

    public String getAuth_description() {
        return auth_description;
    }

    public void setAuth_description(String auth_description) {
        this.auth_description = auth_description == null ? null : auth_description.trim();
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
}