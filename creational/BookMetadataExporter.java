package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws Exception{
        
        BookMetadataFormatter formatter = create();
        for (Book book : books) {
            formatter.append(book);
        }
        System.out.println(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter create() throws Exception;
}