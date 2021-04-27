package com.company;

public class OilCompany extends Company implements Ipo{
    String country;
    int storage;
    public void bankrupcy(){

    }

    public OilCompany(String name,int numOfWorkers,int marketCap,String country,int storage){

        this.name=name;
        this.numOfWorkers=numOfWorkers;
        this.marketCap=marketCap;
        this.country=country;
        this.storage=storage;
    }

    public void MarketCop(){
        System.out.println(this.marketCap);
    }

    public int add(int funds){
        marketCap+=funds;
        return this.marketCap;
    }
}
