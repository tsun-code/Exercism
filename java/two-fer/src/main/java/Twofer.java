class Twofer {
    String twofer(String name) {
        String output = String.format("One for %s, one for me.", name == null ? "you" : name);
        return output;
    }
}
