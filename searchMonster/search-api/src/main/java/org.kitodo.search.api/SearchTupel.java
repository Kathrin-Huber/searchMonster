package org.kitodo.search.api;

/**
 * Created by al-huber on 20.03.2017.
 */
public class SearchTupel<V> extends BaseSearchParameter {

    private String fieldName;
    private V value;
    private Operator operator;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public boolean isTupel() {
        return true;
    }

    @Override
    public BaseSearchParameter getParameter() {
        return null;
    }
}
