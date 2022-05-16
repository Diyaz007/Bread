public class Baguette extends LoafOfBread{
    private double dlinna;
    private int numberOfPieces;
    void BaguetteMes(){
        introductionBag();
        baked();
        Scar();
        Packed2();
        packed();
    }
    void Scar(){
        System.out.println("*Рубцевать");
    }
    void Packed2(){
        System.out.println("*Упаковывать только в экологичный пакет");
    }
    void introductionBag(){
        System.out.println("Будем печь багет");
    }

    public String toString(){
        String message = "Тип: Батон" +
                "\nНазвание: "+getName() +
                "\nВес: " + getMassa() +
                "\nДлинна: "+ getDlinna()+
                "\nКоличество рубцов: "+ getNumberOfPieces()+
                "\nЦена: "+ getPrice();
        return message;
    }

    public double getDlinna() {
        return dlinna;
    }

    public void setDlinna(double dlinna) {
        this.dlinna = dlinna;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }
}
