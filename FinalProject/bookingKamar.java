class bookingKamar {
    private String tanggalBooking;
    private String tglCheckIn;

    public bookingKamar() {
    }
    
    public bookingKamar(String tanggalBooking, String tglCheckIn) {
        this.tanggalBooking = tanggalBooking;
        this.tglCheckIn = tglCheckIn;
    }

    public String getTglBooking() {
        return this.tanggalBooking;
    }

    public void setTglBooking(String tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public String getTglCheckIn() {
        return this.tglCheckIn;
    }

    public void setTglCheckIn(String tglCheckIn) {
        this.tglCheckIn = tglCheckIn;
    }
}
