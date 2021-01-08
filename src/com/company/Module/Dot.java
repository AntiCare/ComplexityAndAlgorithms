package com.company.Module;

import java.util.ArrayList;
import java.util.HashMap;

public class Dot {
    private String color;
    private int serialNum;
    private HashMap<Dot,String> toLinkColor,fromLinkColor;
    private ArrayList<Dot> availableDots;

    public Dot(String color, int serialNum) {
        this.color=color;
        this.serialNum = serialNum;
        this.toLinkColor = new HashMap<>();
        this.fromLinkColor = new HashMap<>();
        this.availableDots = new ArrayList<>();
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

    /**
     * Filter out the available neighbors of one pawn by the color of the other pawn.
     * @param color the color of other pawn.
     * @return the arraylist of available neighbors.
     */
    public ArrayList<Dot> getAvailableDots(String color) {
        for (Dot e:toLinkColor.keySet()) {
            if(toLinkColor.get(e).equals(color)){
                availableDots.add(e);
            }
        }
        return availableDots;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "color='" + color + '\'' +
                ", serialNum=" + serialNum +
                '}';
    }
}
