package com.guilin.gmall.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_comment_replay", schema = "gmall_study", catalog = "")
public class PmsCommentReplay {
    private long id;
    private Long commentId;
    private String memberNickName;
    private String memberIcon;
    private String content;
    private Timestamp createTime;
    private Integer type;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "comment_id", nullable = true)
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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
    @Column(name = "member_icon", nullable = true, length = 255)
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsCommentReplay that = (PmsCommentReplay) o;

        if (id != that.id) return false;
        if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
        if (memberNickName != null ? !memberNickName.equals(that.memberNickName) : that.memberNickName != null)
            return false;
        if (memberIcon != null ? !memberIcon.equals(that.memberIcon) : that.memberIcon != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        result = 31 * result + (memberNickName != null ? memberNickName.hashCode() : 0);
        result = 31 * result + (memberIcon != null ? memberIcon.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
