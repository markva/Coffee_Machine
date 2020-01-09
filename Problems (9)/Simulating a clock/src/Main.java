class Clock {

    int hours = 12;
    int minutes = 0;

    // the next method here
    public void next() {
        while (minutes < 59) {
            minutes++;
        }
        while (hours < 11) {
            hours++;
        }
        if (hours == 12 && minutes == 59) {
            hours = 1;
            minutes = 0;
            hours++;
        }
    }

    /*public static void main(String[] args) {
        int hours = 10;
        int minutes = 0;

        while (minutes < 59) {
            minutes++;
        }
        while (hours < 11) {
            hours++;
        }
        if (hours == 12 && minutes == 59) {
            hours = 1;
            minutes = 0;
            hours++;
        }
        System.out.println("Stunden: " + hours + " Minuten: " + minutes);
    }*/
}