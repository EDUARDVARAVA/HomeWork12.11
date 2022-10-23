public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }
    @Override
    String getDescription() {
        return super.getDescription() +" Моя страна — Россия." + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}