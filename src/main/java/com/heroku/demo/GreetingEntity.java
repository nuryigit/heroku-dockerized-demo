package com.heroku.demo;

import javax.persistence.*;

@Entity
@Table(name = "greeting")
public class GreetingEntity {

    private Long greetingId;
    private String name;
    private String lang;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "greeting_id")
    public Long getGreetingId() {
        return greetingId;
    }

    public void setGreetingId(Long greetingId) {
        this.greetingId = greetingId;
    }

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
