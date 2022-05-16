public class Pita extends LoafOfBread{
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
                "\nНазвание: "+getName() +
                "\nВес: " + getMassa() +
                "\nЦена: "+ getPrice();
        return message;
    }

}
