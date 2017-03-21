package org.kitodo.search.api;

import java.util.HashMap;

/**
 * Created by al-huber on 20.03.2017.
 */
public class SearchResult<T extends BaseSearchBean> {

    public int id;
    public HashMap<String, String> properties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, String> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, String> properties) {
        this.properties = properties;
    }
}
