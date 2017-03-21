package org.kitodo.search.api;

import java.util.HashMap;

/**
 * Created by al-huber on 20.03.2017.
 */
public class SearchParameter<S extends BaseSearchBean, P extends BaseSearchParameter> extends BaseSearchParameter {

    private S table;
    private P parameter;
    private Order order;
    private HashMap<SearchParameter<?,?>, Concatination> concatination;

    @Override
    public P getParameter() {
        return parameter;
    }

    public S getTable(){
        return table;
    }

    public void setParameter(P parameter) {
        this.parameter = parameter;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public HashMap<SearchParameter<?, ?>, Concatination> getConcatination() {
        return concatination;
    }

    public void setConcatination(HashMap<SearchParameter<?, ?>, Concatination> concatination) {
        this.concatination = concatination;
    }

    @Override
    public boolean isTupel() {
        return false;
    }
}
