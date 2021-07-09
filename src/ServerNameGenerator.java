import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] Adjectives = {"Hideous", "Obnoxious", "Panicky", "Putrid", "Smelly", "Ashamed", "Combative", "Homely", "Repulsive", "Unsightly"};

        String[] Nouns = {"Llama", "Blobfish", "Toads", "Armadillo", "Monkey", "Badger", "Panda", "Aardvarks", "Wombats", "Squirrel"};

        System.out.println(generator(Adjectives, Nouns));
        }
        public static String generator(String[] Adjective, String[] Nouns){

        int adjRndm = new Random().nextInt(Adjective.length);
        int nonRndm = new Random().nextInt(Nouns.length);
        return "Your server name is the " + Adjective[adjRndm] + " " + Nouns[nonRndm];

    }
}
