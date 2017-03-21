package org.kitodo.search.api;

import java.util.ArrayList;

/**
 * Created by al-huber on 20.03.2017.
 */
public interface SearchInterface<T extends BaseSearchBean, S extends BaseSearchBean> {

    ArrayList<Integer> search(String query);

    ArrayList<SearchResult<T>> filter(ArrayList<SearchResult<T>> searchResult);

    abstract ArrayList<SearchResult> search(SearchParameter<S, BaseSearchParameter> searchParameters);
}
