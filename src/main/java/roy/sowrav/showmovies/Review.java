package roy.sowrav.showmovies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")    //Act as a document
@Data       //instead of getter and setter
@AllArgsConstructor     //creating constructor for all variables
@NoArgsConstructor      // No argument constructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
