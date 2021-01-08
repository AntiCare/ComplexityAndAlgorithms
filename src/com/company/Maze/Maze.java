package com.company.Maze;

import com.company.Module.Dot;
import com.company.Module.Link;

import java.util.ArrayList;

public class Maze {
    private ArrayList<Dot> dots = new ArrayList<>();
    private ArrayList<Link> links = new ArrayList<>();
    public Maze(){
        initMap();
    }

    public void initMap(){
        //init dots...
        System.out.println("init dots.....");
        Dot d1 = new Dot("purple",1);
        Dot d2 = new Dot("black",2);
        Dot d3 = new Dot("green",3);
        Dot d4 = new Dot("green",4);
        Dot d5 = new Dot("green",5);
        Dot d6 = new Dot("orange",6);
        Dot d7 = new Dot("orange",7);
        Dot d8 = new Dot("purple",8);
        Dot d9 = new Dot("purple",9);
        Dot d10 = new Dot("black",10);
        Dot d11 = new Dot("orange",11);
        Dot d12 = new Dot("purple",12);
        Dot d13 = new Dot("orange",13);
        Dot d14 = new Dot("green",14);
        Dot d15 = new Dot("orange",15);
        Dot d16 = new Dot("green",16);
        Dot d17 = new Dot("green",17);
        Dot d18 = new Dot("black",18);
        Dot d19 = new Dot("orange",19);
        Dot d20 = new Dot("green",20);
        Dot d21 = new Dot("black",21);
        Dot d22 = new Dot("black",22);
        Dot dFinish = new Dot("blue",999);

        //add dots
        dots.add(d1);
        dots.add(d2);
        dots.add(d3);
        dots.add(d4);
        dots.add(d5);
        dots.add(d6);
        dots.add(d7);
        dots.add(d8);
        dots.add(d9);
        dots.add(d10);
        dots.add(d11);
        dots.add(d12);
        dots.add(d13);
        dots.add(d14);
        dots.add(d15);
        dots.add(d16);
        dots.add(d17);
        dots.add(d18);
        dots.add(d19);
        dots.add(d20);
        dots.add(d21);
        dots.add(d22);
        dots.add(dFinish);
        System.out.println("add dots done!");
        //init links...
        System.out.println("init links.....");
        Link l1 = new Link("purple",d1,d4);
        Link l2 = new Link("black",d1,d5);
        Link l3 = new Link("green",d2,d6);
        Link l4 = new Link("purple",d2,d12);

        Link l5 = new Link("orange",d3,d1);
        Link l6 = new Link("orange",d3,d4);
        Link l7 = new Link("black",d4,d13);
        Link l8 = new Link("orange",d5,d9);

        Link l9 = new Link("green",d6,d9);
        Link l10 = new Link("purple",d6,d10);
        Link l11 = new Link("green",d7,d2);
        Link l12 = new Link("purple",d8,d3);

        Link l13 = new Link("green",d9,d4);
        Link l14 = new Link("black",d9,d14);
        Link l15 = new Link("green",d10,d15);
        Link l16 = new Link("purple",d11,d10);

        Link l17 = new Link("green",d11,d12);
        Link l18 = new Link("green",d12,d7);
        Link l19 = new Link("green",d13,d8);
        Link l20 = new Link("green",d13,d18);

        Link l21 = new Link("orange",d14,d20);
        Link l22 = new Link("green",d14,dFinish);
        Link l23 = new Link("purple",d15,dFinish);
        Link l24 = new Link("green",d15,d22);

        Link l25 = new Link("green",d16,d15);
        Link l26 = new Link("black",d17,d16);
        Link l27 = new Link("black",d17,d11);
        Link l28 = new Link("purple",d17,d12);

        Link l29 = new Link("orange",d18,d20);
        Link l30 = new Link("black",d20,d19);
        Link l31 = new Link("green",d19,d18);
        Link l32 = new Link("orange",d20,d21);

        Link l33 = new Link("black",d21,dFinish);
        Link l34 = new Link("orange",d21,d22);
        Link l35 = new Link("orange",d22,d17);

        //add links
        links.add(l1);
        links.add(l2);
        links.add(l3);
        links.add(l4);
        links.add(l5);
        links.add(l6);
        links.add(l7);
        links.add(l8);
        links.add(l9);
        links.add(l10);
        links.add(l11);
        links.add(l12);
        links.add(l13);
        links.add(l14);
        links.add(l15);
        links.add(l16);
        links.add(l17);
        links.add(l18);
        links.add(l19);
        links.add(l20);
        links.add(l21);
        links.add(l22);
        links.add(l23);
        links.add(l24);
        links.add(l25);
        links.add(l26);
        links.add(l27);
        links.add(l28);
        links.add(l29);
        links.add(l30);
        links.add(l31);
        links.add(l32);
        links.add(l33);
        links.add(l34);
        links.add(l35);
        System.out.println("add links done!");

        //add the neighbour to each dots
       System.out.println("finding the neighbour to each dots...");
        for (Dot eDot:dots) {
            for (Link eLink:links) {
                if(eDot.equals(eLink.getFrom())){
//                    eDot.getToOtherDots().add(eLink.getTo());
                    eDot.getToLinkColor().put(eLink.getTo(),eLink.getLinkColor());
                }
                if(eDot.equals(eLink.getTo())){
//                    eDot.getFromOtherDots().add(eLink.getFrom());
                    eDot.getFromLinkColor().put(eLink.getFrom(),eLink.getLinkColor());
                }
            }
        }
        System.out.println("finding the neighbour to each dots done!");

//        System.out.println("D1 from: "+d1.getFromOtherDots()+"   To: "+d1.getToOtherDots());
//        System.out.println("D2 from: "+d2.getFromOtherDots()+"   To: "+d2.getToOtherDots());
        System.out.println("D1 can from: "+d1.getFromLinkColor()+" Can  To: "+d1.getToLinkColor());
        System.out.println("D2 can from: "+d2.getFromLinkColor()+" Can  To: "+d2.getToLinkColor());


    }

    public ArrayList<Dot> getDots() {
        return dots;
    }

    public void setDots(ArrayList<Dot> dots) {
        this.dots = dots;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }
}
