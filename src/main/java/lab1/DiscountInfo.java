package lab1;

public class DiscountInfo {
    private boolean isDiscount;
    private boolean isPremium;

    public DiscountInfo setDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;

        return this;
    }

    public DiscountInfo setPremium(boolean isPremium) {
        this.isPremium = isPremium;

        return this;
    }

    public String getDiscountInfo() {
        String info = "";

        if (this.isDiscount || this.isPremium) {
            info = "Możesz kupić samochód!";
        }

        if (this.isDiscount) {
            info += " Masz zniżkę.";
        }
        
        if (!this.isPremium && !this.isDiscount) {
            info = "Zakup samochodu trzeba odłożyć na później....Zniżki na samochód nie ma.";
        }

        return info;
    }
}
