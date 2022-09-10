public class Printer {
    String queue = "";
    private int printedPages ;
    private int pagesInQueue ;


    public void append (String name, String text, int pagesCount){
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + pagesCount;
    }
    public void append (String text){
        queue = queue + "\n Документ без имени"+ text;
        pagesInQueue=pagesInQueue + 1;
    }
    public void append (String name, String text){
        queue = queue + "\n" + name + "-" + text;
        pagesInQueue = pagesInQueue +1;

    }
    public void append (String text, int pagesCount){
        queue = queue + "\n Документ без имени - " + text;
        pagesInQueue = pagesInQueue + pagesCount;

    }
    public void clear (){
        pagesInQueue = 0;
        queue = "";
    }
    public void print(){
        printedPages = printedPages + pagesInQueue;
        System.out.println(queue);
        clear();
    }
    public int getPendingPagesCount (){
        return pagesInQueue;
    }
    public int getPrintedPagesCount (){
        return printedPages;
    }

}
