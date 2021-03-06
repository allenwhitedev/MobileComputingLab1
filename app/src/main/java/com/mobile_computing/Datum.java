package com.mobile_computing;

/**
 * Created by Nicholas Cioli on 1/12/2017.
 */

public class Datum {
    private int    m_id;
    private String m_title;
    private String m_date;
    private String m_text;
    private String m_imageUrl;
    private boolean m_isFavorite = false;
    // Constructor
    Datum(int id, String title, String date, String text, String imageUrl) {
        m_id       = id;
        m_title    = title;
        m_date     = date;
        m_text     = text;
        m_imageUrl = imageUrl;
    }

    // add item as favorite
    public void addFavorite()
    {
        if (!m_isFavorite)
            m_isFavorite = true;
        else
            m_isFavorite = false;
    }

    // Get operations
    public int id () { return m_id; }
    public String title() { return m_title; }
    public String date() { return m_date; }
    public String text() { return m_text; }
    public String imageUrl() { return m_imageUrl; }
    public boolean isFavorite() { return m_isFavorite; };
}
