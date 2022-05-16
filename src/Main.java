public class Main {
    public static void main(String[] args) {
LoafOfBread loafOfBread1 = new LoafOfBread();
loafOfBread1.LoafOfBreadMes();
loafOfBread1.setName("Буханка");
loafOfBread1.setMassa(200);
loafOfBread1.setPrice(20);
System.out.println(loafOfBread1);

System.out.println("--------------");

Pita pita1 = new Pita();
pita1.PitaMes();
pita1.setName("Элитный лаваш из Дилижана");
pita1.setMassa(100);
pita1.setPrice(25);
System.out.println(pita1);

System.out.println("---------------");

Baguette baguette1 = new Baguette();
baguette1.BaguetteMes();
baguette1.setName("Провансальский багет");
baguette1.setMassa(200);
baguette1.setDlinna(30);
baguette1.setNumberOfPieces(10);
baguette1.setPrice(36);
System.out.println(baguette1);

System.out.println("---------------");

Cake cake = new Cake();
cake.CakeMes();
cake.setName("Лепешка в тандыре");
cake.setMassa(200);
cake.setRadius(15);
cake.setPrice(25);
System.out.println(cake);

    }
}
