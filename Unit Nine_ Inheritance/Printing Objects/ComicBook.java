public class ComicBook extends Book
{
    private String series;
    
    public ComicBook(String name, int pages, String series){
        super(name, pages);
        this.series = series;
    }
    
    @Override
    public String getName(){
        return series + ": " + super.getName();
    } 
    
    @Override
    public String getSeries(){
        return series;
    }
}