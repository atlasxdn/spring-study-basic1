package hello.core.signleton;

public class StatefulService {

    private int price; //상태 유지
    public void order(String name, int price){
        System.out.println("name  = " + name + " price = " + price);
        this.price = price; // 여기가 문제;
    }
    public int getPrice(){
        return price;
    }
}
