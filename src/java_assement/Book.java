package java_assement;

// Your imports below:
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Your code below:
public class Book implements Serializable{

    private static final long serialVersionUID = 1L;

    private String title;
    private String author;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(author);
        out.writeUTF(title);
    }

}
