package com.endava.training.dp.prototype;

/**
 * @author Bogdan Benga <Bogdan.Benga@endava.com></>
 */
public class ColorBox implements Cloneable{

    private int volume;
    private String color;

    public ColorBox(final int volume, final String color) {
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        ColorBox cloneObject = new ColorBox(this.volume, this.color);
        return cloneObject;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
}
