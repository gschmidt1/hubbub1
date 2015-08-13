package edu.acc.j2ee.hubbub1;

import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {
    
    public static final String CONTENT1 = "My wonky Twonky server finally conked out.";
    public static final String CONTENT2 = "I see good reason not to configure a Twonky server";
    public static final String CONTENT3 =  "I'm white-hat hacking my wonky Twonky server.";
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //user
        ArrayList<User> users = new ArrayList<>();
        User jd = new User("johndoe", new Date(113, 4, 9));
        User jj = new User("jilljack", new Date(113, 9, 31));
        users.add(jd);
        users.add(jj);
        sce.getServletContext().setAttribute("users", users);
        //post
        ArrayList<Post> posts = new ArrayList<>();
        Post p1 = new Post(CONTENT1, new Date(114, 6, 23), 0);
        Post p2 = new Post(CONTENT2, new Date(113, 11, 1), 1);
        Post p3 = new Post(CONTENT3, new Date(113, 9, 31), 0);
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        sce.getServletContext().setAttribute("posts", posts);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
