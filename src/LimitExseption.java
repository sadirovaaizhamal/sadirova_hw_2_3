class LimitException extends Exception{
    private double remainingAmount;
    public double getRemainingAmount() {
        return remainingAmount;
    }
    public LimitException(double message, double remainingAmount) {
        super(String.valueOf(remainingAmount));
        this.remainingAmount=remainingAmount;
    }


}
