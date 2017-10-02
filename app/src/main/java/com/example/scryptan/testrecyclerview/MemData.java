package com.example.scryptan.testrecyclerview;

public class MemData {
    public String textMem;
    public String urlMem;
    public String likesMem;
    public String dislikesMem;
    public String countCommentsMem;

    public MemData(String textMem, String urlMem, String likesMem, String dislikesMem, String countCommentsMem) {
        this.textMem = textMem;
        this.urlMem = urlMem;
        this.likesMem = likesMem;
        this.dislikesMem = dislikesMem;
        this.countCommentsMem = countCommentsMem;
    }

    public String getTextMem() {
        return textMem;
    }

    public String getUrlMem() {
        return urlMem;
    }

    public String getLikesMem() {
        return likesMem;
    }

    public String getDislikesMem() {
        return dislikesMem;
    }

    public String getCountCommentsMem() {
        return countCommentsMem;
    }
}
