package com.hy.bookstore.domain;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by sumimasah on 2017/8/5.
 */
public class Trade {

    private Integer tradeId;
    private Date tradeTime;

    private Set<TradeItem> items = new LinkedHashSet<TradeItem>();
    private Set<User> users = new LinkedHashSet<User>();

    public Integer getTradeId() {
        return tradeId;
    }

    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Set<TradeItem> getItems() {
        return items;
    }

    public void setItems(Set<TradeItem> items) {
        this.items = items;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "tradeId=" + tradeId +
                ", tradeTime=" + tradeTime +
                ", items=" + items +
                ", users=" + users +
                '}';
    }
}
