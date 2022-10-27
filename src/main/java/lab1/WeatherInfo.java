package lab1;

public class WeatherInfo {
    private boolean isRaining;
    private boolean isBus;

    public WeatherInfo setRaining(boolean isRaining) {
        this.isRaining = isRaining;

        return this;
    }

    public WeatherInfo setBus(boolean isBus) {
        this.isBus = isBus;

        return this;
    }

    public String getWeatherInfo() {
        String info = "";

        if (this.isRaining && this.isBus) {
            info = "Weź parasol. Dostaniesz się na uczelnie.";
        } else if (this.isRaining && !this.isBus) {
            info = "Nie dostaniesz się na uczelnie.";
        } else if (!this.isRaining && this.isBus) {
            info = "Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody";
        }

        return info;
    }

}
