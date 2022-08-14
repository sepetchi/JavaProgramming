package day32_Constructor;

public class countries {
    public String countryName;
    public int population;
    public double GDP;
    public boolean isDemocratic;
    public String nameOfContinent;

    public countries(String countryName) {
        this.countryName = countryName;
    }

    public countries(String countryName, double GDP) {
        this.countryName = countryName;
        this.GDP = GDP;
    }

    public countries(String countryName, boolean isDemocratic, String nameOfContinent) {
        this.countryName = countryName;
        this.isDemocratic = isDemocratic;
        this.nameOfContinent = nameOfContinent;
    }

    public countries(String countryName, int population, double GDP, boolean isDemocratic) {
        this.countryName = countryName;
        this.population = population;
        this.GDP = GDP;
        this.isDemocratic = isDemocratic;
    }

    public countries(String countryName, int population, double GDP, boolean isDemocratic, String nameOfContinent) {
        this.countryName = countryName;
        this.population = population;
        this.GDP = GDP;
        this.isDemocratic = isDemocratic;
        this.nameOfContinent = nameOfContinent;
    }

    public String toString() {
        return "countries{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", GDP=" + GDP +
                ", isDemocratic=" + isDemocratic +
                ", nameOfContinent='" + nameOfContinent + '\'' +
                '}';
    }
}
