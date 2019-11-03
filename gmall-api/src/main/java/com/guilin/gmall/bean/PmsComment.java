package com.guilin.gmall.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_comment", schema = "gmall_study", catalog = "")
public class PmsComment {
    private long id;
    private Long productId;
    private String memberNickName;
    private String productName;
    private Integer star;
    private String memberIp;
    private Timestamp createTime;
    private Integer showStatus;
    private String productAttribute;
    private Integer collectCouont;
    private Integer readCount;
    private String content;
    private String pics;
    private String memberIcon;
    private Integer replayCount;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "member_nick_name", nullable = true, length = 255)
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 255)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "star", nullable = true)
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "member_ip", nullable = true, length = 64)
    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "show_status", nullable = true)
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "product_attribute", nullable = true, length = 255)
    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    @Basic
    @Column(name = "collect_couont", nullable = true)
    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    @Basic
    @Column(name = "read_count", nullable = true)
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "pics", nullable = true, length = 1000)
    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    @Basic
    @Column(name = "member_icon", nullable = true, length = 255)
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Basic
    @Column(name = "replay_count", nullable = true)
    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsComment that = (PmsComment) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (memberNickName != null ? !memberNickName.equals(that.memberNickName) : that.memberNickName != null)
            return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (star != null ? !star.equals(that.star) : that.star != null) return false;
        if (memberIp != null ? !memberIp.equals(that.memberIp) : that.memberIp != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (productAttribute != null ? !productAttribute.equals(that.productAttribute) : that.productAttribute != null)
            return false;
        if (collectCouont != null ? !collectCouont.equals(that.collectCouont) : that.collectCouont != null)
            return false;
        if (readCount != null ? !readCount.equals(that.readCount) : that.readCount != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (pics != null ? !pics.equals(that.pics) : that.pics != null) return false;
        if (memberIcon != null ? !memberIcon.equals(that.memberIcon) : that.memberIcon != null) return false;
        if (replayCount != null ? !replayCount.equals(that.replayCount) : that.replayCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (memberNickName != null ? memberNickName.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (memberIp != null ? memberIp.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (productAttribute != null ? productAttribute.hashCode() : 0);
        result = 31 * result + (collectCouont != null ? collectCouont.hashCode() : 0);
        result = 31 * result + (readCount != null ? readCount.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (pics != null ? pics.hashCode() : 0);
        result = 31 * result + (memberIcon != null ? memberIcon.hashCode() : 0);
        result = 31 * result + (replayCount != null ? replayCount.hashCode() : 0);
        return result;
    }
}
