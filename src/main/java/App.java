import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class App {
	
	public static void main(String[] args) {
		
		
        staticFiles.location("/public");
        
        get("/", (req, res) -> "<html><head><title>Ola mundo</title></head><body><h1>Metune</h1></body></html>");
	}
}