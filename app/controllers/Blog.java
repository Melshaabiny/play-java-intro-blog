package controllers;

/**
 * Created by MoustafaElshaabiny on 11/1/15.
 */

import models.Article;
import play.data.Form;
import play.mvc.*;

import java.util.List;


public class Blog extends Controller{
    // Route: Get /blogs
    // Lists all blog entries
    public Result index(){
        List<Article> articles = Article.find.all();
        return ok(views.html.blog.index.render(articles));
    }

    // Route: Get /blogs/new
    // Displays the form for creating a blog entry.

    public Result form(){
        return ok(views.html.blog.form.render());
    }

    // Route: POST /blogs
    // Creates a blog entry from user request input.
    public Result create(){
        // Retrieve user input and save a new article
        Article article = Form.form(Article.class).bindFromRequest().get();
        article.save();

        return redirect(routes.Blog.show(article.id));
    }

    // Route: GET /blogs/:id
    // Shows the blog entry 'id'
    public Result show(Long id){
        // Query the database for an Article with this id
        Article article = Article.find.byId(id);

        // If the article doesn't exist, then respond with a 404
        if (article==null)
            return notFound("Article not found!\n");
        else
            return ok(views.html.blog.show.render(article));
    }
}
