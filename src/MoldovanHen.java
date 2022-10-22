public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }
    @Override
    String getDescription() {
        return super.getDescription() +" Моя страна — Молдавия." + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerYearM(){
        return getCountOfEggsPerMonth() * 12;
    }
}
