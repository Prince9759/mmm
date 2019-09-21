package prince;
import java.util.Scanner;

public class Player {
    private String bookname;
    private String authorname;
    private int ibsm;

    public Player(String bookname, String authorname, int ibsm){
        this.bookname=bookname;
        this.authorname=authorname;
        this.ibsm=ibsm;

    }
    public String getBookname(){
        return bookname;
    }
    public String getAuthorname(){
        return authorname;
    }

    public int getIbsm(){
        return ibsm;

    }
    public void setBookname(String bookname){
        this.bookname=bookname;
    }
    public  void Authorname(String authorname){
        this.authorname=authorname;
    }


    public void setIbsm(int ibsm){
        this.ibsm=ibsm;
    }
    @Override
    public String toString(){
        return getBookname() + "\t" + getAuthorname() + "\t"+ getIbsm();}
}
