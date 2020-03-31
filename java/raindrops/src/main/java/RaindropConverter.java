class RaindropConverter {

    String convert(int number) {
        StringBuffer sb = new StringBuffer();
        if (number % 3 == 0) {
            sb.append("Pling");
        }
        if (number % 5 == 0) {
            sb.append("Plang");
        }
        if (number % 7 == 0) {
            sb.append("Plong");
        }

        if (sb.length() > 0) {
            return sb.toString();
        } else {
            return String.valueOf(number);
        }
    }

}
