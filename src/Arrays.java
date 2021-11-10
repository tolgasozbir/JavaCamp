public class Arrays {
    public static void main(String[] args) {
        String[] cities =
                {
                        "Istanbul",
                        "Ankara",
                        "Bolu",
                        "Kocaeli"
                };

        //foreach
        for(String city : cities){
            System.out.println(city);
        }

        //for
        for (int i=0; i<cities.length; i++){
            System.out.println(cities[i]);
        }

    }
}
