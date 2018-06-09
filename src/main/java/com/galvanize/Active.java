package com.galvanize;

public class Active {
    public boolean isActive(String status) {
        return status.equals("active");
    }
    public static void main(String[] args) {
        Active active = new Active();
        System.out.println(active.isActive("test"));
    }
}
