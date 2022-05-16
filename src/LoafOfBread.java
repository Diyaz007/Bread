public class LoafOfBread {
    private  String name;
private double massa;
private int price;

    void baked(){
        System.out.println("*Испекли");
    }
    void packed(){
        System.out.println("*Упаковали");
    }
    void introductionLoafOBread(){
        System.out.println("Будем печь буханку хлеба");
    }
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        String message = "Тип: Булка" +
                "\nНазвание: "+getName() +
                "\nВес: " + getMassa() +
                "\nЦена: "+ getPrice();
        return message;
    }
    void LoafOfBreadMes(){
        introductionLoafOBread();
        baked();
        packed();
    }
}
