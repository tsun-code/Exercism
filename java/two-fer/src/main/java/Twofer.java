class Twofer {
    String twofer(String name) {
        String yourname = (name == null) ? "you" : name;
        return "One for " + yourname + ", one for me.";
    }
}