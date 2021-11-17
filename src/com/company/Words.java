package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class Words {
    private List list;
    private Iterator iter;

    public Words() {
        list = new LinkedList();
    }

    public void addWord(Word word) {
        list.add(word);
    }


    public String toString(){
        String words = "";
        iter = list.iterator();
        while(iter.hasNext()){
            Word word = (Word) iter.next();
            words+=word;
        }
        return words;
    }

    public boolean equals(Object obj){                       // !!!!!!!!!!!!!!!!!
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass()!=obj.getClass())
            return false;

        return true;
    }
}
