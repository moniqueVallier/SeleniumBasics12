package seleniumBasics.groupProject;
public class part3 {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(20_000, "White", 20);
        System.out.println(sedan.calculateSalePrice());
        Car truck=new Truck(50_000, "Black", 2350);
        System.out.println(truck.calculateSalePrice());
    }
}
class Car {
    double carPrice;
    String color;
    double disco;

    public Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice-carPrice*disco;
    }
}
class Sedan extends Car{
    int length;
    public Sedan(double carPrice,String color,int length){
        super( carPrice,color);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        if(length>20){
            disco=0.05;
        }else{
            disco=0.1;
        }
        return carPrice -carPrice*disco;
    }
}
class Truck extends Car{
    int weight;
    public Truck(double carPrice,String colour,int weight){
        super(carPrice,colour);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        if(weight>2000){
            disco=0.1;
        }else{
            disco=0.2;
        }
        return carPrice-carPrice*disco;
    }
}
