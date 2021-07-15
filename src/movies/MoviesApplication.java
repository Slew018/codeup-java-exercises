//package movies;
//
//import util.Input;
//
//public class MoviesApplication {
//    public static void main(String[] args) {
//        System.out.println("What would you like to do?");
//        System.out.println("0 - exit");
//        System.out.println("1 - view all movies");
//        System.out.println("2 - view movies in the animated category");
//        System.out.println("3 - view movies in the drama category");
//        System.out.println("4 - view movies in the horror category");
//        System.out.println("5 - view movies in the sci-fi category");
//        System.out.println("Enter your choice: ");
//
//        Input userInput = new Input();
//        Integer userSelect = userInput.getInt(0, 5);
//        Movie[] allMovies = MoviesArray.findAll();
//        switch (userSelect) {
//            case 0:
//                break;
//            case 1:
//                displayName(allMovies);
//                break;
//            case 2:
//                category(allMovies, "animated");
//                break;
//            case 3:
//                category(allMovies, "drama");
//                break;
//            case 4:
//                category(allMovies, "horror");
//                break;
//            case 5:
//                category(allMovies, "scifi");
//                break;
//        }
//    }
//
//
//    public static void displayName(Movie[] allMovies) {
//        for (Movie movie : allMovies) {
//            String name = movie.getName();
//            System.out.println(name);
//        }
//    }
//
//    public static void category(Movie[] allCategory, String category) {
//        for (Movie movie : allCategory) {
//            String movieCategory = movie.getCategory();
//            System.out.println(movieCategory);
//        }
//    }
//}
