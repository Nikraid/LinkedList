public class LinkList {
    public Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int dd) {
        Link nextLink = new Link(dd);
        nextLink.next = first;
        first = nextLink;
    }

    public void displayList() {
        System.out.print("Список (от начала до конца): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }


    }


