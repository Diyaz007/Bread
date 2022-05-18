public class Cake extends LoafOfBread  {
 private double radius;
void DrawPrints(){
    System.out.println("*Нанесли узоры");
}
void varnish(){
    System.out.println("*Лакировали");
}
void introductionCake(){
    System.out.println("Будем печь лепёшку");
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    void CakeMes(){
    introductionCake();
        baked();
       DrawPrints();
       varnish();
        packed();
    }
    public void checkMassa(){
    if(getMassa()<=0){
        System.out.println("------ВНИМАНИЕ------");
        System.out.println("НЕ ПОКУПАЙТЕ ЭТУ ЛЕПЁШКУ" +
                "\nЭТА ЛЕПЕШКА ПОДДЕЛКА!!!");
    }
    }
    @Override
    public String toString(){
        String message = "Тип: Лепешка" +
                "\nНазвание: "+getName() +
                "\nВес: " + getMassa() +
                "\nРадиус: " + getRadius()+
                "\nЦена: "+ getPrice()+"сом";
        return message;
    }
}
