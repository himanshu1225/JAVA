public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    // These are enum constants. public, static, and final

    // when we require limited number of objects.
    Week() {
        System.out.println("Constructor is called " + this);

        // We cannnot create object of enum so contstructor is private or default.
    }

}
