public class Library {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //1st letter, 2nd array of books;
    private Books[][] booksByName;
    private Books[][] booksByAuthor;
    private Books[][] booksByCategory;

    int index = 0;

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
        int pos = alphabet.indexOf(name.charAt(0));
        Books[] result = new Books[100];
        int i = 0;
        for(Books book : booksByName[pos]){
            if(book != null && book.getName().contains(name)){
                result[i++] = book;
            }
        }
        return result;
    }


    public Books[] findByAuthor(String name){
        int pos = alphabet.indexOf(name.charAt(0));
        Books[] result = new Books[100];
        int i = 0;
        for(Books book : booksByAuthor[pos]){
            if(book != null && book.getAuthor().contains(name)){
                result[i++] = book;
            }
        }
        return result;
    }

    public Books[] findByCategory(Category category){
        Books[] result = new Books[5];
        Books[] byCategory = booksByCategory[category.getId()];
        int j = 0;
        for (int i = (5*index); i < (5*index) + 5; i++) {
            result[j++] = byCategory[i];
        }
        index ++;

        return result;
    }

    private void fillDictionary(Books[][] dictionary){
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = new Books[100];
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

        b = new Books();
        b.setName("Before We Wall");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Before We Wall");
        b.setAuthor("Courtney");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Before We");
        b.setAuthor("Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Before");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("We Wall");
        b.setAuthor("Courtney");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Wall");
        b.setAuthor("Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Asdf");
        b.setAuthor("Courtney Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Zxcv");
        b.setAuthor("Courtney");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Qwer");
        b.setAuthor("Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Berforeee");
        b.setAuthor("Courtney");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

        b = new Books();
        b.setName("Biii");
        b.setAuthor("Cole");
        b.setCategory(Category.FICTION);
        addToLibrary(b);

    }

}
