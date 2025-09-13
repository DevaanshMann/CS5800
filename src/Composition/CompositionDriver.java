//Devaansh Mann
//CS 5800 - Homework 1

package Composition;

public class CompositionDriver {
    public static void main(String[] args) {
        // Root folder
        Folder phpDemo1 = new Folder("php_demo1");

        // Source Files
        Folder source = new Folder("Source Files");
        phpDemo1.addSubFolder(source);

        Folder includePath = new Folder("Include Path");
        phpDemo1.addSubFolder(includePath);

        Folder removeFiles = new Folder("Remove Files");
        phpDemo1.addSubFolder(removeFiles);

        // .phalcon (folder under Source Files)
        Folder Phalcon = new Folder(".phalcon");
        source.addSubFolder(Phalcon);

        // app (with subfolders)
        Folder app = new Folder("app");
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));
        source.addSubFolder(app);

        // cache and public
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        source.addSubFolder(cache);
        source.addSubFolder(publicFolder);

        // Files directly under Source Files
        source.addFile(new File(".htaccess"));
        source.addFile(new File(".htrouter.php"));
        source.addFile(new File("index.html"));

        // Print structure (entire)
        phpDemo1.print("");

        // === Delete 'app' section and print
        source.removeSubFolder("app");
        System.out.println("\n After Deleting 'app' Folder \n");
        phpDemo1.print("");

        // Delete 'public' section and print
        source.removeSubFolder("public");
        System.out.println("\n After Deleting 'public' Folder \n");
        phpDemo1.print("");
    }
}
