public class Link {
    public int dd;
    public Link next;

    public Link(int dd) {
        this.dd = dd;
    }

    public Link() {
    }

    public void displayLink() {
        System.out.print(dd);
        System.out.print(" ; ");
    }
}
