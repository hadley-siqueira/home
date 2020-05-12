public class RegionMatches { 
    public static void main(String[] args) {
    /*
    Esse algoritmo pegará três strings 
    e comparará suas regiões
    */

    String banana = "banana";
    String ana = "ana";
    String ban = "ban";

    System.out.println(banana.regionMatches(1, ana, 0, 3));
    System.out.println(banana.regionMatches(2, ana, 1, 2));
    }
}
