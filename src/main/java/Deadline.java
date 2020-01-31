public class Deadline extends Task {
    protected String by;

    public Deadline(String description, String by) {
        super(description);
        setType('D');
        setBy(by);
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + getBy() + ")";
    }
}
