package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys=new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

       // *********Feature Sun**********
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-12123245kelvin";
    // Planet1
        Planet1 plato=new Planet1();
        plato.color="green";
        plato.name="abracadabra";
        plato.temp="100000000000k";
        plato.radius="80000000km";

    }
}
