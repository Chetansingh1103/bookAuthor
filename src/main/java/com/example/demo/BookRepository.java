package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {

    HashMap<Book,String> map = new HashMap<>();

    public String getHighestPagesBook(){

        int max = 0;
        String name = "";
        for(Book b : map.keySet()){
            if(b.getPages() > max){
                max = b.getPages();
                name = b.getName();
            }
        }

        return name;
    }

    public void updatePageOfBook(String name, int pages){
        for(Book b : map.keySet()){
            if(b.getName().equals(name)){
                b.setPages(pages);
            }
        }
    }

    //author having the rating greater than x eg: 9

    public int totalBooksRating(int rating){
        int count = 0;

        for(Author a : authorMap.keySet()){
            if(a.getRating() > rating){
                count++;
            }
        }

        return count;
    }
}
