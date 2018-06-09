package com.galvanize;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    public Picture(int height, int width) {
        this(false, height, width);
    }

    public Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }
}
