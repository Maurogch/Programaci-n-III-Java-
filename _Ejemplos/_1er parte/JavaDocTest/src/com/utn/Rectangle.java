package com.utn;

/**
 * Javadoc link test
 * It is super class of {@link Square}
 *
 * @see Square
 */
public class Rectangle {

    private int width;
    private int height;

    /**
     * Sets size.
     *
     * @param width  width of rectangle
     * @param height height of rectangle
     */
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets width
     *
     * @return {@link #width}
     * @see #getHeight()
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets height
     *
     * @return {@link Rectangle#height}
     * @see Rectangle#getWidth()
     */
    public int getHeight() {
        return height;
    }
}
