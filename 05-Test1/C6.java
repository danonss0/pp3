public class C6 {
    String title;
    int pages;
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        if(pages>=0) this.pages = pages;
    }
    
    
}
