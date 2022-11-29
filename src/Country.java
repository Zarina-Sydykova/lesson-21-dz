public enum Country {
    KYRGYZSTAN,
    TAJIKISTAN,
    UZBEKISTAN,
    CHINA,
    USA,
    TURKEY;

    public static Country [] getAllCountry(Country [] countries){

        return countries;
    }
    public static Country findById(int number, Country [] countries){
        for (Country country : countries) {
            if (country.ordinal()==number){
                return country;
            }
        }return null;
    }
    public static Country findByName(String name, Country [] countries){
        for (Country country : countries) {
            if (country.name().equals(name.toUpperCase())){
                return country;
            }
        }
        return null;
    }
}
