
public class Launcher {

    public static void main(String[] args) {
        Library lib = new Library();
        for(Books book : lib.findByCategory(Category.FICTION)){
            if(book != null){
                System.out.println(book.getName());
            }
        }
        for(Books book: lib.findByName("If You Love")){
            if(book != null){
                System.out.println(book.getName());
            }
        }


    }

}
