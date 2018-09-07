package com.shorelineapps.nintendo_news;

/**
 * An {@link News} object contains information related to a single earthquake.
 */
public class News {

    /** Title of the news article */
    private String mArticleTitle;

    /** Author of the news article */
    private String mArticleAuthor;

    /** Date the news article was published */
    private long mArticlePublishDate;

    /** Website URL of the earthquake */
    private String mArticleUrl;

    /**
     * Constructs a new {@link News} object.
     */
    public News(String articleTitle, String articleAuthor, long articlePublishDate, String articleUrl) {
        mArticleTitle = articleTitle;
        mArticleAuthor = articleAuthor;
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
     * Returns the author of the news article.
     */
    public String getArticleAuthor() {
        return mArticleAuthor;
    }

    /**
     * Returns the date the news article was published.
     */
    public long getArticlePublishDate() {
        return mArticlePublishDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getArticleUrl() {
        return mArticleUrl;
    }
}
