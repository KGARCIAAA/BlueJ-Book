/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Katherine Garcia.)
 * @version (September 28, 2023.)
 */
public class Book
{
    // The fields.
    // gives me the authors name
    private String author;
    //gives me the title of the book
    private String title;
    //pages stores the # of pages in the book
    private int pages;
    // stores a reference number for a library
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookrefNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    /**
     * return the author name
    */
    public String getAuthor()
    {
        return author;
    }
    /**
     * return the book title name
    */
    public String getTitle()
    {
        return title;
    }
    /**
     * Add pages method
     */
    public int getPages()
    {
        return pages;
    }
    /**
     * Print a book author to terminal window
     */ 
    public void printAuthor()
    { 
        System.out.println(author);
    }
    /**
     * Print book title to terminal window
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    /**
     * To answer question: 2.86 Are the Book objects you have implemented
     * immutable?
     * No, the object created are not immutable because its state can be 
     * modified after it has been created. 
     * Because with every change, the object overwrites what was stored, it
     * is not immutable. 
     */
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if (refNumber != null && refNumber.length() > 0)
        {
            System.out.println("Ref number" + refNumber);
        } else {
            System.out.println("zzz");
        }
    }
    public void setRefNumbber(String ref)
    {
        refNumber = ref;
    }
    public String getRefNumber()
    {
        return refNumber;
    }
}
