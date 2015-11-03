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
    public Long id;
    public String title;
    public String body;

    public static Finder<Long, Article> find = new Finder<Long, Article>(Article.class);


}
