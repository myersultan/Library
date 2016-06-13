
public class Launcher {

    public static void main(String[] args) {
        Library lib = new Library();
        for(Books book : lib.findByCategory(Category.FICTION)){
            if(book != null){
                System.out.println("first: " + book.getName());
            }
        }

        for(Books book : lib.findByCategory(Category.FICTION)){
            if(book != null){
                System.out.println("second: " + book.getName());
            }
        }

        for(Books book : lib.findByCategory(Category.FICTION)){
            if(book != null){
                System.out.println("third: " + book.getName());
            }
        }

        for(Books book : lib.findByName("If")){
            if(book != null){
                System.out.println("Search By Name:" + book.getName());
            }
            else{
                System.out.println("No such book");
            }
        }

        for(Books book : lib.findByAuthor("Cole")){
            if(book != null){
                System.out.println("Search by author: " + book.getAuthor());
            }
            else{
                System.out.println("No such author");
            }
        }


    }

}
