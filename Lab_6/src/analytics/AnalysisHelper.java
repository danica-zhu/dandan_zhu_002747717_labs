/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getMaxLikeCommentPost(){
        DataStore data = DataStore.getInstance();
        Map<Integer, Comment> comments = data.getComments();
        Comment commentWithMaxLikes = null;
        
        for (Comment c : comments.values()) {
            if (commentWithMaxLikes == null) {
                commentWithMaxLikes = c;
            }
            
            if (c.getLikes() > commentWithMaxLikes.getLikes()) {
                commentWithMaxLikes = c;
            }
        }
        int postId = commentWithMaxLikes.getPostId();
        
        System.out.println("Q2 -Post with most likes per comment: " + data.getPosts().get(postId).toString());
    }
    
    public void getMostCommentPost(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Post postWithMostComments = null;
        
        for (Post p : posts.values()) {
            if (postWithMostComments == null) {
                postWithMostComments = p;
            }
            
            if (p.getComments().size() > postWithMostComments.getComments().size()) {
                postWithMostComments = p;
            }
        }
        
        System.out.println("Q3 -Post with most comments: " + postWithMostComments.getPostId());
        
    }
    
    public void getPassiveUsers() {
        DataStore data = DataStore.getInstance();
        
        HashMap<Integer, Integer> postNumbers = new HashMap<Integer, Integer>();
        
        for (Post p : data.getPosts().values()) {
            
            int userId = p.getUserId();
            if (postNumbers.containsKey(userId)) {
                postNumbers.put(userId, postNumbers.get(userId) + 1);
            }
            else {
                postNumbers.put(userId, 1);
            }
            
        }
        
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(postNumbers));
        
        System.out.println("Q4 -:The following users have the least posts: ");
        
        for (int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + ", - Post count: " + postNumbers.get(users.get(i).getId()));
        }
    }
    
    public void getPassiveCommentUsers() {
        DataStore data = DataStore.getInstance();
        
        HashMap<Integer, Integer> commentsNumbers = new HashMap<Integer, Integer>();
        
        for (Comment c : data.getComments().values()) {
            
            int userId = c.getUserId();
            if (commentsNumbers.containsKey(userId)) {
                commentsNumbers.put(userId, commentsNumbers.get(userId) + 1);
            }
            else {
                commentsNumbers.put(userId, 1);
            }
            
        }
        
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(commentsNumbers));
        
        System.out.println("Q5 -:The following users have the least comments: ");
        
        for (int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + ", - comments count: " + commentsNumbers.get(users.get(i).getId()));
        }
    }
    
    public void getPassiveAndActiveOverallUsers() {
        DataStore data = DataStore.getInstance();
        HashMap<Integer, Integer> overalNumbers = new HashMap<Integer, Integer>();
        
        for (Comment c : data.getComments().values()) {
            
            int userId = c.getUserId();
            if (overalNumbers.containsKey(userId)) {
                overalNumbers.put(userId, overalNumbers.get(userId) + 1 + c.getLikes());
            }
            else {
                overalNumbers.put(userId, 1 + c.getLikes());
            }
            
        }
        for (Post p : data.getPosts().values()) {
            
            int userId = p.getUserId();
            if (overalNumbers.containsKey(userId)) {
                overalNumbers.put(userId, overalNumbers.get(userId) + 1);
            }
            else {
                overalNumbers.put(userId, 1);
            }
        }
        
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(overalNumbers));
        
        // for most passive
        System.out.println("Q6 -:The following users have overall been passive : ");
        
        for (int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + ", - overall count: " + overalNumbers.get(users.get(i).getId()));
        }
        
        // for most avtive
        System.out.println("Q7 -:The following users have overall been active : ");
        int start = Math.max(users.size() - 5, 0);//make sure no issue when user less than 5
        for (int i = users.size()-1; i > start; i--) {
            System.out.println(users.get(i) + ", - overall count: " + overalNumbers.get(users.get(i).getId()));
        }
    }
}
