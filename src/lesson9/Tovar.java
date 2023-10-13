package lesson9;

import java.util.ArrayList;

public class Tovar {
    //1 - polia klassa
    private String fullName;
    private int Price;
    private int sellPrice;
    private ArrayList<Otziv> otzivs = new ArrayList<>();

    public Tovar(String fullName, int price) {
        this.fullName = fullName;
        Price = price;
    }

    public Tovar(String fullName, int price, int sellPrice) {
        this.fullName = fullName;
        Price = price;
        this.sellPrice = sellPrice;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "fullName='" + fullName + '\'' +
                ", Price=" + Price +
                ", sellPrice=" + sellPrice +
                ", otzivs=" + otzivs +
                '}';
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
//2 - Konstruktori, - osobii metod kotorii visivatsa posle slova new i rozhdaet novii obekt



}
