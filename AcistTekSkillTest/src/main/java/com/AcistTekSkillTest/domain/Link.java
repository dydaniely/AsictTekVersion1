package com.AcistTekSkillTest.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Daniel on 1/25/2017.
 */
@Entity
@Table(name = "link")
public class Link {

    @GeneratedValue
    @Id
    private int linkId;
    private String linkName;
    private String linkDescription;

    @OneToMany(targetEntity =Quote.class,mappedBy = "link",fetch = FetchType.EAGER)
    private List<Quote> quoteList;

    public Link() {
    }
    public Link(String linkName, String linkDescription) {
        this.linkName = linkName;
        this.linkDescription = linkDescription;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }

    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

}
