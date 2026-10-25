package com.example.demo;

public class User implements Notifiable{
    private String id;
    private String name;
    private String email;
    private int phone;


    // constructer ko co tham so => constructer mac dinh
    // public User(){}
    // constructer co tham so
    public User(String id, String name, String email, int phone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User() {
    }

    public String getId(){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public int phone(){
        return phone;
    }

    public void setPhone (int phone){
        this.phone = phone;
    }

    // do implement Notifiable => pk viet not method cua cai Notifiable
    @Override
    public void sendNotifiable(String message){
        System.out.println("Hello" + " "+ email +" "+ message);
    }
}
