package com.masai.Demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;
@Entity
class BookLibrary{
    @Id
//   @GeneratedValue(strategy = GenerationType.AUTO)
    private   int book_id;
    private  String name;
    private   String author;
    private   String publication;
    private    String category;
    private   int pages;
    private    int price;
    private    Timestamp created_timestamp;

      public BookLibrary(){

   }
      @Override
      public String toString() {
            return "BookLibrary{" +
                    "book_id=" + book_id +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publication='" + publication + '\'' +
                    ", category='" + category + '\'' +
                    ", pages=" + pages +
                    ", price=" + price +
                    ", created_timestamp=" + created_timestamp +
                    '}';
      }

      public BookLibrary(int book_id,String name, String author, String publication, String category, int pages, int price, String created_timestamp) {
            this.book_id = book_id;
            this.name = name;
            this.author = author;
            this.publication = publication;
            this.category = category;
            this.pages = pages;
            this.price = price;
            this.created_timestamp = Timestamp.valueOf(created_timestamp);
      }


      public int getBook_id() {
            return book_id;
      }

      public void setBook_id(int book_id) {
            this.book_id = book_id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getAuthor() {
            return author;
      }

      public void setAuthor(String author) {
            this.author = author;
      }

      public String getPublication() {
            return publication;
      }

      public void setPublication(String publication) {
            this.publication = publication;
      }

      public String getCategory() {
            return category;
      }

      public void setCategory(String category) {
            this.category = category;
      }

      public int getPages() {
            return pages;
      }

      public void setPages(int pages) {
            this.pages = pages;
      }

      public int getPrice() {
            return price;
      }

      public void setPrice(int price) {
            this.price = price;
      }

      public Date getCreated_timestamp() {
            return created_timestamp;
      }

      public void setCreated_timestamp(Timestamp created_timestamp) {
            this.created_timestamp = created_timestamp;
      }
}



//Book Id : 101,
//        name: "C++",
//        author: "Nitesh",
//        publication: "Rajput Publication",
//        category: "Computer Programming",
//        pages: 1500,
//        price: 240,
//        created_timestamp : 2019-12-11 10:58:37