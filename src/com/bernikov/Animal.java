package com.bernikov;

public class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int n){
            System.out.println(name + " ran " + n + " meters");
        }
        public void sail(int n){
            System.out.println(name + " swam " + n + " meters");
        }
}
