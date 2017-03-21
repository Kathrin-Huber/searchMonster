package org.kitodo.search.impl;

import org.kitodo.search.api.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by al-huber on 20.03.2017.
 */
public class SearchImplementation<T extends BaseSearchBean,S extends BaseSearchBean> implements SearchInterface<T,S> {

    @Override
    public ArrayList<Integer> search(String query) {
        return null;
    }

    @Override
    public ArrayList<SearchResult> search(SearchParameter searchParameter) {
        String search = "";
        search = "Select t FROM " + T.getTableName() + " WHERE ";

        search += createSearchString(searchParameter);

        System.out.println(search);

        return null;
    }


    @Override
    public ArrayList<SearchResult> filter(ArrayList searchResult) {
        return null;
    }

     private <V> String createSearchString(BaseSearchParameter parameter){
        String returnValue = "";

        if (parameter.isTupel()){
            SearchTupel<V> tupel = (SearchTupel) parameter;

            String column = tupel.getFieldName();
            V value = tupel.getValue();
            Operator operator = tupel.getOperator();

            returnValue += column + " " + operator.toString() + " " + value;
        }

        else{
            SearchParameter<S, BaseSearchParameter> searchParameter = (SearchParameter<S, BaseSearchParameter>) parameter;
            returnValue += " " + S.getTableName() + " ";
            returnValue += createSearchString(searchParameter.getParameter());

            if(searchParameter.getConcatination()!=null){
                Iterator<Map.Entry<SearchParameter<?, ?>, Concatination>> iterator = searchParameter.getConcatination().entrySet().iterator();
                while (iterator.hasNext()){
                    Map.Entry concats = iterator.next();
                    returnValue += " " + concats.getValue() + createSearchString((BaseSearchParameter) concats.getKey()) + " ";
                }
            }

        }
        return returnValue;
    }
}
