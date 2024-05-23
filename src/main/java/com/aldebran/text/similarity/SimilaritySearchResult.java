package com.aldebran.text.similarity;

public class SimilaritySearchResult {

    public String id;

    public String title;

    public String content;

    public double score;

    @Override
    public String toString() {
        return "SimilaritySearchResult{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", score=" + score +
                '}';
    }
}