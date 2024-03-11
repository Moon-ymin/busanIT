package generic.ex.ex4;

public class Movie implements Media{
    String title;
    String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String getTitle() {
        return title;
    }
    public String getDirector(){
        return director;
    }
}
