package com.company.Module;

public class Link {
    private  String linkColor;
    private Dot from;
    private Dot to;

    public Link(String linkColor, Dot from, Dot to) {
        this.linkColor = linkColor;
        this.from = from;
        this.to = to;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public Dot getFrom() {
        return from;
    }

    public void setFrom(Dot from) {
        this.from = from;
    }

    public Dot getTo() {
        return to;
    }

    public void setTo(Dot to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Link{" +
                "color='" + linkColor + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
