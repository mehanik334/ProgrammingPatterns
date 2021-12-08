package com.Denisenko.behavioral.iterator;

public class Detail implements Collection {

    public String name;
    public String[] subDetail;

    public Detail(String name, String[] subDatail) {
        this.name = name;
        this.subDetail = subDatail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubDatail() {
        return subDetail;
    }

    public void setSubDatail(String[] subDatail) {
        this.subDetail = subDatail;
    }



    @Override
    public Iterator getIterator() {
        return new SubDetailIterator();
    }

    private class SubDetailIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index<subDetail.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return subDetail[index++];
        }
    }
}
