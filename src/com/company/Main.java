package com.company;

public class Main {
    private String word;

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public String toString(){
        return word + " ";
    }
    public boolean equals(Object obj){                               //ОК
        if(this==obj)
            return true;
        if(obj == null)
            return false;
        if(getClass()!=obj.getClass())
            return false;
        getWord()word = (Word)obj;
        if(this.word == null){
            if(word.getWord()!= null)
                return false;
        }
        else if (!this.word.equals(word.getWord()))
            return false;
        return true;
    }
    public int hashCode(){
        return (word == null) ? 0 : word.hashCode();
    }
}
