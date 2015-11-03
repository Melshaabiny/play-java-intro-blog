package controllers;

//import models.Person;
import play.*;
import play.data.Form;
import play.mvc.*;

// The following is the location of the ebean package in Play 2.4
import com.avaje.ebean.Model;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;


public class Application extends Controller {

    public Result index() {
        return ok(index.render("Welcome to Moustafa Elshaabiny's Blogs."));
    }
}