public class Book {
        String title;
        boolean borrowed;

        // Creates a new Book
        public Book(String bookTitle) {
            this.title = bookTitle;
        }

        // Marks the book as rented
        public void borrowed() {
            this.borrowed = true;
            //System.out.println("The book is rented");
        }

        // Marks the book as not rented
        public void returned() {
            this.borrowed = false;
            //System.out.println("Book has been returned");
        }

        // Returns true if the book is rented, false otherwise
        public boolean isBorrowed() {
            if(this.borrowed){
                return true;
            }
            return false;
        }

        // Returns the title of the book
        public String getTitle() {
            return this.title;
        }
      
}

