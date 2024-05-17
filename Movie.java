import java. util. Date;

// class Movie
public class Movie {
  // declaring instance variable
  private int mId;
  private String movieName;
  private String directorName;
  private boolean available;
  private String borrowerName;
  private Date borrowDate;
  private int qty;


  // constructor
  public Movie(int mId, String movieName, String directorName, int qty){
    this.mId = mId;
    this.movieName = movieName;
    this.directorName = directorName;
    this.qty = qty;
  }

  //getter method to return value of instance variable mId
  public int getMovieId(){
    return mId;
  }

  //getter method to return value of movieName
  public String getMovieName(){
    return movieName;
  }

  //getter method to return value of directorName
  public String getDirectorName(){
    return directorName;
  }

  //setter method to assign value to instance variable mId
  public void setMovieId(int mId){
    this.mId = mId;
  }

  //setter method to assign value to movieName
  public void setMovieName(String movieName){
    this.movieName = movieName;
  }

  //setter method to assign value to directorName
  public void setDirectorName(String directorName){
    this.directorName = directorName;
  }

  // print movie information
  public String toString(){
    return " Movie Id: " + mId + "\r\n" + " Movie Title: " + movieName + "\r\n" + " Directed By: "+ directorName;
  }
}
