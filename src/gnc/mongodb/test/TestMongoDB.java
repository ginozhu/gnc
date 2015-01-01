package gnc.mongodb.test;

import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.WriteResult;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import static java.util.concurrent.TimeUnit.SECONDS;


@SuppressWarnings("unused")
public class TestMongoDB {

  public static void main(String[] args) throws UnknownHostException {
//	 To directly connect to a single MongoDB server (note that this will not auto-discover the primary even
//	 if it's a member of a replica set:
/*	MongoClient mongoClient = new MongoClient();
	// or
	MongoClient mongoClient = new MongoClient( "localhost" );
	// or
	MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	// or, to connect to a replica set, with auto-discovery of the primary, supply a seed list of members
	MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),
	                                      new ServerAddress("localhost", 27018),
	                                      new ServerAddress("localhost", 27019)));

	DB db = mongoClient.getDB( "mydb" );*/

    MongoClient mongo = new MongoClient("192.168.33.10", 27017);
    DB db = mongo.getDB("gnc");
    
    DBCollection col = db.getCollection("Persons");
    System.out.println(col.getStats());
    //BasicDBObject document = new BasicDBObject();
    //document.append("name", "Pankaj");
    //document.append("country", "USA");
    DBCursor itr = col.find();
    while (itr.hasNext()) {
    	itr.next();
    	System.out.println(itr.curr().toString());
    }
    
    //WriteResult result = col.insert(document);
    //System.out.println(result.getError());
//    BasicDBObject document = new BasicDBObject();
//    document.append("name", "Pankaj");
//    document.append("country", "USA");
//    
//    WriteResult result = col.insert(document);
//    
//    System.out.println("ID Generated="+document.getObjectId("_id").toString());

  }

}
