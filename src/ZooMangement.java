import java.util.Scanner;

public class ZooManagement {
    public static void main (String[] args) {

      /*
       int nbrCages=20;
        string zooName="myZoo";
        System.out.println(zooName+" contient "+nbrCages+"cages");*/
    /*
        int nbrCages;
        String zooName;
        System.out.println("donner le nom du zoo");
        Scanner k=new Scanner(System.in);
        zooName=k.nextLine();
        System.out.println("donner le nombres des cages ");
        nbrCages=k.nextInt();
        System.out.println(zooName+" contient "+nbrCages+"  cages");*/
        Zoo myZoo = new Zoo();
        Animal lion = new Animal();
        lion.family = "lll";
        lion.name = "chedi";
        lion.age = 25;
myZoo.nbrCages=10;
myZoo.city="ariana";
myZoo.name="Garina";
myZoo.animals[0]=lion;*/
        Zoo myZoo = new Zoo("hahha", "ariana", 7);
        Animal lion = new Animal("kcsxkkk", "rsxrr", 8, true);
        Animal chien = new Animal("uusxiu", "hsqhk", 6, false);
        Animal gazelle = new Animal("ggfwj", "hxshppp", 7, false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(chien);
        myZoo.addAnimal(gazelle);
        myZoo.displayAnimals();
        int mm=myZoo.searchAnimal(gazelle);
        System.out.println(mm);
    }
}