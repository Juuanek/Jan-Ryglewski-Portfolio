public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel < 0){
            this.tonerLevel = -1;
        } else if (tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerArgument){
        if (tonerLevel + tonerArgument > 100){
            return -1;
        } else if (tonerLevel + tonerArgument < 0){
            return -1;
        } else {
            return this.tonerLevel += tonerArgument;
        }
    }

    public int printPages(int pagesToPrint){
        if (duplex) {
            System.out.println("duplex printer");
            int pages = (pagesToPrint / 2) + (pagesToPrint % 2);
            pagesPrinted += pages;
            return pages;
        } else if (!duplex) {
            System.out.println("Not a duplex printer");
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            return -1;
        }
    }
}
