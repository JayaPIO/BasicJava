package Week3Day4;

//import Week3Day5.Date;
//import Week3Day5.Flight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Route{
    String source;
    String destination;

    Route(String source, String destination){
        this.source = source;
        this.destination = destination;
    }

    public String toString(){
        return "{ "+source+" "+ destination+" }";
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int hashCode(){
        return source.hashCode();
    }

    public boolean equals(Object o){
        return destination.equals(((Route) o).getDestination());
    }
}
public class KeyObject {
    public static void addPassenger(Map<Route,Integer> map,Route route){
        if(map.containsKey(route)){
            map.put(route, map.get(route)-1);
            System.out.println("seat reserved");
            System.out.println(map);
        }
        else{
            System.out.println("unsucessful");
        }

    }
    public static void main(String[] args){

        Set<Route> set = new HashSet<>();
        set.add(new Route("jaipur","delhi"));
        set.add(new Route("jaipur","bhiwani"));
        set.add(new Route("bhiwani","jaipur"));
        System.out.println(set);


        Map<Set<Route>,Integer> map = new HashMap<>();


//        map.put(new Route("jaipur","delhi"),10);
//         map.put(new Route("jaipur","delhi"),10);
//         map.put(new Route("delhi","mumbai"),20);
//         System.out.println(map);
//
//         addPassenger(map,new Route("jaipur","delhi"));

        map.put(set,1);
        System.out.println(map);


//        map.put(new Date(1,12,27),new Flight("jaipur","delhi"));
//        map.put(new Date(18,11,25),new Flight("jaipur","Mumbai"));
//        map.put(new Date(8,11,25),new Flight("Banglore","delhi"));
    }
}
