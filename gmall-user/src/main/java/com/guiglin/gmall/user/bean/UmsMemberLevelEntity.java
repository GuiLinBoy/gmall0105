package com.guiglin.gmall.user.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ums_member_level", schema = "gmall_study")
public class UmsMemberLevelEntity {
    private long id;
    private String name;
    private Integer growthPoint;
    private Integer defaultStatus;
    private BigDecimal freeFreightPoint;
    private Integer commentGrowthPoint;
    private Integer priviledgeFreeFreight;
    private Integer priviledgeSignIn;
    private Integer priviledgeComment;
    private Integer priviledgePromotion;
    private Integer priviledgeMemberPrice;
    private Integer priviledgeBirthday;
    private String note;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "growth_point", nullable = true)
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    @Basic
    @Column(name = "default_status", nullable = true)
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Basic
    @Column(name = "free_freight_point", nullable = true, precision = 2)
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    @Basic
    @Column(name = "comment_growth_point", nullable = true)
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    @Basic
    @Column(name = "priviledge_free_freight", nullable = true)
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    @Basic
    @Column(name = "priviledge_sign_in", nullable = true)
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    @Basic
    @Column(name = "priviledge_comment", nullable = true)
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    @Basic
    @Column(name = "priviledge_promotion", nullable = true)
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    @Basic
    @Column(name = "priviledge_member_price", nullable = true)
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    @Basic
    @Column(name = "priviledge_birthday", nullable = true)
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMemberLevelEntity that = (UmsMemberLevelEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(growthPoint, that.growthPoint) &&
                Objects.equals(defaultStatus, that.defaultStatus) &&
                Objects.equals(freeFreightPoint, that.freeFreightPoint) &&
                Objects.equals(commentGrowthPoint, that.commentGrowthPoint) &&
                Objects.equals(priviledgeFreeFreight, that.priviledgeFreeFreight) &&
                Objects.equals(priviledgeSignIn, that.priviledgeSignIn) &&
                Objects.equals(priviledgeComment, that.priviledgeComment) &&
                Objects.equals(priviledgePromotion, that.priviledgePromotion) &&
                Objects.equals(priviledgeMemberPrice, that.priviledgeMemberPrice) &&
                Objects.equals(priviledgeBirthday, that.priviledgeBirthday) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeSignIn, priviledgeComment, priviledgePromotion, priviledgeMemberPrice, priviledgeBirthday, note);
    }
}
