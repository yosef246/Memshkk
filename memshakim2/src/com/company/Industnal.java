package com.company;

public class Industnal extends Company implements Investments{
    String type;
    int namOfPlants;

   public Industnal(String name,int numOfWorkers,int marketCap,String type, int namOfPlants){
       this.name=name;
       this.numOfWorkers=numOfWorkers;
       this.marketCap=marketCap;
       this.type=type;
       this.namOfPlants=namOfPlants;
   }
     public int add(int funds){
       marketCap+=funds;
       return this.marketCap;
     }
}
