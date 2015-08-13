package edu.acc.j2ee.hubbub1;

import java.util.Date;

public class Post implements java.io.Serializable {
    private String content;
    private Date postDate;
    private int userId;
    
    public Post(String content, Date postDate, int userId) {
        this.content = content;
        this.postDate = postDate;
        this.userId  = userId;
    }
    
    public Post() {}

    public String getContent() {
        return content;
    }

    public Date getPostDate() {
        return postDate;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public void setJoinDate(Date postDate) {
        this.postDate = postDate;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    @Override
    public String toString() {
        return content;
    }
    
  
}
