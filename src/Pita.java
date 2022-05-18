public class Pita extends LoafOfBread{
    double radius;
    double tolshina;
    void Wrap(){
        System.out.println("*Завернуть");
    }
    void PitaBreadIsReady(){
        System.out.println("Я лаваш, меня испекли");
    }
    void introductionPita(){
        System.out.println("Будем печь лаваш");
    }
    void PitaMes(){
        introductionPita();
        baked();
        PitaBreadIsReady();
        Wrap();
        packed();
    }
    public String toString(){
        String message = "Тип: Лаваш" +
                "\nРадиус: "+getRadius()+
                "\nТолщина: "+getTolshina()+
                "\nНазвание: "+getName() +
                "\nВес: " + getMassa() +
                "\nЦена: "+ getPrice()+"сом";
        return message;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getTolshina() {
        return tolshina;
    }

    public void setTolshina(double tolshina) {
        this.tolshina = tolshina;
    }
}
