package com.itheima.retrofitutils;

/**
 * Created by Administrator on 2018/11/14.
 */

public class GitUpdateFile {
    private String sha;

    private String message;

    private String content;

    public GitUpdateFile() {
    }

    public GitUpdateFile(String sha, String message, String content) {
        this.sha = sha;
        this.message = message;
        this.content = content;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
