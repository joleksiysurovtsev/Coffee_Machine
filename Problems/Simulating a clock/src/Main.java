class Clock {


    int hours = 12;
    int minutes = 0;

    void next ( ) {
        addMinutes( );
    }


    void addHours ( ) {
        if (hours < 12) {
            hours+=1;
        } else hours = 1;
    }

    void addMinutes ( ) {
        if (minutes < 59) {
            minutes += 1;
        } else {
            addHours( );
            minutes = 0;
        }
    }

}