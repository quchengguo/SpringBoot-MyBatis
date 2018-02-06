package com.shawn.model.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author quchengguo
 * @since 2018-02-05
 */
public class Qcg implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @TableField("book_store_id")
    private Long bookStoreId;
    private String name;
    private String author;
    private BigDecimal price;
    private String topic;
    @TableField("publish_date")
    private Date publishDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookStoreId() {
        return bookStoreId;
    }

    public void setBookStoreId(Long bookStoreId) {
        this.bookStoreId = bookStoreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Qcg{" +
        ", id=" + id +
        ", bookStoreId=" + bookStoreId +
        ", name=" + name +
        ", author=" + author +
        ", price=" + price +
        ", topic=" + topic +
        ", publishDate=" + publishDate +
        "}";
    }
}
