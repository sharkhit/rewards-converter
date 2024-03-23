public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * .0035;
    }

    public RewardValue (int miles) {
        this.milesValue = milesValue;
        this.cashValue = miles / .0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
