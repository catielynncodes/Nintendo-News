package com.shorelineapps.nintendo_news;

/**
 * An {@link News} object contains information related to a single news article.
 */
public class News {

    /** Title of the news article */
    private String mArticleTitle;

    /** Section of the news article */
    private String mArticleSection;

    /** Date the news article was published */
    private String mArticlePublishDate;

    /** Website URL of the news article */
    private String mArticleUrl;

    /**
     * Constructs a new {@link News} object.
     */
    public News(String articleTitle, String articleSection, String articlePublishDate, String articleUrl) {
        mArticleTitle = articleTitle;
        mArticleSection = articleSection;
        mArticlePublishDate = articlePublishDate;
        mArticleUrl = articleUrl;
    }

    /**
     * Returns the title of the news article.
     */
    public String getArticleTitle() {
        return mArticleTitle;
    }

    /**
     * Returns the section of the news article.
     */
    public String getArticleSection() {
        return mArticleSection;
    }

    /**
     * Returns the date the news article was published.
     */
    public String getArticlePublishDate() {
        return mArticlePublishDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getArticleUrl() {
        return mArticleUrl;
    }
}
