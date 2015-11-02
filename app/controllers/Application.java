package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.Article;
import play.data.Form;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Welcome to Moustafa Elshaabiny's Blogs."));
    }


    public Result addArticle() {
        Article article = Form.form(Article.class).bindFromRequest().get();
        article.save();
        return redirect(routes.Application.index());
    }
}