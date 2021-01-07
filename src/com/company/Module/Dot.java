package com.company.Module;

import java.util.ArrayList;
import java.util.HashMap;

public class Dot {
    private String color;
    private int serialNum;
    private ArrayList<Dot> toOtherDots,fromOtherDots;
    private HashMap<Dot,String> toLinkColor,fromLinkColor;

    public Dot(String color, int serialNum) {
        this.color=color;
        this.serialNum = serialNum;
        this.toOtherDots = new ArrayList<>();
        this.fromOtherDots = new ArrayList<>();
        this.toLinkColor = new HashMap<>();
        this.fromLinkColor = new HashMap<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public ArrayList<Dot> getToOtherDots() {
        return toOtherDots;
    }

    public void setToOtherDots(ArrayList<Dot> toOtherDots) {
        this.toOtherDots = toOtherDots;
    }

    public ArrayList<Dot> getFromOtherDots() {
        return fromOtherDots;
    }

    public void setFromOtherDots(ArrayList<Dot> fromOtherDots) {
        this.fromOtherDots = fromOtherDots;
    }

    public HashMap<Dot, String> getToLinkColor() {
        return toLinkColor;
    }

    public void setToLinkColor(HashMap<Dot, String> toLinkColor) {
        this.toLinkColor = toLinkColor;
    }

    public HashMap<Dot, String> getFromLinkColor() {
        return fromLinkColor;
    }

    public void setFromLinkColor(HashMap<Dot, String> fromLinkColor) {
        this.fromLinkColor = fromLinkColor;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "color='" + color + '\'' +
                ", serialNum=" + serialNum +
                '}';
    }
}
