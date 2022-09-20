package com.project;

public class Book {
	 private String id;
	    private String title;
	    private String author;
	    private String publishYear;
	    private String status;
	    
	    public Book() {
	    }
	    
	    public Book(final String id, final String title, final String author, final String publishYear, final String status) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.publishYear = publishYear;
	        this.status = status;
	    }
	    
	    public String getId() {
	        return this.id;
	    }
	    
	    public void setId(final String id) {
	        this.id = id;
	    }
	    
	    public String getTitle() {
	        return this.title;
	    }
	    
	    public void setTitle(final String title) {
	        this.title = title;
	    }
	    
	    public String getAuthor() {
	        return this.author;
	    }
	    
	    public void setAuthor(final String author) {
	        this.author = author;
	    }
	    
	    public String getPublishYear() {
	        return this.publishYear;
	    }
	    
	    public void setPublishYear(final String publishYear) {
	        this.publishYear = publishYear;
	    }
	    
	    public String getStatus() {
	        return this.status;
	    }
	    
	    public void setStatus(final String status) {
	        this.status = status;
	    }

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishYear=" + publishYear
					+ ", status=" + status + "]";
		}
	    
	   
	}

