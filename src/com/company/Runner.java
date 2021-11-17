package com.company;

public class Runner {
    public static void main(String[] args) {

        Text text = new Text("\n\tКомпания Google");

        text.addText("собирается усилить контроль над созданием смартфонов Nexus");
        text.addText("которые производят её партнёры. Как стало известно");

        System.out.println(text);

    }
}
