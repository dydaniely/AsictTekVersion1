package com.AcistTekSkillTest.domain;

import javax.persistence.*;

/**
 * Created by Daniel on 1/25/2017.
 */
@Entity
@Table(name = "quote")
public class Quote {
    @GeneratedValue
    @Id
    private int quoteId;
    private String quoteTitle;
    private String quoteContent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "linkId",nullable = false)
    private Link link;

    public Quote() {
    }

    public Quote(String quoteTitle, String quoteContent) {
        this.quoteTitle = quoteTitle;
        this.quoteContent = quoteContent;
    }
    public int getId() {
        return quoteId;
    }

    public void setId(int id) {
        this.quoteId = id;
    }

    public String getQuoteTitle() {
        return quoteTitle;
    }

    public void setQuoteTitle(String quoteTitle) {
        this.quoteTitle = quoteTitle;
    }

    public String getQuoteContent() {
        return quoteContent;
    }

    public void setQuoteContent(String quoteContent) {
        this.quoteContent = quoteContent;
    }


    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
