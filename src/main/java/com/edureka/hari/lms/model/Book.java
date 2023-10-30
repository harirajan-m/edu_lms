package com.edureka.hari.lms.model;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "genre_id")
    private Genre genre;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "library_branch_id")
	private LibraryBranch libraryBranch;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "card_no")
	private Borrower borrower;

	public Book() {
		super();
	}

	public Book(Long id, String title, String isbn, Author author, Genre genre, LibraryBranch libraryBranch, Borrower borrower) {
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.genre = genre;
		this.libraryBranch = libraryBranch;
		this.borrower = borrower;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public LibraryBranch getLibraryBranch() {
		return libraryBranch;
	}

	public void setLibraryBranch(LibraryBranch libraryBranch) {
		this.libraryBranch = libraryBranch;
	}

	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
}

