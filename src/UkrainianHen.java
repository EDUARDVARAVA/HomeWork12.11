public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна — Украина." + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
