package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Text {


        private List list;
        private Iterator iter;
        private String headerText;

        public Text(String headerText) {
            list = new LinkedList();
            this.headerText = headerText;
        }

        public void addWords(Words words){
            list.add(words);
        }

        public void addText(String text){
            list.add(getWord(text));
        }

        private Words getWord(String text){
            Words words = new Words();
            String [] strArr;
            strArr = text.split(" ");
            Word [] word = new Word[strArr.length];
            for (int i = 0; i < word.length; i++) {
                word[i] = new Word();
                word[i].setWord(strArr[i]);
                words.addWord(word[i]);
            }
            return words;
        }

        public String getHeader(){
            return headerText;
        }

        public void setHeader(String headerText){
            this.headerText = headerText;
        }

        public String toString(){
            String text = "";
            iter = list.iterator();
            while(iter.hasNext()){
                Words words = (Words)iter.next();
                text+=words;
            }

            return "\t" + headerText + "\n\n" + text;
        }
    }

