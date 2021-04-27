package com.company;

import java.util.Date;
import java.util.HashMap;

public class TechCompany extends Company implements Ipo,Investments{
  Date nextProduct;
  String manuCoutry;
  HashMap<String,String> products;

  public TechCompany(String name, Date nextProduct, String manuCoutry,
                     HashMap<String,String> products){

      this.name=name;
      this.numOfWorkers=numOfWorkers;
      this.marketCap=marketCap;
      this.nextProduct=nextProduct;
      this.manuCoutry=manuCoutry;
      this.products=products;
  }
    void addProduct(String k,String v){
        products.put(k,v);
    }

    public void MarketCop(){
        System.out.println(this.marketCap);
    }

    public int add(int funds){
       marketCap+=funds;
        return this.marketCap;
    }

}
