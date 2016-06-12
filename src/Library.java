public class Library {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //1st letter, 2nd array of books;
    private Books[][] booksByName;
    private Books[][] booksByAuthor;
    private Books[][] booksByCategory;

    public Library(){

        booksByName = new Books[26][];
        fillDictionary(booksByName);
        booksByAuthor = new Books[26][];
        fillDictionary(booksByAuthor);
        booksByCategory = new Books[26][];
        fillDictionary(booksByCategory);

        createBooks();
    }

    public Books[] findByName(String name){
       return new Books[0];
    }

    public Books[] findByAuthor(String name){
        return new Books[0];
    }

    public Books[] findByCategory(Category category){
        return booksByCategory[category.getId()];
    }

    private void fillDictionary(Books[][] dictionary){
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = new Books[10];
        }
    }

    private void addToLibrary(Books book){
        int position = alphabet.indexOf(book.getName().charAt(0));
        addToStorage(booksByName[position], book);

        position = alphabet.indexOf(book.getAuthor().charAt(0));
        addToStorage(booksByAuthor[position], book);

        addToStorage(booksByCategory[book.getCategory().getId()], book);
    }

    private void addToStorage(Books[] storage, Books book){
        for (int i = 0; i < storage.length; i++) {
            if(storage[i] == null){
                storage[i] = book;
                return;
            }
        }
    }

    private void createBooks(){

        Books b = new Books();
        b.setName("If You Love");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("If You Stay");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Before We Wall");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);


    }

}
