package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by MoustafaElshaabiny on 10/31/15.
 */
@Entity
public class Article extends Model{
    @Id // Primary key
    public String id;
    public String title;
    public String body;


}
